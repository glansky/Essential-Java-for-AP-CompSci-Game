public class Main {
    public static void main(String[] args){
        Mage myMage = new Mage("Francisco");
        //System.out.println(myMage.agility);
        myMage.showStats();

        Mage myOtherMage = new Mage("Jaana");
        myOtherMage.showStats();

        Fighter myFighter = new Fighter("Dupre");
        myFighter.showStats();

        Fighter myOtherFighter = new Fighter("Sentri");
        myOtherFighter.showStats();
    }
}
