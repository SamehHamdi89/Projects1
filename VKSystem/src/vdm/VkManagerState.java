package vdm;

import static java.lang.Math.floor;


public class VkManagerState implements InvariantCheck{
    
    public int id;
    public int numberInsideTomb;
    public int numberOfOpenTombs;
    public VDMSet allTombs;
    public VDMSet allTourGuides;
    public VDMSequence departureGroups;   
    public VDMSequence generalTombQueue; 				
    public VDMSequence specialTombQueue; 				
    public VDMSequence StagingAreaWaitingqueue; 
    public VDMSequence StagingAreaWaitingQueuetg;
    public VDMMap GuideRegisteration; 			
    public VDMSet tempRg; 									
    public VDMMap tempmap; 								
    public VDMSequence VGGeneral; 							
    public VDMSequence VGSpecial; 							
    public VDMSet Reports; 								
    public VDMSet MedicalTeam; 							
    public VDMSet MedicalReports;					
    public int position;							
    public VDMSet MedicalSituations;      
    public VDMSet GroupsInsideTomb; 
    public VDMSequence TouristDivisionGeneral;
    public VDMSequence TouristDivisionSpecial;
    public VDMSequence tourgroupGeneral;
    public VDMSequence tourgroupSpecial;

    public VkManagerState(int id, int numberInsideTomb, int numberOfOpenTombs, VDMSet allTombs, VDMSet allTourGuides, VDMSequence departureGroups, VDMSequence generalTombQueue, VDMSequence specialTombQueue, VDMSequence StagingAreaWaitingqueue, VDMSequence StagingAreaWaitingQueuetg, VDMMap GuideRegisteration, VDMSet tempRg, VDMMap tempmap, VDMSequence VGGeneral, VDMSequence VGSpecial, VDMSet Reports, VDMSet MedicalTeam, VDMSet MedicalReports, int position, VDMSet MedicalSituations, VDMSet GroupsInsideTomb, VDMSequence TouristDivisionGeneral, VDMSequence TouristDivisionSpecial, VDMSequence tourgroupGeneral, VDMSequence tourgroupSpecial) {
        this.id = id;
        this.numberInsideTomb = numberInsideTomb;
        this.numberOfOpenTombs = numberOfOpenTombs;
        this.allTombs = allTombs;
        this.allTourGuides = allTourGuides;
        this.departureGroups = departureGroups;
        this.generalTombQueue = generalTombQueue;
        this.specialTombQueue = specialTombQueue;
        this.StagingAreaWaitingqueue = StagingAreaWaitingqueue;
        this.StagingAreaWaitingQueuetg = StagingAreaWaitingQueuetg;
        this.GuideRegisteration = GuideRegisteration;
        this.tempRg = tempRg;
        this.tempmap = tempmap;
        this.VGGeneral = VGGeneral;
        this.VGSpecial = VGSpecial;
        this.Reports = Reports;
        this.MedicalTeam = MedicalTeam;
        this.MedicalReports = MedicalReports;
        this.position = position;
        this.MedicalSituations = MedicalSituations;
        this.GroupsInsideTomb = GroupsInsideTomb;
        this.TouristDivisionGeneral = TouristDivisionGeneral;
        this.TouristDivisionSpecial = TouristDivisionSpecial;
        this.tourgroupGeneral = tourgroupGeneral;
        this.tourgroupSpecial = tourgroupSpecial;
        
       VDM.invTest(this);
    }
    
   
/*Functions is done by all */   

    
    
    
/*Functions*/
    
    

/*Check Vaccination*/

public boolean Vaccinated (VaccinationState vaccinationState){
    VDM.preTest(true);
    boolean n;

    if(vaccinationState == VaccinationState.Vaccinated)
        n = true;
    else
        n = false;

    VDM.postTest(vaccinationState == VaccinationState.Vaccinated || vaccinationState == VaccinationState.Not_Vaccinated);

    return n;
}

/*Check Registeration*/

public boolean Registered (StateofVKTGA stateofVKTGA){
    VDM.preTest(true);
    boolean n;

    if(stateofVKTGA == StateofVKTGA.registered)
        n = true;
    else
        n = false;

    VDM.postTest(stateofVKTGA == StateofVKTGA.registered || stateofVKTGA == StateofVKTGA.Not_Registered);

    return n;
}

/*Check Tomb Avaliability*/

public boolean TombAvaliable (TombAvaliablity tombAvaliablity ){
    VDM.preTest(true);
    boolean n;

    if(tombAvaliablity == TombAvaliablity.Open)
        n = true;
    else
        n = false;

    VDM.postTest(tombAvaliablity == TombAvaliablity.Open || tombAvaliablity == TombAvaliablity.Closed);

    return n;
}

/*Check Ticket Type*/

public boolean CheckTicketType (typeofticket Typeofticket  ){
    VDM.preTest(true);
    
    boolean n;

    if(Typeofticket == typeofticket.general)
        n = true;
    else
        n = false;

    VDM.postTest(Typeofticket == typeofticket.general || Typeofticket == typeofticket.general_Special);

    return n;
}





/*Operations*/


/*Start of Sameh Hamdi 182052*/

/*
 - RecordTourGroup operation, RecordTourist, RecordVisitorGroup, AddTourGuideToRegisteredVKTGA, AssignTourGuideToGroup, AssignOwnGuideToGroup
   DivideGroupBasedOnTicketGeneral, DivideGroupBasedOnTicketSpecial, pushGeneralTombQueue, popGeneralTombQueue,isEmptyGeneralTombQueue, pushSpecialTombQueue
   popSpecialTombQueue, isEmptySpecialTombQueue
 - The display functions for the operation
*/


/* General Tomb queue  */

public void pushGeneralTombQueue (Tourist tourist ){  
    VDM.preTest(generalTombQueue.elems().doesNotContain(tourist));
    generalTombQueue = generalTombQueue.concat(new VDMSequence(tourist));      
    VDM.postTest(generalTombQueue.elems().contains(tourist));
}

public Tourist popGeneralTombQueue(){
    VDM.preTest(!generalTombQueue.isEmpty());
    Tourist hd = (Tourist)generalTombQueue.hd(); 
    generalTombQueue = generalTombQueue.tl();
    VDM.postTest(true);
    return hd;
}

public boolean isEmptyGeneralTombQueue(){
    
    VDM.preTest(true);
    boolean empty;

    if(generalTombQueue.isEmpty())
        empty = true;
    else
        empty = false;


    VDM.postTest(true);
    
    return empty;
}

/* Special Tomb Queue */

public void pushSpecialTombQueue (Tourist tourist ){
    VDM.preTest(specialTombQueue.elems().doesNotContain(tourist));
    specialTombQueue =specialTombQueue.concat(new VDMSequence(tourist));
    VDM.postTest(specialTombQueue.elems().contains(tourist));
}

public Tourist popSpecialTombQueue(){
    VDM.preTest(!specialTombQueue.isEmpty());

    Tourist hd = (Tourist) specialTombQueue.hd(); 
    specialTombQueue = specialTombQueue.tl();

    VDM.postTest(true);

    return hd;
}

public boolean isEmptySpecialTombQueue(){
    boolean empty;

    if(specialTombQueue.isEmpty())
        empty = true;
    else
        empty = false;


    VDM.postTest(true);

    return empty;
}


/* Record Tourist */

public void RecordTourist(Tourist tourist){

    VDM.preTest((generalTombQueue.elems().doesNotContain(tourist)) || (specialTombQueue.elems().doesNotContain(tourist)));
    
    if(Vaccinated(tourist.EnVaccinationState))
    {
        if(CheckTicketType(tourist.ticket.Typeofticket))
        {
            pushGeneralTombQueue(tourist);
        }
        else
        {
            pushSpecialTombQueue(tourist);
        }
    }
    
    VDM.postTest((generalTombQueue.elems().contains(tourist)) || (specialTombQueue.elems().contains(tourist)));
}

/*Record Visitor Group*/

public void RecordVisitorGroup(){

    VDM.preTest(!(generalTombQueue.isEmpty()) || !((specialTombQueue.isEmpty())));
    
    Tourist g1;
    Tourist g2;

    while(!isEmptyGeneralTombQueue())
    {
        g1 = popGeneralTombQueue();
        VGGeneral = VGGeneral.concat(new VDMSequence(g1));
    }
    
    while(!isEmptySpecialTombQueue())
    {
        g2 = popSpecialTombQueue();
        VGSpecial = VGSpecial.concat(new VDMSequence(g2));
    }

    VDM.postTest(!(VGGeneral.isEmpty()) || !(VGSpecial.isEmpty()));
        
}

/*Record Tour Group*/

public void RecordTourGroup(){

    VDM.preTest(!VGGeneral.isEmpty() || !VGSpecial.isEmpty());
    
    DivideGroupBasedOnTicketGeneral();
    DivideGroupBasedOnTicketSpecial();
    
    Tourist tgenera2 = null;
    Tourist tgeneral = null;
    
    
    boolean check = false, check1 = false;
    
    int sizeGeneral = TouristDivisionGeneral.len();
    int sizeSpecial = TouristDivisionSpecial.len();
    int count = 1028, c  = 0, checkNoIn = 0;

    TourGuide tg = new TourGuide(count , typeoftourguide.Tourguide, true, Languages.English);;
    TourGuide tg1 = new TourGuide(count + 1000 , typeoftourguide.Tourguide, true, Languages.English);
    
    for(int i = 1 ; i < sizeGeneral; i++)
    {
       tgeneral = (Tourist)TouristDivisionGeneral.index(i);
         
        if(tgeneral.HaveOwnGuide)
        {
            check = true;
        }
        else
        {
            check = false;
        }
    }
    
    for(int i = 1 ; i <= sizeSpecial; i++)
    {
        tgenera2 = (Tourist)TouristDivisionSpecial.index(i);
        
        if(tgenera2.HaveOwnGuide)
        {
            check1 = true;
        }
        else
        {
            check = false;
        }        
        
    }
    
    if(check)
    {
        AddTourGuideToRegisteredVKTGA(tg);
        AssignOwnGuideToGroup(TouristDivisionGeneral, tgeneral, tg);
        count += 1000;
    }
    else
    {
        AssignTourGuideToGroup(TouristDivisionGeneral, tgeneral);
        count += 1000;
    }


    if(check1)
    {
        AddTourGuideToRegisteredVKTGA(tg1);
        AssignOwnGuideToGroup(TouristDivisionSpecial, tgenera2, tg1);
        count += 1000;
    }
    else
    {
        AssignTourGuideToGroup(TouristDivisionSpecial, tgenera2);
        count += 1000;
    }
    
    VDM.postTest(!(tourgroupGeneral.isEmpty()) || !(tourgroupSpecial.isEmpty()));

}

/*Add Tour Guide To Registered VKTGA*/

public void AddTourGuideToRegisteredVKTGA(TourGuide tourGuide){

    VDM.preTest(!(GuideRegisteration.rng().doesNotContain(tourGuide)));

    RegeisteredVKTGA rg1 = new RegeisteredVKTGA(StateofVKTGA.registered);

    tempRg = GuideRegisteration.rng();
    tempRg = new VDMSet(tempRg).union(tempRg);
    tempmap = new VDMMap(new Maplet(rg1, tempRg));
    GuideRegisteration = GuideRegisteration.override(tempmap);

    VDM.postTest(GuideRegisteration == GuideRegisteration.override(tempmap));
}

/*Assign Tour Guide To Group*/

public void AssignTourGuideToGroup(VDMSequence touristGroup, Tourist tourist){

    VDM.preTest(tourgroupGeneral.isEmpty() || tourgroupSpecial.isEmpty());

    int Temp = 0;
    TourGuide tourGuide = null;
        
    for (int i = 0; i < GuideRegisteration.dom().card(); i++) {
        
        RegeisteredVKTGA regeisteredVKTGA = (RegeisteredVKTGA)GuideRegisteration.dom().theSet.get(i);
               
        for(int j = 1; j < GuideRegisteration.rng().card(); j++)
        {
                        
            tourGuide = (TourGuide)GuideRegisteration.rng().theSet.get(j);
             
            if( regeisteredVKTGA.stateofVKTGA == StateofVKTGA.registered && tourGuide.avaliable)
            {
                Temp = j;
                break;
            }
        }
                tourGuide = (TourGuide)GuideRegisteration.rng().theSet.get(Temp);       
                TourGroup tg = new TourGroup(id, touristGroup, tourGuide, tourist.ticket.Typeofticket);
                
                id++;
                                
                if(tourist.ticket.Typeofticket == typeofticket.general)
                {
                    tourgroupGeneral = tourgroupGeneral.concat(new VDMSequence(tg));  
                }
                else
                {
                    tourgroupSpecial = tourgroupSpecial.concat(new VDMSequence(tg)); 
                }
                tourGuide.id *= 19;
                tourGuide.avaliable = false;
    }

    VDM.postTest(true);
}

/*Assign Own Guide To Group*/

public void AssignOwnGuideToGroup(VDMSequence TouristGroup,Tourist tourist, TourGuide tourGuide){
    
   VDM.preTest(tourgroupGeneral.isEmpty() || tourgroupSpecial.isEmpty());
        
    TourGroup tg = new TourGroup(id, TouristGroup, tourGuide, typeofticket.general);
    
    if(tourist.ticket.Typeofticket == typeofticket.general)
    {
         tourgroupGeneral = tourgroupGeneral.concat(new VDMSequence(tg)); 
    }
    else
    {
        tourgroupSpecial = tourgroupSpecial.concat(new VDMSequence(tg));
    }
    
    tourGuide.id *= 10;
    
    tourGuide.avaliable = false;
    
   VDM.postTest(true);
}

/*Divide Group Based On Ticket General*/

public void DivideGroupBasedOnTicketGeneral(){

    VDM.preTest(!VGGeneral.isEmpty());
    
    int size;
    double numberOfGeneralGroups = 0;
    
    size = VGGeneral.len();
    
    if(size % 10 == 0 && size != 10)
    {
        numberOfGeneralGroups = size /10;
    }
    
    else if(size % 10 != 0 && size != 10)
    {
        numberOfGeneralGroups = floor(size/10);
    }
    else
    {
        numberOfGeneralGroups = size;
    }
    
    
    for(int i = 1; i <= numberOfGeneralGroups; i++)
    {
        TouristDivisionGeneral = TouristDivisionGeneral.concat(new VDMSequence(ReturnVGGeneral()));      
    }
    
    VDM.postTest(!(TouristDivisionGeneral.isEmpty()));
    
}

/*Divide Group Based On Ticket Special*/

public void DivideGroupBasedOnTicketSpecial(){
    
    VDM.preTest(!VGSpecial.isEmpty());
    
    int size;
    double numberOfspecialGroups = 0;
    
    size = VGSpecial.len();
    

    if(size % 10 == 0 && size != 10)
    {
        numberOfspecialGroups = size /10;
    }
    else if(size % 10 != 0 && size != 10 && size > 10)
    {
        numberOfspecialGroups = floor(size/10);
    }
    else
    {
        numberOfspecialGroups = size;
    }

    
    for(int i = 1; i <= numberOfspecialGroups; i++)
    {
        TouristDivisionSpecial = TouristDivisionSpecial.concat(new VDMSequence(ReturnVGSpecial())); 
    }
    VDM.postTest(!(TouristDivisionSpecial.isEmpty()));

}



/*Display operations*/


/*To display the tour groups*/

public TourGroup ReturnTourGroupGeneral(){
    VDM.preTest(!tourgroupGeneral.isEmpty());

    TourGroup hd = (TourGroup)tourgroupGeneral.hd();         
    tourgroupGeneral = tourgroupGeneral.tl();

    VDM.invTest((InvariantCheck) this);

    return hd;
}

public TourGroup ReturnTourGroupSpecial(){
    VDM.preTest(!tourgroupSpecial.isEmpty());

    TourGroup hd = (TourGroup)tourgroupSpecial.hd();         
    tourgroupSpecial = tourgroupSpecial.tl();

    VDM.invTest((InvariantCheck) this);

    return hd;
}

/*To display the visitor groups*/

public Tourist ReturnVGGeneral(){
    VDM.preTest(!VGGeneral.isEmpty());

    Tourist hd = (Tourist)VGGeneral.hd();         
    VGGeneral = VGGeneral.tl();

    VDM.postTest(true);

    return hd;
}

public Tourist ReturnVGSpecial(){
    VDM.preTest(!VGSpecial.isEmpty());

    Tourist hd = (Tourist)VGSpecial.hd();         
    VGSpecial = VGSpecial.tl();

    VDM.invTest( this);

    return hd;
}

/*To display all Tourists*/

public void displayTourists(){
    for(int i = 1; i <= generalTombQueue.len(); i++)
    {
        System.out.println(popGeneralTombQueue());
    }
    for(int i = 1; i <= specialTombQueue.len(); i++)
    {
        System.out.println(popSpecialTombQueue());
    }
}

/*To display vistor group general*/

public void displayVistorGroupGeneral(){

    for(int i = 1; i <= VGGeneral.len(); i++)
    {
        System.out.println(ReturnVGGeneral());
    } 
}

/*To display vistor group Special*/

public void displayVistorGroupSpecial(){

    for(int i = 1; i <= VGSpecial.len(); i++)
    {
        System.out.println(ReturnVGSpecial());
    } 
}

/*To display general ticket tourGroups*/

public void displayGeneralTicketTourGroups(){
    for(int i = 1; i <= tourgroupGeneral.len(); i++)
    {
        TourGroup gg = (TourGroup)tourgroupGeneral.index(i);
        System.out.println("The tour group is: \n" + ReturnTourGroupGeneral());
        gg.disp();
    }
}

/*To display general_special ticket tourGroups*/

public void displaygeneral_specialTicketTourGroups(){
        for(int i = 1; i <= tourgroupSpecial.len(); i++)
    {
        TourGroup gg = (TourGroup)tourgroupSpecial.index(i);
        System.out.println("The tour group is: \n" + ReturnTourGroupSpecial());
        gg.disp();
    }
}


/*End of sameh hamdi 182052 operations*/






/*Start of Ahmed Tamer 183945 operations*/




/*Remove tour guide from VKTGA*/

public void RemoveTourGuideToRegisteredVKTGA(TourGuide tgg){

    VDM.preTest((GuideRegisteration.rng().contains(tgg)));
    
    RegeisteredVKTGA rg1 = new RegeisteredVKTGA(StateofVKTGA.Not_Registered);
    tempRg = GuideRegisteration.rng();
    tempRg.difference(new VDMSet (tgg));
    tempmap = new VDMMap(new Maplet(rg1, tempRg));
    GuideRegisteration = GuideRegisteration.override(tempmap);
    
    VDM.postTest((GuideRegisteration.rng().doesNotContain(tgg)));
    VDM.invTest(this);
    
      
}

/*Create medical report*/

public void CreateMedicalReport(MedicalReport medicalReport){
    VDM.preTest(MedicalReports.doesNotContain(medicalReport));
    MedicalReports = MedicalReports.union(new VDMSet(medicalReport));
    VDM.postTest(MedicalReports.contains(medicalReport));
   
}

/*Get daily medical report*/

public MedicalReport GetDailyMedicalReport(Date today){
    
    VDM.preTest(true);
     
    int o = 0; 

    for(int i = 0;i < MedicalReports.card();i++){
         
         MedicalReport mr = (MedicalReport)MedicalReports.theSet.get(i);
        if(mr.date == today){
           o = i;
        }
    }
  
    MedicalReport ma = (MedicalReport)MedicalReports.theSet.get(o);
    
    return ma;
}
         

/*End of Ahmed Tamer 183945 operations*/




/* Start of Abdullah Yasser 183444 operations*/

/*Staging Area Quue*/

public void pushStagingAreaQueue (TourGroup tourGroup ){
    VDM.preTest(StagingAreaWaitingqueue.elems().doesNotContain(tourGroup));
    StagingAreaWaitingqueue = StagingAreaWaitingqueue.concat(new VDMSequence (tourGroup));

    VDM.postTest(StagingAreaWaitingqueue.elems().contains(tourGroup));

}

public TourGroup popStagingAreaQueue(){
    VDM.preTest(StagingAreaWaitingqueue.isEmpty() == false);

    TourGroup hd = (TourGroup) StagingAreaWaitingqueue.hd(); 
    StagingAreaWaitingqueue = StagingAreaWaitingqueue.tl();

    VDM.invTest((InvariantCheck) this);

    return hd;
}

public void pushStagingAreaQueueTG (TourGuide tourGuide ){
    VDM.preTest(StagingAreaWaitingQueuetg.elems().doesNotContain(tourGuide));
    StagingAreaWaitingQueuetg = StagingAreaWaitingQueuetg.concat(new VDMSequence(tourGuide));    
    VDM.postTest(StagingAreaWaitingQueuetg.elems().contains(tourGuide));
}

/*Entrance to tomb*/

public void EntranceToTomb(TourGroup tg, Tomb t){
    
    VDM.preTest(GroupsInsideTomb.doesNotContain(tg));
    if(TombAvaliable(t.tombAvaliablity)){
        if(numberInsideTomb < t.TombCapacity){   
            pushStagingAreaQueueTG(tg.tourGuide);
            GroupsInsideTomb = GroupsInsideTomb.union(new VDMSet(tg));
            t.TombCapacity = t.TombCapacity - 10;
            numberInsideTomb = numberInsideTomb + 10;
        }
        else{
            pushStagingAreaQueue(tg);
        }
    }
    VDM.postTest(GroupsInsideTomb.contains(tg));
}

/*Leave tomb*/

public void LeaveTomb(Tomb tomb, TourGroup tourGroup){
    
    VDM.preTest(GroupsInsideTomb.contains(tourGroup));
    
    GroupsInsideTomb = GroupsInsideTomb.difference(new VDMSet (tourGroup));
    tomb.TombCapacity += 10;
    numberInsideTomb -= 10;
    tomb.tombAvaliablity = TombAvaliablity.Open;
    
    VDM.postTest(!GroupsInsideTomb.contains(tourGroup));
}

/*Get Daily Report*/

public Report GetDailyReport(Date date){
    VDM.preTest(true);
    int o = 0; 

    for(int i = 0; i < Reports.card(); i++)
    {
        Report r = (Report)Reports.theSet.get(i);
        if(r.date == date)
        {
            o = i;
        }
    }   
    
     Report ra = (Report)Reports.theSet.get(o);

     VDM.postTest(true);

return ra;
}



/*End of Abdullah Yasser 183444 operations*/



/*Ramiz Gamal 183971 operations*/



/*Create daily report*/

public void CreateDailyReport(Report todayReport){
    VDM.preTest(Reports.doesNotContain(todayReport));
    Reports = Reports.union(new VDMSet(todayReport));
    VDM.postTest(Reports.contains(todayReport));
}

/*Create medical team*/

public void CreateMedicalTeam(MedicalTeam VaccTeam,MedicalTeam EmergTeam){

   VDM.preTest(MedicalTeam.doesNotContain(VaccTeam)&&MedicalTeam.doesNotContain(EmergTeam));
   
   MedicalTeam = MedicalTeam.union(new VDMSet(VaccTeam));
   MedicalTeam = MedicalTeam.union(new VDMSet(EmergTeam));
   VDM.postTest(MedicalTeam.contains(VaccTeam)&&MedicalTeam.contains(EmergTeam));

}

/*Leave VKsystem*/

public void LeaveVKSystem(TourGroup tg1){
  VDM.preTest(departureGroups.elems().doesNotContain(tg1));
  departureGroups=departureGroups.concat(new VDMSequence(tg1));
  VDM.postTest(departureGroups.elems().contains(tg1));
}


/*End of Ramiz Gamal 183971 operations*/




/*Start of Yahia Othman 143353*/


/*Add Medical Team*/

public void AddMedicalTeam(MedicalTeam medicalTeam){
    VDM.preTest(MedicalTeam.doesNotContain(medicalTeam));
    MedicalTeam = MedicalTeam.union(new VDMSet(medicalTeam));
    VDM.postTest(MedicalTeam.contains(medicalTeam));
}

/*Set Tomb state*/

public void setStateTomb(Tomb tomb, State s){
    
    VDM.postTest(tomb.tombAvaliablity == TombAvaliablity.Open || tomb.tombAvaliablity == TombAvaliablity.Closed);
    
    if(s == State.Maintenance || s == State.Covid_19 || s == State.AtMaximumCapacity)
    {
        tomb.tombAvaliablity = TombAvaliablity.Closed;
        tomb.state = s;
    }
    else if(s == s.Not_Closed)
    {
         tomb.tombAvaliablity = TombAvaliablity.Open;
         tomb.state = s;
    }
        
    VDM.postTest(tomb.tombAvaliablity == TombAvaliablity.Closed || tomb.tombAvaliablity == TombAvaliablity.Open && tomb.state == s);

}

/*Check number of tourist in tomb*/

public int CheckNumberOftouristsInTomb(){
    VDM.preTest(true);

    VDM.postTest(true);

    return numberInsideTomb;
}


/*End of yahia Othman 143353 operations*/



    
@Override 

public boolean inv() {
    return((numberInsideTomb < 50) && (GroupsInsideTomb.card()< 50) && (numberOfOpenTombs == 3));
}
    
}
