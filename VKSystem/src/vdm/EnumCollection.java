package vdm;

enum typeoftourguide {Tourguide,Localguide};
enum StateofVKTGA{registered, Not_Registered};
enum typeofticket{general, general_Special};
enum TombAvaliablity{Open, Closed};
enum State{Maintenance, Covid_19, AtMaximumCapacity, Not_Closed};
enum GeneralTomb{RamsesVII, RamsesIV, RamsesIX, Merenptah, RamsesIII, 
Tausert_Setnakht, SetiII, Siptah, none};
enum SpecialTomb{RamsesV_RamsesVI, SetiI, Tutankhamen, none};
enum AllTombs{RamsesVII, RamsesIV, RamsesIX, Merenptah, RamsesIII, 
Tausert_Setnakht, SetiII, Siptah, RamsesV_RamsesVI, SetiI, Tutankhamen};
enum VaccinationState{Vaccinated, Not_Vaccinated};
enum Languages{English, Arabic, French, Urdu};



public class EnumCollection {

    public typeoftourguide typeoftourguide1;
    public StateofVKTGA stateofVKTGA;
    public typeofticket Typeofticket;
    public TombAvaliablity tombAvaliablity;
    public State state;
    public GeneralTomb generalTomb;
    public SpecialTomb specialTomb;
    public AllTombs allTombs;
    public VaccinationState vaccinationState;
    public Languages languages;
}
