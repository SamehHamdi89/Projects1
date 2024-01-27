package vdm;


public class MedicalReport{
    public MedicalTeam medicalTeam;
    public String Situation;
    public Date date;

    public MedicalReport(MedicalTeam medicalTeam, String Situation, Date date) {
        this.medicalTeam = medicalTeam;
        this.Situation = Situation;
        this.date = date;
    }

    @Override
    public String toString() {
        return "MedicalReport{" + "medicalTeam=" + medicalTeam.toString() + ", Situation=" + Situation + ", date=" + date + '}';
    }
    
    
    


}
