package vdm;


public class TombVisited {
    public VDMSet tombName;

    public TombVisited(VDMSet tombName) {
        this.tombName = tombName;
    }

    @Override
    public String toString() {
        return "TombVisited{" + "tombName=" + tombName + '}';
    }


}
