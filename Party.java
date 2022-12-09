import java.util.ArrayList;

public class Party {
    private Tank tank;
    private Range range;
    private Healer healer;

    Party(){}

    public void addTank(Tank pc){
        tank = pc;
        System.out.println("Tank added to party.");
    }

    public void addRange(Range pc){
        range = pc;
        System.out.println("Range added to party.");
    }

    public void addHealer(Healer pc){
        healer = pc;
        System.out.println("Healer added to party.");
    }

    /**
     * see p. 315
     */
    public void showParty(){
        if(tank == null){
            System.out.println("No tank is assigned in the party!");
        } else {
            System.out.println("Party Tank:");
            tank.showStats();
        }

        if(range == null){
            System.out.println("No range is assigned in the party!");
        } else {
            System.out.println("Party Range:");
            range.showStats();
        }

        if(healer == null){
            System.out.println("No healer is assigned in the party!");
        } else {
            System.out.println("Party Healer:");
            healer.showStats();
        }
    }

    /**
     * see p. 318
     * @return
     */
    public ArrayList<PlayerCharacter> getParty() {
        ArrayList<PlayerCharacter> myParty = new ArrayList<PlayerCharacter>();
        myParty.add((PlayerCharacter) tank);
        myParty.add((PlayerCharacter) range);
        myParty.add((PlayerCharacter) healer);
        return myParty;
    }
}
