/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect.lucru_cu_fisiere;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.Scanner;
import yas.proiect.smart.Turism;
import yas.proiect.smart.Turism;


public class Hotel extends Turism implements Serializable{
   
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
    public String Specificatii(){  /// ACTUALIZARE PT INTERFATA
       StringBuilder result = new StringBuilder(); 
       if (restaurant)
            result.append("Hotelul ").append(nume).append(" are restaurant.\n");
        else result.append("Hotelul ").append(nume).append(" NU are restaurant.\n");

        if (spa)
            result.append("Hotelul ").append(nume).append(" are spa.\n");
        else result.append("Hotelul ").append(nume).append(" NU are spa.\n");

        if (piscina)
            result.append("Hotelul ").append(nume).append(" are piscina.\n");
        else result.append("Hotelul ").append(nume).append(" NU are piscina.\n");

        if (copii)
            result.append("Hotelul ").append(nume).append(" primeste copii.\n");
        else result.append("Hotelul ").append(nume).append(" NU primeste copii.\n");

        if (animale)
            result.append("Hotelul ").append(nume).append(" este petfriendly.\n");
        else result.append("Hotelul ").append(nume).append(" NU este petfriendly.\n");

        return result.toString();
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
    public static void AfisareRating (ArrayList<Hotel> vectorHotel,float rating, boolean piscina){
      
      
      for(Hotel hotel:vectorHotel){
         if(hotel.rating>rating && hotel.piscina==piscina) 
             System.out.println(hotel);
      }
      
  }
   ///--------------------------------------------------------------------LUCRU CU FISIERE------------------------------------------------------------ 
    public static void ScriereBinFis(ArrayList<Hotel> vectorHotel, File fisier){
          try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fisier))) {
            outputStream.writeObject(vectorHotel);
            System.out.println("Datele au fost scrise în fisier.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
     }
    public static ArrayList CitireBinFis( File fisier) throws ClassNotFoundException{
         ArrayList<Object> lista = null;
         try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fisier))) {
            lista = (ArrayList<Object>) inputStream.readObject();
             System.out.println("Datele au fost citite din fisier.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
          
       return lista;
          
     }
    //************************************************************************************************************************************************
    public static void Sterg (File fisier){
        try (FileWriter writer = new FileWriter(fisier, false)) {
            writer.write("");
            System.out.println("Continutul fisierului a fost sters.");        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ScriereTxtFis(ArrayList<Hotel> vectorHotel, File fisier){
        
        Sterg(fisier); //sterg ceea ce aveam inainte pt ca am dat true in parametrii pentru a putea scrie in continuare
        for(int i=0;i<vectorHotel.size();i++){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fisier, true))){
            writer.write(vectorHotel.get(i).nume+"-"+vectorHotel.get(i).rating+ "-"+vectorHotel.get(i).pret[0]+"-"+vectorHotel.get(i).adresa+"-"+vectorHotel.get(i).program[0]+"-"+vectorHotel.get(i).program[1]+"-"+vectorHotel.get(i).nrcamere+"-"+vectorHotel.get(i).piscina+"-"+vectorHotel.get(i).spa+"-"+vectorHotel.get(i).restaurant+"-"+vectorHotel.get(i).animale+"-"+vectorHotel.get(i).copii);
            writer.write("\n");
            
        }catch(IOException e){
            e.printStackTrace();
        }
        }
        System.out.println("Am modificat continutul fisierului");
    }
    public static ArrayList CitireTxtFis(File fisier){
         
        ArrayList<Hotel> lista =  new ArrayList<>();;
         try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fisier))) {
           
            String linie;
           
            
            while ((linie = bufferedReader.readLine()) != null) {
                
                String[] campuri = linie.split("-");
                Hotel hotel = new Hotel(
                        campuri[0], // Nume
                        Float.parseFloat(campuri[1]), // Rating
                        new double[]{ Double.parseDouble(campuri[2])}, // Pret
                        campuri[3], // Adresa
                        new int[]{Integer.parseInt(campuri[4]), Integer.parseInt(campuri[5])}, // prog
                        Integer.parseInt(campuri[6]), // camere
                        Boolean.parseBoolean(campuri[7]), // Piscina
                        Boolean.parseBoolean(campuri[8]), // spa
                        Boolean.parseBoolean(campuri[9]), // restaurant
                        Boolean.parseBoolean(campuri[10]), // copii
                        Boolean.parseBoolean(campuri[11]) // animale
                );

                
                lista.add(hotel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
       return lista;
        
        
    }
    
}
