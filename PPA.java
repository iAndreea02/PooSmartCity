
package ugal.ro.smartcity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PPA extends Turism {
    
    private boolean areAmbulanta;
    public String tipServicii;
    public String[] servicii;

    public PPA() 
    {
        super();
        areAmbulanta = false;
        servicii=new String[]{"Nimic"};
    }

    public PPA(String nume, String adresa, int program[], float rating, double[] pret, boolean areAmbulanta, String[] servicii) 
    {
        super(nume, adresa, program, rating, pret);
        this.areAmbulanta = areAmbulanta;
        this.servicii=servicii;
    }

    public PPA(PPA copie) 
    {
        super(copie);
        areAmbulanta = copie.areAmbulanta;
        servicii=copie.servicii;
    }
    
    public double preturi(String tipServicii)
    {
         Map<String,Double> m =new HashMap<>();
         m.put("Cursuri",pret[0]);
         m.put("Prim Ajutor",pret[1]);
          return m.get(tipServicii);
    }
    
    public void serviciiDorite(int nrCopii, int nrAdulti)
    {
     System.out.println("Ati ales serviciile de prim ajutor de la "+nume+" pentru serviciul de "+tipServicii);
      switch (tipServicii)
        {
            case "Cursuri":
                bill += nrCopii *pret[0] + nrAdulti * pret[0];
                break;
            case "Prim Ajutor":
                System.out.println("Serviciile de Prim Ajutor sunt gratuite.");
                bill=0;
             default:
                System.out.println("Nu avem aceaste servicii.");
        }
      System.out.println("Totalul de plata este a ajuns la valoarea de "+bill+" lei");
     
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "\nAre ambulanta: " + areAmbulanta;
    }
    
     public static void AfisarePret(ArrayList<PPA> vectorPPA,String servicii,double pret)
    {
         for(PPA ppa:vectorPPA)
         {if(ppa.servicii.equals(servicii) && pret<ppa.pret[0]) 
             System.out.println(ppa);}
    }
    
    
}
