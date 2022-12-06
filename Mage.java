public class Mage extends PlayerCharacter {
    // Name
    //public String name;

    // Skill attributes
    //public int strength;
    //public int intelligence;
    //public int agility;
    public int wisdom;

    // Health and magic
    //public int maxHitPoints;
    //public int hitPoints;
    //public int maxMana;
    //public int mana;

    Mage(String newName){
        name = newName;

        strength = 7;
        intelligence = 15;
        agility = 8;
        wisdom = 10;

        strength += (int)(Math.random() * 6 + 1);
        intelligence += (int)(Math.random() * 6 + 1);
        agility += (int)(Math.random() * 6 + 1);
        wisdom += (int)(Math.random() * 6 + 1);

        maxHitPoints = hitPoints = strength;
        maxMana = mana = intelligence + (wisdom * 2);

        System.out.println("A new mage named " + name + " has been created!");
    }

    public void showStats(){
        super.showStats();
        //System.out.println("-------------------------------------");
        System.out.println(name + ", a mage:");
        //System.out.println("    Strength: " + strength);
        //System.out.println("Intelligence: " + intelligence);
        //System.out.println("     Agility: " + agility);
        System.out.println("      Wisdom: " + wisdom);
        //System.out.println("  Hit points: " + hitPoints + " / " + maxHitPoints);
        //System.out.println("        Mana: " + mana + " / " + maxMana);
        System.out.println();
    }
}
