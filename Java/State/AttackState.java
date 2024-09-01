package State;

public class AttackState implements PhaseState{
    public String currPhase(){
        return "Attack phase";
    }

    public void takeAction(){
        System.out.println("Attack");
    }

    public PhaseState endPhase(){
        System.out.println("Ending attack phase");
        return new RealocationState();
    }
}
