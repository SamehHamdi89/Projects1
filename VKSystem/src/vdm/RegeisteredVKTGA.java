package vdm;


public class RegeisteredVKTGA implements InvariantCheck{
    public StateofVKTGA stateofVKTGA;

    public RegeisteredVKTGA() {
    }

    public RegeisteredVKTGA(StateofVKTGA stateofVKTGA) {
        this.stateofVKTGA = stateofVKTGA;
    }

    


 
    


@Override
    public boolean inv() {
        return (stateofVKTGA == StateofVKTGA.registered);
    }
}
