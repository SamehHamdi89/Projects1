package vdm;


public class TourGroup implements InvariantCheck{
    public int id;
    public VDMSequence VisitorGroup;
    public TourGuide tourGuide;
    public typeofticket Typeofticket;

    public TourGroup(int id, VDMSequence VisitorGroup, TourGuide tourGuide, typeofticket Typeofticket) {
        this.id = id;
        this.VisitorGroup = VisitorGroup;
        this.tourGuide = tourGuide;
        this.Typeofticket = Typeofticket;
    }

    
    public Tourist ReturnVisitorGroup()
    {
        Tourist hd = (Tourist)VisitorGroup.hd();         
        VisitorGroup = VisitorGroup.tl();
        
        //System.out.println(VisitorGroup.len());
        
        return hd;
        
        
    }
    
    public void disp()
    {
        for(int i = 1; i <= VisitorGroup.len(); i++ )
        {
            System.out.println(ReturnVisitorGroup());
        }
    }
    
    
    @Override
    public String toString() {
        return "Tour Group id is: "  + id + "\nThe tour Guide id is: " + tourGuide.toString() + "\nTicket type is: " + Typeofticket + "\n" +
                "has vistor group consisting of \n" ;
    }

   
    
    

@Override
    public boolean inv() {
        return (Typeofticket == typeofticket.general || Typeofticket == typeofticket.general_Special);
    }

}
