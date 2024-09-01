package State;

public class RealocationState implements PhaseState {
    public String currPhase(){
        return "Realocation phase";
    }

    public void takeAction(){
        System.out.println("Realocate");
    }

    public PhaseState endPhase(){
        System.out.println("Ending realocation phase");
        return new FortificationState();
    }
}
