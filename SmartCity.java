package ugal.ro.smartcity;
import java.util.ArrayList;

public class SmartCity {

    public static void main(String[] args) {
        
        Spital spital1 = new Spital("Neurologie", "Public", "Spitalul Judetean", "Strada Brailei 117", new int[]{8, 16}, 4.5f, new double[]{100, 150, 200, 80, 120, 180, 90, 110, 160});
       Spital spital0=new Spital();
        Spital spital_copie=new Spital(spital1);
       
        System.out.println("Informatii despre spital:");
        System.out.println(spital1);
       
      
     try {
            spital1.serviciiDorite(1, 2, "Nu");
       } catch (Exception e) {
           System.out.println("Exception: " + e.getMessage());
        }
      
       Clinica clinicaInstance = new Clinica("Clinica Medicala", "Str 456", new int[]{9, 17}, 4.2f, new double[]{120, 90, 150, 200, 80, 160}, "Oftamologie");
       Clinica clinicaInstance1=new Clinica();
       Clinica clinica_copie=new Clinica(clinicaInstance);
       
       System.out.println("Informatii despre Clinica:");
        System.out.println(clinicaInstance);

        try {
            clinicaInstance.serviciiDorite(0, 2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
    }
        
         PPA ppaInstance = new PPA("UVSAR", "Strada Episcop Melchisedec Ștefănescu 1", new int[]{24, 7}, 4.8f, new double[]{50, 0}, true);
         System.out.println("Informatii despre PPA:");
         System.out.println(ppaInstance);
         
        ppaInstance.serviciiDorite("Cursuri", 1, 2);
      

        
}
    
}
