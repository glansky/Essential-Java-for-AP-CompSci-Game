public abstract class PlayerCharacter {
    // Name
    protected String name;

    // Skill attributes
    protected int strength;
    protected int intelligence;
    protected int agility;

    // Health and magic
    protected int maxHitPoints;
    protected int hitPoints;
    protected int maxMana;
    protected int mana;

    // Experience
    protected int xp;
    protected int level;

    /**
     * Player Count (see. p. 311)
     */
    protected static int pcCount = 0;

    PlayerCharacter(){
        System.out.println("PC: A new player character has been created!");
        pcCount++;
    }

    protected static int numPC(){
        return pcCount;
    }

    public void showStats(){
        System.out.println("Here are the stats for, " + name);

        System.out.println("-------------------------------------");
        System.out.println("    Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("     Agility: " + agility);

        System.out.println("  Hit points: " + hitPoints + " / " + maxHitPoints);
        System.out.println("        Mana: " + mana + " / " + maxMana);
    }

    /**
     * суммирует Experience Points (xp) и вычисляет текущий уровень level
     * @param deltaXP
     */
    protected void addXP(int deltaXP){
        if (deltaXP < 0){
            System.out.println("ERROR: Invalid experience delta value");
            return;
        }
        xp += deltaXP;
        level = (int) (xp / 1000) + 1;
    }
}
