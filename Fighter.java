public class Fighter extends PlayerCharacter {
    // Name
    //public String name;

    // Skill attributes
    //public int strength;
    //public int intelligence;
    //public int agility;

    public int constitution;

    // Health and magic
    //public int maxHitPoints;
    //public int hitPoints;
    //public int maxMana;
    //public int mana;

    Fighter(String newName){
        name = newName;

        strength = 15;
        intelligence = 7;
        agility = 8;
        constitution = 10;

        strength += (int)(Math.random() * 6 + 1);
        intelligence += (int)(Math.random() * 6 + 1);
        agility += (int)(Math.random() * 6 + 1);
        constitution += (int)(Math.random() * 6 + 1);

        maxHitPoints = hitPoints = (strength * 2) + (constitution * 2);
        maxMana = mana = 0;

        System.out.println("A new fighter named " + name + " has been created!");
    }

    public void showStats(){
        super.showStats();
        //System.out.println("-------------------------------------");
        System.out.println(name + ", a fighter:");
        //System.out.println("    Strength: " + strength);
        //System.out.println("Intelligence: " + intelligence);
        //System.out.println("     Agility: " + agility);
        System.out.println("Constitution: " + constitution);
        //System.out.println("  Hit points: " + hitPoints + " / " + maxHitPoints);
        //System.out.println("        Mana: " + mana + " / " + maxMana);
        System.out.println();
    }
}
