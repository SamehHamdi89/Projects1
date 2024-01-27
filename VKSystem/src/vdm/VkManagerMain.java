package vdm;

import java.util.Scanner;


public class VkManagerMain {
   
    
    public static void main(String args[])
    {
     
        
    VDMSet v = new VDMSet();
    VDMSequence vv = new VDMSequence();
    VDMMap vvv = new VDMMap();

    TourGuide tg1 = new TourGuide(189, typeoftourguide.Tourguide, true, Languages.English);
    TourGuide tg2 = new TourGuide(289, typeoftourguide.Tourguide, true, Languages.Arabic);
    TourGuide tg3 = new TourGuide(389, typeoftourguide.Tourguide, true, Languages.French);
    TourGuide tg4 = new TourGuide(489, typeoftourguide.Tourguide, true, Languages.Urdu);
    TourGuide tg5 = new TourGuide(589, typeoftourguide.Tourguide, true, Languages.English);

    RegeisteredVKTGA rg1 = new RegeisteredVKTGA(StateofVKTGA.registered);
    RegeisteredVKTGA rg2 = new RegeisteredVKTGA(StateofVKTGA.registered);
    RegeisteredVKTGA rg3 = new RegeisteredVKTGA(StateofVKTGA.registered);
    RegeisteredVKTGA rg4 = new RegeisteredVKTGA(StateofVKTGA.registered);
    RegeisteredVKTGA rg5 = new RegeisteredVKTGA(StateofVKTGA.Not_Registered);     

    VDMMap TourGuideToRegistration  = new VDMMap(new Maplet(rg1, tg1));

    TourGuideToRegistration = TourGuideToRegistration.union(new VDMMap(new Maplet(rg2,tg2)));
    TourGuideToRegistration = TourGuideToRegistration.union(new VDMMap(new Maplet(rg3,tg3)));
    TourGuideToRegistration = TourGuideToRegistration.union(new VDMMap(new Maplet(rg4,tg4)));
    TourGuideToRegistration = TourGuideToRegistration.union(new VDMMap(new Maplet(rg5,tg5)));


    VDMSet ALLTourGuides = new VDMSet(tg1);
    ALLTourGuides = ALLTourGuides.union(new VDMSet(tg2));
    ALLTourGuides = ALLTourGuides.union(new VDMSet(tg3));
    ALLTourGuides = ALLTourGuides.union(new VDMSet(tg4));
    ALLTourGuides = ALLTourGuides.union(new VDMSet(tg5));


    Tomb t1  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.RamsesVII, SpecialTomb.none);
    Tomb t2  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.RamsesIV, SpecialTomb.none);
    Tomb t3  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.RamsesIX, SpecialTomb.none);
    Tomb t4  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.Merenptah, SpecialTomb.none);
    Tomb t5  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.RamsesIII, SpecialTomb.none);
    Tomb t6  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.Tausert_Setnakht, SpecialTomb.none);
    Tomb t7  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.SetiII, SpecialTomb.none);
    Tomb t8  = new Tomb(TombAvaliablity.Open, 50, 500, State.Not_Closed, GeneralTomb.Siptah, SpecialTomb.none);
    Tomb t9  = new Tomb(TombAvaliablity.Open, 50, 750, State.Not_Closed, GeneralTomb.none, SpecialTomb.RamsesV_RamsesVI);
    Tomb t10 = new Tomb(TombAvaliablity.Open, 50, 750, State.Not_Closed, GeneralTomb.none, SpecialTomb.SetiI);
    Tomb t11 = new Tomb(TombAvaliablity.Open, 50, 750, State.Not_Closed, GeneralTomb.none, SpecialTomb.Tutankhamen);


    VDMSequence GeneralTombs = new VDMSequence(t1);
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t2));
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t3));
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t4));
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t5));
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t6));
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t7));
    GeneralTombs = GeneralTombs.concat(new VDMSequence(t8));


    VDMSequence SpecialTombs = new VDMSequence(t9);
    SpecialTombs = SpecialTombs.concat(new VDMSequence(t10));
    SpecialTombs = SpecialTombs.concat(new VDMSequence(t11));


    VDMSet ALLTombss = new VDMSet(t1);
    ALLTombss = ALLTombss.union(new VDMSet(t2));
    ALLTombss = ALLTombss.union(new VDMSet(t3));
    ALLTombss = ALLTombss.union(new VDMSet(t4));
    ALLTombss = ALLTombss.union(new VDMSet(t5));
    ALLTombss = ALLTombss.union(new VDMSet(t6));
    ALLTombss = ALLTombss.union(new VDMSet(t7));
    ALLTombss = ALLTombss.union(new VDMSet(t8));
    ALLTombss = ALLTombss.union(new VDMSet(t9));
    ALLTombss = ALLTombss.union(new VDMSet(t10));
    ALLTombss = ALLTombss.union(new VDMSet(t11));
    
    Ticket ticket    = new Ticket(typeofticket.general, t1);
    Ticket ticket1   = new Ticket(typeofticket.general, t2);
    Ticket ticket2   = new Ticket(typeofticket.general, t3);
    Ticket ticket3   = new Ticket(typeofticket.general, t4);
    Ticket ticket4   = new Ticket(typeofticket.general, t5);
    Ticket ticket5   = new Ticket(typeofticket.general, t6);
    Ticket ticket6   = new Ticket(typeofticket.general, t7);
    Ticket ticket7   = new Ticket(typeofticket.general, t8);
    Ticket ticket8   = new Ticket(typeofticket.general, t1);
    Ticket ticket9   = new Ticket(typeofticket.general, t6);
    Ticket ticket10  = new Ticket(typeofticket.general_Special, t9);
    Ticket ticket11  = new Ticket(typeofticket.general_Special, t10);
    Ticket ticket12  = new Ticket(typeofticket.general_Special, t11);



    Tourist tourist    = new Tourist(182052, VaccinationState.Vaccinated, ticket, false);
    Tourist tourist1   = new Tourist(184052, VaccinationState.Vaccinated, ticket1, false);
    Tourist tourist2   = new Tourist(112052, VaccinationState.Vaccinated, ticket2, false);
    Tourist tourist3   = new Tourist(192052, VaccinationState.Vaccinated, ticket3, false);
    Tourist tourist4   = new Tourist(102052, VaccinationState.Vaccinated, ticket4, false);
    Tourist tourist5   = new Tourist(182152, VaccinationState.Vaccinated, ticket5, false);
    Tourist tourist6   = new Tourist(182032, VaccinationState.Vaccinated, ticket6, false);
    Tourist tourist7   = new Tourist(185452, VaccinationState.Vaccinated, ticket7, false);
    Tourist tourist8   = new Tourist(112452, VaccinationState.Vaccinated, ticket8, false);
    Tourist tourist9   = new Tourist(188952, VaccinationState.Vaccinated, ticket9, false);
    Tourist tourist10  = new Tourist(181952, VaccinationState.Vaccinated, ticket10, false);
    Tourist tourist11  = new Tourist(288952, VaccinationState.Vaccinated, ticket11, false);
    Tourist tourist12  = new Tourist(788952, VaccinationState.Vaccinated, ticket12, false);
    Tourist tourist13  = new Tourist(299052, VaccinationState.Vaccinated, ticket4, true);
    Tourist tourist14  = new Tourist(288152, VaccinationState.Vaccinated, ticket5, true);
    Tourist tourist15  = new Tourist(272052, VaccinationState.Vaccinated, ticket4, true);
    Tourist tourist16  = new Tourist(262152, VaccinationState.Vaccinated, ticket5, true);
    Tourist tourist17  = new Tourist(252052, VaccinationState.Vaccinated, ticket4, true);
    Tourist tourist18  = new Tourist(242152, VaccinationState.Vaccinated, ticket5, true);
    Tourist tourist19  = new Tourist(232052, VaccinationState.Vaccinated, ticket4, true);
    Tourist tourist20  = new Tourist(222152, VaccinationState.Vaccinated, ticket5, true);
    Tourist tourist21  = new Tourist(212052, VaccinationState.Vaccinated, ticket4, true);
    Tourist tourist22  = new Tourist(245152, VaccinationState.Vaccinated, ticket5, true);
    
    
    /*Insertion for testing purpose*/
    MedicalTeam mt = new MedicalTeam(190, "Vaccination team", t11);
    Date d = new Date(18, 1, 2021);
    MedicalReport mr = new MedicalReport(mt, "Covid-19", d);
    TombVisited tombVisited = new TombVisited(ALLTombss);
    Report r = new Report(100, 190, tombVisited, d);
    /**/

    VkManagerState s = new VkManagerState(0, 0, 3, ALLTombss, ALLTourGuides, vv, vv, vv, vv, vv, TourGuideToRegistration, v, vvv, vv, vv, v, v, v, 0, v, v, vv, vv, vv, vv);
       
    
    int option;
    
    Scanner sc = new Scanner(System.in);
    
    do{
        System.out.println("Enter the operation number to perform \n");
        
        System.out.println("\nFrom 1 to 8 Done by sameh hamdi 182052 \n");
        
        System.out.println("1. Record Tourists ");
        System.out.println("2. Record Visitor Groups ");
        System.out.println("3. Record Tour groups ");
        System.out.println("4. Display the Tourists ");
        System.out.println("5. Display the general ticket visitor group");
        System.out.println("6. Display the special ticket visitor group");
        System.out.println("7. Display the general ticket tour groups");
        System.out.println("8. Display the general_Special ticket tour groups");
        
        System.out.println("\nFrom 9 to 11 is Done by Ahmed Tamer 183945 \n");
        
        System.out.println("9. Remove tour guide from VKTGA");
        System.out.println("10. Create medical report");
        System.out.println("11. Get medical report");
        
        System.out.println("\nFrom 12 t0 14 is Done by abdullah yasser 183444 \n");
        
        System.out.println("12. Enter to tomb");
        System.out.println("13. Leave Tomb");
        System.out.println("14. Get Daily Report");
        
        System.out.println("\nFrom 15 to 17 is Done by Ramiz Gamal 183971 \n");
        
        System.out.println("15. Create daily report");
        System.out.println("16. Create Medical Team");
        System.out.println("17. Leave VKSyetem");
        
        System.out.println("\nFrom 18 to 20 Done by Yahia Othman 143353 \n");
        
        System.out.println("18. Add Medical Team");
        System.out.println("19. Set State of Tomb");
        System.out.println("20. Check number of tour groups in tomb");
        
        option  = sc.nextInt();


    switch(option)
    {
    case 1:
        
        s.RecordTourist(tourist);
        s.RecordTourist(tourist1);
        s.RecordTourist(tourist2);
        s.RecordTourist(tourist3);
        s.RecordTourist(tourist4);
        s.RecordTourist(tourist5);
        s.RecordTourist(tourist6);
        s.RecordTourist(tourist7);
        s.RecordTourist(tourist8);
        s.RecordTourist(tourist9);
        s.RecordTourist(tourist10);
        s.RecordTourist(tourist11);
        s.RecordTourist(tourist12);
        s.RecordTourist(tourist13);
        s.RecordTourist(tourist14);
        s.RecordTourist(tourist15);
        s.RecordTourist(tourist16);
        s.RecordTourist(tourist17);
        s.RecordTourist(tourist18);
        s.RecordTourist(tourist19);
        s.RecordTourist(tourist20);
        s.RecordTourist(tourist21);
        s.RecordTourist(tourist22);
        System.out.println("Sucessfully recorded the tourists");
        
     break;

    case 2: 
        
        s.RecordVisitorGroup();
        System.out.println("Successfully recorded the visitor groups");
        
     break;

    case 3:
        
        s.RecordTourGroup();        
        System.out.println("Successsfuly recorded the tour group");
        
    break;

    case 4:
        
        s.displayTourists();   
        
    break;

    case 5:
        
        if(s.VGGeneral.isEmpty())
        {
            System.out.println("No visitor groups found please enter the tourists");
        }
        else
        {
            s.displayVistorGroupGeneral();
        } 
        
    break;

    case 6:
        
        if(s.VGSpecial.isEmpty())
        {
            System.out.println("No visitor groups found please enter the tourists");
        }
        else
        {
            s.displayVistorGroupSpecial();
        }
        
    break;

    case 7:
        
        if(s.tourgroupGeneral.isEmpty())
        {
            System.out.println("No tour groups found please enter the visitor groups");
        }
        else
        {
            s.displayGeneralTicketTourGroups();
        }
        
    break;

    case 8: 
        
        if(s.tourgroupSpecial.isEmpty())
        {
            System.out.println("No tour groups found please enter the visitor groups");
        }
        else
        {
            s.displaygeneral_specialTicketTourGroups();
        }
        
    break;
    
    case 9:
        
        s.RemoveTourGuideToRegisteredVKTGA(tg1);
        System.out.println("Successfully removed tour guide ");
        
    break;
    
    case 10:
        
        s.CreateMedicalReport(mr);
        System.out.println("Medical Report created");
        
    break;
    
    case 11:
        
        System.out.println(s.GetDailyMedicalReport(d));
    
    break;
    
    case 12:
        
        s.EntranceToTomb(s.ReturnTourGroupGeneral(), t9);
        
    break;
    
    case 13:
        
        s.LeaveTomb(t11, s.ReturnTourGroupGeneral());
        
     break;
     
     
    case 14:
        
        System.out.println(s.GetDailyReport(d));
        
    break;
    
    
    case 15:
        
        s.CreateDailyReport(r);
        
    break;
    
    case 16:
        
        s.CreateMedicalTeam(mt, mt);
     
    break;
    
    case 17:
        
        //s.LeaveVKSystem(tg1);
        
    break;
    
    case 18:
        
        s.AddMedicalTeam(mt);
    
    break;
    
    case 19:
        
        s.setStateTomb(t11, State.Covid_19);
        
     break;
     
    case 20:
        
        s.CheckNumberOftouristsInTomb();
        
     break;
    
    default:
        
        System.out.println("Enter a valid number ");
    
    }

}while(option != 0);


    }


}