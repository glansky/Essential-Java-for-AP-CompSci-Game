public class Priest extends PlayerCharacter {
    private int charisma;

    Priest(String newName){
        name = newName;

        strength = 7;
        intelligence = 15;
        agility = 8;
        charisma = 10;

        strength += (int)(Math.random() * 6 + 1);
        intelligence += (int)(Math.random() * 6 + 1);
        agility += (int)(Math.random() * 6 + 1);
        charisma += (int)(Math.random() * 6 + 1);

        xp = 0;
        level = 1;

        calcHPMP();

        System.out.println("FC: A new priest named " + name + " has been created!");
    }

    public void showStats(){
        System.out.println("-------------------------------------");
        System.out.printf("%s, a level %d priest with %d XP:\n",name,level,xp);
        System.out.printf("STR: %d | INT: %d | AGI: %d | CHA: %d | HP: %d / %d | MP: %d / %d\n", strength,intelligence,agility,charisma,hitPoints,maxHitPoints,mana,maxMana);
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
        if (attribute == 3) charisma++;
        calcHPMP();
    }

    /**
     * устанавливает поля maxHitPoints, hitPoints, maxMana, mana в исходное состояние
     */
    private void calcHPMP(){
        maxHitPoints = hitPoints = strength;
        maxMana = mana = intelligence + (charisma * 2);
    }
}
