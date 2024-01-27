package vdm;


public class MedicalTeam{
    public int groupId;
    public String MedicalCase;
    public Tomb tomb;

    public MedicalTeam(int groupId, String MedicalCase, Tomb tomb) {
        this.groupId = groupId;
        this.MedicalCase = MedicalCase;
        this.tomb = tomb;
    }

    @Override
    public String toString() {
        return "MedicalTeam{" + "groupId=" + groupId + ", MedicalCase=" + MedicalCase + ", tomb=" + tomb.toString() + '}';
    }
    
    
    
}
