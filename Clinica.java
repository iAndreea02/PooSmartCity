
package ugal.ro.smartcity;
import java.util.HashMap;
import java.util.Map;

public class Clinica extends Turism {
    
    private String specializare;
    public double[] pret;
    
    public Clinica()
    {
        super();
        specializare="";
    }
    
    public Clinica(String nume, String adresa, int program[], float rating, double[] pret, String specializare) {
        super(nume, adresa, program, rating, pret);
        this.specializare = specializare;
    }

    public Clinica(Clinica copie) {
        super(copie);
        specializare = copie.specializare;
    }
  
     public double preturi(String specializare){
    Map<String,Double> m =new HashMap<>();
    m.put("Oftamologie",pret[0]);
    m.put("ORL",pret[1]);
    m.put("Radiologie",pret[2]);
    m.put("Nutritionist",pret[3]);
    m.put("Pediatrie",pret[4]);
    m.put("Psihoterapie",pret[5]);
        return m.get(specializare);
    }
    
    public void serviciiDorite(int nrCopii, int nrAdulti) throws Exception
    {
        System.out.println("Ati ales serviciile sanitare la: " +nume+" serviciul "+specializare);
        
        if(nrCopii!=0)
        {
             switch (specializare)
                 {
                     case "Oftamologie" -> factura += pret[0];
                     case "ORL" -> factura += pret[1];
                    case "Radiologie" -> factura += pret[2];
                    case "Nutritionist" -> factura += pret[3];
                    case "Pediatrie" -> factura += pret[4];
                    case "Psihoterapie" -> factura += pret[5];
                    default -> System.out.println("Nu avem aceasta specialitate.");
                 }
             factura-=50;
        }
        
        if(nrAdulti!=0)
        {
             switch (specializare)
                 {
                     case "Oftamologie" -> factura += pret[0];
                     case "ORL" -> factura += pret[1];
                    case "Radiologie" -> factura += pret[2];
                    case "Nutritionist" -> factura += pret[3];
                    case "Pediatrie" -> factura += pret[4];
                    case "Psihoterapie" -> factura += pret[5];
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
        
        System.out.println("Factura voastra este de "+factura+" lei.");
        
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nSpecializare: " + specializare;
    }
}
