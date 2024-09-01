package State;

public interface PhaseState {
    public String currPhase();
    public void takeAction();
    public PhaseState endPhase();
}
