package vdm;


public class Tomb implements InvariantCheck{
    public TombAvaliablity tombAvaliablity;
    public int TombCapacity;
    public int cost;
    public State state;  
    public GeneralTomb generalTomb;
    public SpecialTomb specialTomb;

    public Tomb(TombAvaliablity tombAvaliablity, int TombCapacity, int cost, State state, GeneralTomb generalTomb, SpecialTomb specialTomb) {
        this.tombAvaliablity = tombAvaliablity;
        this.TombCapacity = TombCapacity;
        this.cost = cost;
        this.state = state;
        this.generalTomb = generalTomb;
        this.specialTomb = specialTomb;
    }

    @Override
    public String toString() {
        return " TombAvaliablity is: " + tombAvaliablity + ", TombCapacity: " + TombCapacity + ", cost : " + cost + ", state: " + state + ", generalTomb:" + generalTomb + ", specialTomb: " + specialTomb ;
    }

    
    
    

@Override
    public boolean inv() {
        return (TombCapacity < 50);
    }


}
