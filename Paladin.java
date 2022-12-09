public class Paladin extends PlayerCharacter implements Tank,Healer {
    private int wisdom;
    private int constitution;

    Paladin(String newName){
        name = newName;
        strength = 10;
        intelligence = 15;
        agility = 5;
        wisdom = 10;
        constitution = 10;

        strength += Die.roll(6);
        intelligence += Die.roll(6);
        agility += Die.roll(6);
        wisdom += Die.roll(6);
        constitution += Die.roll(6);

        xp = 0;
        level = 1;

        calcHPMP();

        System.out.println("FC: A new paladin named " + name + " has been created!");
    }

    public void showStats(){
        System.out.println("-------------------------------------");
        System.out.printf("%s, a level %d paladin with %d XP:\n",name,level,xp);
        System.out.printf("STR: %d | INT: %d | AGI: %d | WIS: %d | CON: %d | HP: %d / %d | MP: %d / %d\n", strength,intelligence,agility,wisdom,constitution,hitPoints,maxHitPoints,mana,maxMana);
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
        int attribute = (int) (Math.random() * 5);
        if (attribute == 0) strength++;
        if (attribute == 1) intelligence++;
        if (attribute == 2) agility++;
        if (attribute == 3) wisdom++;
        if (attribute == 4) constitution++;
        calcHPMP();
    }

    /**
     * устанавливает поля maxHitPoints, hitPoints, maxMana, mana в исходное состояние
     */
    private void calcHPMP(){
        maxHitPoints = hitPoints = strength + (constitution * 2);
        maxMana = mana = intelligence + (wisdom * 2);
    }
}
