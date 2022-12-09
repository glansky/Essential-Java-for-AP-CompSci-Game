import java.util.ArrayList;

public class Main {
    private static ArrayList<PlayerCharacter> party;

    public static void main(String[] args){
        Party myParty = new Party();
        myParty.addTank(new Fighter("Sentri"));
        myParty.addRange(new Mage("Jaana"));
        myParty.addHealer(new Paladin("Dupre"));

        PlayerCharacter p1 = new Mage("Merlin");

        System.out.println("There are now " + p1.numPC() + " players in the game");

        PlayerCharacter p2 = new Paladin("Francisco");

        System.out.println("There are now " + p1.numPC() + " players in the game");
        System.out.println("There are now " + p2.numPC() + " players in the game");

        System.out.println("There are now " + PlayerCharacter.numPC() + " players in the game");

        // At start of game
        System.out.println("START OF GAME:\n");
        myParty.showParty();

        int turns = 20;
        for (int i = 1; i <= turns; i++){
            for (PlayerCharacter pc : myParty.getParty()){
                if (pc != null) pc.addXP((int) (Math.random() * 1000));
            }
        }

        // At end of game
        System.out.println("END OF GAME:\n");
        myParty.showParty();
    }
}
