
package ugal.ro.smartcity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Clinica extends Turism {
    
    private String specializare;
    public double[] pret;
    public String[] servicii;
    
    public Clinica()
    {
        super();
        servicii=new String[]{"Nimic"};
    }
    
    public Clinica(String nume, String adresa, int program[], float rating, double[] pret, String[] servicii) {
        super(nume, adresa, program, rating, pret);
        this.servicii=servicii;
    }

    public Clinica(Clinica copie) {
        super(copie);
        servicii=copie.servicii;
    }
  
     public double preturi(String specializare){
    Map<String,Double> m =new HashMap<>();
    m.put("Oftamologie",pret[0]);
    m.put("ORL",pret[1]);
    m.put("Radiologie",pret[2]);
    m.put("Nutritionist",pret[3]);
    m.put("Pediatrie",pret[4]);
    m.put("Psihiatrie",pret[5]);
        return m.get(specializare);
    }
    
    public void serviciiDorite(int nrCopii, int nrAdulti) throws Exception
    {
        System.out.println("Ati ales serviciile sanitare la: " +nume+" serviciul "+specializare);
        
        if(nrCopii!=0)
        {
             switch (specializare)
                 {
                     case "Oftamologie" -> bill += pret[0];
                     case "ORL" -> bill += pret[1];
                    case "Radiologie" -> bill += pret[2];
                    case "Nutritionist" -> bill += pret[3];
                    case "Pediatrie" -> bill += pret[4];
                    case "Psihoterapie" -> bill += pret[5];
                    default -> System.out.println("Nu avem aceasta specialitate.");
                 }
             bill-=50;
        }
        
        if(nrAdulti!=0)
        {
             switch (specializare)
                 {
                     case "Oftamologie" -> bill += pret[0];
                     case "ORL" -> bill += pret[1];
                    case "Radiologie" -> bill += pret[2];
                    case "Nutritionist" -> bill += pret[3];
                    case "Pediatrie" -> bill += pret[4];
                    case "Psihoterapie" -> bill += pret[5];
                    default -> System.out.println("Nu avem aceasta specialitate.");
                 }
        }
  
        if(nrCopii<=0 && nrAdulti<=0)
        {
            throw new Exception("Nu ati introdus corect numarul de persoane");
        }
        else if(nrCopii!=0 && nrAdulti<=0)
        {
            throw new Exception("Nu uitati: Copiii nu pot fi lasati singuri!");
        }
        
        System.out.println("Factura voastra este de "+bill+" lei.");
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSpecializare: " + specializare;
    }
    
    public static void AfisareServicii(ArrayList<Clinica> vectorClinica,String servicii,int program)
    {
         for(Clinica clinica:vectorClinica)
         {if(clinica.servicii.equals(servicii) && clinica.program[0]>=program) 
             System.out.println(clinica);}
    }
}
