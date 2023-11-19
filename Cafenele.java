
package turism;


public class Cafenele extends Restaurant
{
 boolean serviciucoffe_to_go ;
 boolean sandwich ;
 boolean servire_rapida;
 
 Cafenele() 
         
 {
 super();
 serviciucoffe_to_go=false;
 sandwich=false;
 servire_rapida=false;
 }
 
 Cafenele(String nume,String adresa,float rating,int program[],boolean terasa,String meniulzilei/*mancare cafenea tip sandwich*/,String bauturi/*cafea,limonada,sucuri apa,frappe*/,double pret[],boolean serviciucoffe_to_go,boolean sandwich,boolean servirerapida)
 {
     super(nume,"  ",adresa,rating,program,0,terasa,false,meniulzilei,"","","",bauturi,false,false,pret);
     this.serviciucoffe_to_go=serviciucoffe_to_go;
     this.sandwich=sandwich;
     this.servire_rapida=servire_rapida;
 }
 Cafenele(Cafenele copie)
 {
 super(copie);
 serviciucoffe_to_go=copie.serviciucoffe_to_go;
 sandwich=copie.sandwich;
 servire_rapida=copie.servire_rapida;
 }

    @Override
    public String toString() {
       return " Cafeneaua "+nume+" situata la adresa "+adresa+" cu un rating de "+rating+" . "+
              " Programul incepe de la "+program[0]+" pana la "+program[1]+" . "+
              " Meniul cu sandwich este "+meniulzilei+" si meniul de cafele/bauturi este "+bauturi;
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
  
    
    
    
    
    
    
    
    
}
