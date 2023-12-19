
package Mancare;

import java.util.ArrayList;
import yas.proiect.smart.Turism;


public class Restaurant extends Turism {

int locurilibere;
 public boolean animaldecompanie;
public boolean persoanefumatoare;
public String tiprestaurant;
public boolean terasa;
public boolean codvestimentar;
String meniulzilei;
String micdejun,pranz,cina;
String bauturi;
//double[]pret=new double[4];

public Restaurant()
{       
super();
locurilibere=0;
animaldecompanie=false;
persoanefumatoare=false;
tiprestaurant=" ";
terasa=false;
codvestimentar=false;
meniulzilei=" ";
micdejun=" ";
pranz=" ";
cina=" ";
bauturi=" ";
}

public Restaurant( String nume,String tiprestaurant, String adresa,float rating, int program[],int locurilibere,boolean terasa,boolean codvestimentar, String meniulzilei,String micdejun,String pranz,String cina,String bauturi,boolean animaldecompanie,boolean persoanefumatoare,double pret[])
{
  super(nume, adresa, program, rating, pret);
   this.locurilibere=locurilibere;
   this.animaldecompanie=animaldecompanie;
   this.persoanefumatoare=persoanefumatoare;
   this.tiprestaurant=tiprestaurant;
   this.terasa=terasa;
   this.codvestimentar=codvestimentar;
   this.meniulzilei=meniulzilei;
   this.micdejun=micdejun;
   this.pranz=pranz;
   this.cina=cina;
   this.bauturi=bauturi;
}
 public Restaurant( Restaurant copie)
{
super(copie);
locurilibere=copie.locurilibere;
animaldecompanie=copie.animaldecompanie;
persoanefumatoare=copie.persoanefumatoare;
tiprestaurant=copie.tiprestaurant;
terasa=copie.terasa;
codvestimentar=copie.codvestimentar;
meniulzilei=copie.meniulzilei;
micdejun=copie.micdejun;
pranz=copie.pranz;
cina=copie.cina;
bauturi=copie.bauturi;
}
public String toString(){

return "\nRestaurantul "+nume+" cu specificul "+tiprestaurant+" situat la adresa "+adresa+" cu rating-ul nu mai putin de "+rating+" are deschiderea la ora "+program[0]+" si se va inchide la ora "+program[1]+ ".\n"+
       " Acesta detine "+locurilibere+" de locuri libere , "+
       " Meniul zilei contine "+meniulzilei+"sau daca doriti avem un meniu diversificat care contine:micdejun "+micdejun+" ,pranz "+pranz+" cina "+cina+
       " si cu bauturi aferente "+bauturi+" .\n\n";

}
public void afiseaza()
{
if(animaldecompanie==true)
        System.out.println(" Restaurantul accepta animale de companie.");
else
        System.out.println(" Restaurantul nu accepta animale de companie.");
if(persoanefumatoare==true)
        System.out.println(" Restaurantul accepta persoane fumatoare.");
else
        System.out.println(" Restaurantul nu accepta persoane fumatoare.");
if(terasa==true)
        System.out.println(" Restaurantul detine terasa.");
else
        System.out.println(" Restaurantul nu detine terasa.");
if(codvestimentar==true)
        System.out.println("Restaurantul accepta persoane cu un cod vestimentar de tip casual sau elegant");
else
        System.out.println("Restaurantul nu accepta persoane cu un cod vestimentar de tip sport sau plaja");

}
   public static void Terasa_codvestimentar(ArrayList<Restaurant> vecRestaurant, boolean terasa, boolean codvestimentar) {
        for (Restaurant restaurant : vecRestaurant) {
            if (restaurant.terasa == terasa && restaurant.codvestimentar == codvestimentar) {
                System.out.println(restaurant);
            }
        }
    }
   
      /////actualizat pt interfata
    public String Afiseazainterfata(){ 
       StringBuilder result = new StringBuilder(); 
       if(animaldecompanie){
             result.append("Acest restaurant  accepta animal de companie.\n");
       }else {
              result.append("Acest restaurant nu acceptaanimal de companie.\n");
       }

       if(persoanefumatoare){
             result.append("Acest restaurant accepta persoanele fumatoare\n");
       }else {
              result.append("Acest restaurant nu accepta persoanele fumatoare.\n");
       }

        if(terasa){
              result.append("Acest restaurant detine terasa.\n");
       }else {
             result.append("Acest restaurant nu detine  terasa.\n");
       }
        if(codvestimentar){
              result.append("Acest restaurant are cod vestimentar.\n");
       }else {
             result.append("Acest restaurant nu are cod vestimentar.\n");
       }
        return result.toString();
   }
}
