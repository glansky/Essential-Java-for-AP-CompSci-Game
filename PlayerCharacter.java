public class PlayerCharacter {
    // Name
    public String name;

    // Skill attributes
    public int strength;
    public int intelligence;
    public int agility;

    // Health and magic
    public int maxHitPoints;
    public int hitPoints;
    public int maxMana;
    public int mana;

    PlayerCharacter(){
        System.out.println("A new player character has been created!");
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
}
