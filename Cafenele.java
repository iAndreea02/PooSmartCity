
package Mancare;

import java.util.ArrayList;


public class Cafenele extends Restaurant
{
 public boolean serviciucoffe_to_go ;
 public boolean sandwich ;
 public boolean servire_rapida;
 
 public Cafenele() 
         
 {
 super();
 serviciucoffe_to_go=false;
 sandwich=false;
 servire_rapida=false;
 }
 
 public Cafenele(String nume,String adresa,float rating,int program[],boolean terasa,String meniulzilei/*mancare cafenea tip sandwich*/,String bauturi/*cafea,limonada,sucuri apa,frappe*/,double pret[],boolean serviciucoffe_to_go,boolean sandwich,boolean servire_rapida)
 {
     super(nume,"  ",adresa,rating,program,0,terasa,false,meniulzilei,"","","",bauturi,false,false,pret);
     this.serviciucoffe_to_go=serviciucoffe_to_go;
     this.sandwich=sandwich;
     this.servire_rapida=servire_rapida; //actualizat
 }
 public Cafenele(Cafenele copie)
 {
 super(copie);
 serviciucoffe_to_go=copie.serviciucoffe_to_go;
 sandwich=copie.sandwich;
 servire_rapida=copie.servire_rapida;
 }

    @Override
    public String toString() {
       return " Cafeneaua "+nume+" situata la adresa "+adresa+" cu un rating de "+rating+" .\n "+
              " Programul incepe de la "+program[0]+" pana la "+program[1]+" .\n "+
              " Meniul cu sandwich este "+meniulzilei+" si meniul de cafele/bauturi este "+bauturi+"\n\n";
    }

  
  public void afiseaza()
  {
    if (serviciucoffe_to_go==true)
          System.out.println("Cafeneaua detine sistem coffe to go ");
    else
          System.out.println("Cafeneau nu detine sistem coffe to go");
    if(sandwich==true)
          System.out.println("Cafeneaua detine sandwich-uri");
    else
          System.out.println("Cafeneaua nu detine sandwich-uri");
    if(servire_rapida==true)
          System.out.println("Cafeneaua detine sistem de servire rapida");
    else
          System.out.println("Cafeneaua nu detine sistem de servire rapida");
  }
  
    
    public static void servire_sandwich(ArrayList<Cafenele> vecCafenele, boolean sandwich, boolean servire_rapida) {
        for (Cafenele cafenele : vecCafenele) {
            if (cafenele.sandwich == sandwich && cafenele.servire_rapida == servire_rapida) {
                System.out.println(cafenele);
            }
        }
    }
        /////actualizat pt interfata
    public String Afiseazainterfata(){ 
       StringBuilder result = new StringBuilder(); 
       if(serviciucoffe_to_go){
             result.append("aceasta cafenea are serviciu coffe to go.\n");
       }else {
              result.append("aceasta cafenea nu are serviciu coffe to go.\n");
       }

       if(sandwich){
             result.append("Aceasta cafenea are sandwich-uri.\n");
       }else {
              result.append("aceasta cafenea nu are sandwich-uri.\n");
       }

        if(servire_rapida){
              result.append("Aceasta cafenea are servire rapida.\n");
       }else {
             result.append("Aceasta cafenea nu are servire rapida.\n");
       }
        return result.toString();
   }
    public String getBauturi() {
        return bauturi;
        
    }
     public String getMeniulZilei() {
        return meniulzilei;
    }
    
    

    
    
    
    
    
    
}
