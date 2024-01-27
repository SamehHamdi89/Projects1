package vdm;


public class Ticket implements InvariantCheck{
    public typeofticket Typeofticket;
    public Tomb tomb;

    public Ticket(typeofticket Typeofticket, Tomb tomb) {
        this.Typeofticket = Typeofticket;
        this.tomb = tomb;
    }

    @Override
    public String toString() {
        return "Typeofticket is: " + Typeofticket + "\nThe tomb is: " + tomb.toString();
    }







@Override
    public boolean inv() {
        return (Typeofticket == typeofticket.general || Typeofticket == typeofticket.general_Special);
    }




}
