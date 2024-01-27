package vdm;

public class Tourist implements InvariantCheck {
    public int id;
    public VaccinationState EnVaccinationState;
    public Ticket ticket;
    public boolean HaveOwnGuide;

    public Tourist(int id, VaccinationState EnVaccinationState, Ticket ticket, boolean HaveOwnGuide) {
        this.id = id;
        this.EnVaccinationState = EnVaccinationState;
        this.ticket = ticket;
        this.HaveOwnGuide = HaveOwnGuide;
    }

    @Override
    public String toString() {
        return "Tourist id is: " + id + " Vaccination State is: " + EnVaccinationState + "\n"
                + "ticket: " + ticket.toString() + " \nHaveOwnGuide=" + HaveOwnGuide + "\n";
    }


    









@Override
    public boolean inv() {
        return (EnVaccinationState == VaccinationState.Vaccinated);
    }


}
