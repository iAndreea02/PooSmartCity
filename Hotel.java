/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect.proiectpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotel extends Turism{
   
   int nrcamere;
   boolean piscina, spa,restaurant, copii, animale;
   
   //---------------------------------------CONSTRUCTORI--------------------------------------------------------------------------------------------------------
  public Hotel(){
       super();
       
       nrcamere=0;
       piscina= false;
       spa= false;
       restaurant= false;
       copii=false;
       animale=false;
       
   }
   
  public Hotel(Hotel c){
       
      super(c);
      
      nrcamere=c.nrcamere;
      piscina=c.piscina;
      spa=c.spa;
      restaurant=c.restaurant;
      copii=c.copii;
      animale=c.animale;
     
              
   }
   
  public Hotel(String nume, float rating, double pret[], String adresa, int program[], int nrcamere, boolean piscina, boolean spa, boolean restaurant, boolean copii, boolean animale){
      super( nume,  adresa, program,  rating, pret);
      this.nrcamere=nrcamere;
      this.piscina=piscina;
      this.spa=spa;
      this.restaurant=restaurant;
      this.copii=copii;
      this.animale=animale;
       
   }
  
   //---------------------------------------SUPRASCRIERE METODA TOSTRING-----------------------------------------------------------------------------------------
  
   public String toString(){
       return "Hotelul "+ nume+" are "+rating+" stele este situat la adresa: "+adresa+ ".\n"+
              "Dispune de "+ nrcamere+" camere.\n "+
              "Se deschide la ora: "+ program[0]+" si se inchide la ora: "+program[1]+".\n"+
              "Pretul mediu este: "+pret[0]+" lei.\n";           
   }
   
   //----------------------------------------METODE--------------------------------------------------------------------------------------------------------------
    
   
   public void afisareSpecificatii(){
       if(restaurant)
            System.out.println("Hotelul "+ nume+" are restaurant.");
       else System.out.println("Hotelul "+ nume+ " NU are restaurant.");
       
       if(spa)
           System.out.println("Hotelul "+nume+" are spa.");
       else System.out.println("Hotelul "+nume+ " NU are spa");
       
       if(piscina)
           System.out.println("Hotelul "+ nume+ " are piscina.");
       else System.out.println("Hotelul "+nume+ " NU are piscina.");
       
       if(copii)
           System.out.println("Hotelul "+ nume+ " primeste copii.");
       else System.out.println("Hotelul "+nume+ " NU primeste copii.");
       
       if(animale)
           System.out.println("Hotelul "+ nume+ " este petfriendly.");
       else System.out.println("Hotelul "+nume+ " NU este petfriendly.");
   }
   public double factura(int nrnopti,int nrAdulti, int nrCopii){
       return nrnopti*(pret[0]*nrAdulti+pret[0]/2*nrCopii);
   }

    public int getNrcamere() {
        return nrcamere;
    }

    public void setNrcamere(int nrcamere) {
        this.nrcamere = nrcamere;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public boolean isCopii() {
        return copii;
    }

    public void setCopii(boolean copii) {
        this.copii = copii;
    }

    public boolean isAnimale() {
        return animale;
    }

    public void setAnimale(boolean animale) {
        this.animale = animale;
    }
   
    
  public ArrayList AfisareDupaOptiune (ArrayList <Hotel> vectorHotel){
      
      return vectorHotel;
  }
  
  public static void AfisareRating (ArrayList<Hotel> vectorHotel,float rating, boolean piscina){
      
      
      for(Hotel hotel:vectorHotel){
         if(hotel.rating>rating && hotel.piscina==piscina) 
             System.out.println(hotel);
      }
      
  }
          
    
    
}
