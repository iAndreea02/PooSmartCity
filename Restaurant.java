
package turism;


public class Restaurant extends Turism {
int locurilibere;
boolean animaldecompanie;
boolean persoanefumatoare;
String tiprestaurant;
boolean terasa;
boolean codvestimentar;
String meniulzilei;
String micdejun,pranz,cina;
String bauturi;
double[]pret=new double[4];

Restaurant()
{       
super();
locurilibere=0;
animaldecompanie=false;
persoanefumatoare=false;
tiprestaurant="";
terasa=false;
codvestimentar=false;
meniulzilei="";
micdejun="";
pranz="";
cina="";
bauturi="";
}

Restaurant( String nume,String tiprestaurant, String adresa,float rating, int program[],int locurilibere,boolean terasa,boolean codvestimentar, String meniulzilei,String micdejun,String pranz,String cina,String bauturi,boolean animaldecompanie,boolean persoanefumatoare,double pret[])
{
   super(rating,adresa,nume,program);
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
Restaurant( Restaurant copie)
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

return "Restaurantul "+nume+" cu specificul "+tiprestaurant+" situat la adresa "+adresa+" cu rating-ul nu mai putin de "+rating+" are deschiderea la ora "+program[0]+" si se va inchide la ora "+program[1]+ ".\n"+
       " Acesta detine "+locurilibere+" de locuri libere , "+
       " Meniul zilei contine "+meniulzilei+"sau daca doriti avem un meniu diversificat care contine:micdejun "+micdejun+" ,pranz "+pranz+" cina "+cina+
       " si cu bauturi aferente "+bauturi+" .";

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

}
