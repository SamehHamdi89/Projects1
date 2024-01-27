package vdm;


public class TourGuide implements InvariantCheck{
    public int id;
    public typeoftourguide Typeoftourguide;
    public boolean avaliable;
    public Languages languages;

    public TourGuide(int id, typeoftourguide Typeoftourguide, boolean avaliable, Languages languages) {
        this.id = id;
        this.Typeoftourguide = Typeoftourguide;
        this.avaliable = avaliable;
        this.languages = languages;
    }

    @Override
    public String toString() {
        return id + ", Typeoftourguide: " + Typeoftourguide + ", Avaliable: " + avaliable + ", Languages=" + languages;
    }

    
    
@Override
    public boolean inv() {
        return (avaliable == true);
    }

}
