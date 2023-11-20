package ugal.ro.smartcity;
import java.util.ArrayList;

public class SmartCity {

    public static void main(String[] args) {
        
        Spital spital1 = new Spital("Neurologie", "Public", "Spitalul Judetean", "Strada Brailei 117", new int[]{5, 17}, 4.5f, new double[]{100, 150, 200, 80, 120, 180, 90, 110, 160});
        Spital spital0=new Spital();
        Spital spital_copie=new Spital(spital1);
        
        ArrayList<Spital> vecSpital = new ArrayList<Spital>();
        vecSpital.add(new Spital("Oftamologie", "Public", "Spitalul CFR", " Strada Alexandru Moruzzi 6", new int[]{8, 17}, 3.8f, new double[]{110, 125, 210, 50, 120, 180, 95, 115, 165}));
        vecSpital.add(new Spital("Chirurgie", "Public", "Spitalul CFR", " Strada Alexandru Moruzzi 6", new int[]{8, 17}, 3.8f, new double[]{110, 125, 210, 85, 120, 180, 95, 115, 165}));
        vecSpital.add(new Spital("Boli Infectioase", "Public", "Spitalul de Boli Infectioase", "  Strada Traian 393", new int[]{8, 17}, 4.0f, new double[]{95, 155, 200, 80, 110, 175, 90, 115, 160}));
        vecSpital.add(new Spital("ORL ", "Public", "Spitalul Judetean", " Strada Brailei 117", new int[]{5, 17}, 4.5f, new double[]{100, 150, 200, 80, 120, 180, 90, 110, 160}));
        vecSpital.add(new Spital("Radiologie", "Public", "Spitalul Militar", "Strada Traian 199", new int[]{0, 24}, 3.7f, new double[]{110, 155, 205, 60, 120, 165, 87, 110, 160}));
        vecSpital.add(new Spital("Neurologie", "Public", "Spitalul Militar", " Strada Traian 199", new int[]{0, 24}, 3.7f, new double[]{110, 155, 205, 60, 120, 165, 87, 110, 160}));
        vecSpital.add(new Spital("Pediatrie", "Public", "Spitalul de Urgenta pentru Copii", " Strada Gheorghe Asachi 2", new int[]{0, 24}, 3.3f, new double[]{100, 110, 210, 85, 125, 140, 90, 110, 160}));
        vecSpital.add(new Spital("Chirurgie", "Public", "Spitalul de Urgenta pentru Copii", "  Strada Gheorghe Asachi 2", new int[]{0, 24}, 3.3f, new double[]{100, 110, 210, 85, 125, 140, 90, 110, 160}));
        vecSpital.add(new Spital("Cardiologie", "Public", "Spitalul de Pneumoftiziologie ", " Strada Radu Negru", new int[]{7, 20}, 4.4f, new double[]{105, 190, 100, 60, 110, 185, 70, 100, 160}));

//       
//        System.out.println("Informatii despre spital:");
//        System.out.println(spital1);
//       
//      
//     try {
//            spital1.serviciiDorite(1, 2, "Nu");
//       } catch (Exception e) {
//           System.out.println("Exception: " + e.getMessage());
//        }
//      
       Clinica clinicaInstance = new Clinica("ProClinic", "Strada Traian 136", new int[]{9, 20}, 4.0f, new double[]{120, 90, 150, 200, 80, 160}, "Oftamologie");
       Clinica clinicaInstance1=new Clinica();
       Clinica clinica_copie=new Clinica(clinicaInstance);
       
       ArrayList<Clinica> vecClinica = new ArrayList<Clinica>();
       vecClinica.add(new Clinica("Clinica Sanavita", "Strada Grădina Veche NR 90", new int[]{9, 19}, 3.1f, new double[]{125, 80, 145, 210, 75, 165}, "Psihiatrie"));
       vecClinica.add(new Clinica("Clinica Sanavita", "Strada Grădina Veche NR 90", new int[]{9, 19}, 3.1f, new double[]{125, 80, 145, 210, 75, 165}, "Nutritionist"));
       vecClinica.add(new Clinica("Clinica Medicover", "Strada Domnească 66", new int[]{8, 20}, 2.8f, new double[]{110, 95, 115, 215, 80, 160}, "ORL"));
       vecClinica.add(new Clinica("Epert Med Centrul Medical Irina", "Strada Crinului 24", new int[]{9, 20}, 2.7f, new double[]{125, 75, 125, 175, 85, 160}, "Pediatrie"));
       vecClinica.add(new Clinica("Epert Med Centrul Medical Irina", "Strada Crinului 24", new int[]{9, 20}, 2.7f, new double[]{125, 75, 125, 175, 85, 160}, "Radiologie"));
       vecClinica.add(new Clinica("ProClinic", "Strada Traian 136", new int[]{9, 20}, 4.0f, new double[]{120, 90, 150, 200, 80, 160}, "ORL"));
       vecClinica.add(new Clinica("Clinica Medicover", "Strada Domnească 66", new int[]{8, 20}, 2.8f, new double[]{110, 95, 115, 215, 80, 160}, "Psihiatrie"));
       vecClinica.add(new Clinica("Clinica Sante", "Bulevardul Siderurgiștilor 35", new int[]{9, 15}, 4.7f, new double[]{120, 95, 155, 210, 75, 165}, "Psihiatrie"));
       vecClinica.add(new Clinica("Clinica Sante", "Bulevardul Siderurgiștilor 35", new int[]{9, 15}, 4.7f, new double[]{120, 95, 155, 210, 75, 165}, "Nutritionist"));
     
       
//       System.out.println("Informatii despre Clinica:");
//        System.out.println(clinicaInstance);
//
//        try {
//            clinicaInstance.serviciiDorite(0, 2);
//        } catch (Exception e) {
//            System.out.println("Exception: " + e.getMessage());
//    }

        
         PPA ppaInstance = new PPA("UVSAR", " Cămin studențesc C-parter, Strada Domnească", new int[]{0, 24}, 4.8f, new double[]{50, 0}, true, "Cursuri");
         PPA ppaInstance1=new PPA();
         PPA ppa_copie=new PPA(ppaInstance);
         
         ArrayList<PPA> vecPPA = new ArrayList<PPA>();
         vecPPA.add(new PPA("UVSAR", " Cămin studențesc C-parter, Strada Domnească", new int[]{0, 24}, 3.4f, new double[]{50, 0}, true,"Prim Ajutor"));
         vecPPA.add(new PPA("SRAU", "Drumul de Centură 39", new int[]{0, 24}, 5.0f, new double[]{75, 0}, true, "Cursuri"));
         vecPPA.add(new PPA("SRAU", "Drumul de Centură 39", new int[]{0, 24}, 5.0f, new double[]{75, 0}, true, "Prim Ajutor"));
         vecPPA.add(new PPA("Asociatia Pentru Ajutor Umanitar - AJUT", "Strada Dunarea 18", new int[]{7, 20}, 3.0f, new double[]{50, 0}, false, "Cursuri"));
         vecPPA.add(new PPA("Asociatia Pentru Ajutor Umanitar - AJUT", "Strada Dunarea 18", new int[]{7, 20}, 3.0f, new double[]{50, 0}, false, "Prim Ajutor"));
         vecPPA.add(new PPA("Societatea Studenților Mediciniști Galați (SSMG)", "Str. Gării, nr. 59-61, Cămin IB - parter", new int[]{7, 20}, 4.8f, new double[]{0, 0}, false, "Prim Ajutor"));
         vecPPA.add(new PPA("Crucea Roşie Galaţi ", "Strada Closca 13", new int[]{0, 24}, 4.8f, new double[]{130, 0}, true,"Cursuri"));
         
//         System.out.println("Informatii despre PPA:");
//         System.out.println(ppaInstance);
//         
//        ppaInstance.serviciiDorite("Cursuri", 1, 2);
//      
        
}
    
}
