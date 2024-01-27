package vdm;


public class Report{
    public int tourGroupId;
    public int tourGuideId;
    public TombVisited tombVisited;
    public Date date;

    public Report(int tourGroupId, int tourGuideId, TombVisited tombVisited, Date date) {
        this.tourGroupId = tourGroupId;
        this.tourGuideId = tourGuideId;
        this.tombVisited = tombVisited;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Report{" + "tourGroupId=" + tourGroupId + ", tourGuideId=" + tourGuideId + ", tombVisited=" + tombVisited.toString() + ", date=" + date + '}';
    }

    
    
    
}
