public class Fighter extends PlayerCharacter implements Tank {
    private int constitution;

    Fighter(String newName){
        name = newName;
        strength = 15;
        intelligence = 7;
        agility = 8;
        constitution = 10;

        strength += Die.roll(6);
        intelligence += Die.roll(6);
        agility += Die.roll(6);
        constitution += Die.roll(6);

        xp = 0;
        level = 1;

        calcHPMP();

        System.out.println("FC: A new fighter named " + name + " has been created!");
    }

    public void showStats(){
        //super.showStats();
        System.out.println("-------------------------------------");
        System.out.printf("%s, a level %d fighter with %d XP:\n",name,level,xp);
        System.out.printf("STR: %d | INT: %d | AGI: %d | CON: %d | HP: %d / %d | MP: %d / %d\n", strength,intelligence,agility,constitution,hitPoints,maxHitPoints,mana,maxMana);
        System.out.println();
    }

    /**
     * добавляет Experience Points (XP), повышает Level за каждые 1000 XP
     * вызывает метод levelUp при переходе на новый уровень
     * @param deltaXP
     */
    public void addXP(int deltaXP){
        int oldLevel = level;
        super.addXP(deltaXP);

        if (oldLevel != level){
            levelUp();
        }
    }

    /**
     * выбирает наугад один из четырёх атрибутов и увеличивает его на 1
     */
    private void levelUp(){
        int attribute = (int) (Math.random() * 4);
        if (attribute == 0) strength++;
        if (attribute == 1) intelligence++;
        if (attribute == 2) agility++;
        if (attribute == 3) constitution++;
        calcHPMP();
    }

    /**
     * устанавливает поля maxHitPoints, hitPoints, maxMana, mana в исходное состояние
     */
    private void calcHPMP(){
        maxHitPoints = hitPoints = (strength * 2) + (constitution * 2);
        maxMana = mana = 0;
    }
}
