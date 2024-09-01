package State;

public class FortificationState implements PhaseState{
    public String currPhase(){
        return "Fortification phase";
    }

    public void takeAction(){
        System.out.println("Fortify");
    }

    public PhaseState endPhase(){
        System.out.println("Ending fortification phase");
        return new AttackState();
    }
}
