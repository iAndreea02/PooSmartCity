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
import java.util.ArrayList;
import static proiect.lucru_cu_fisiere.Hotel.Sterg; // AICI S AR PUTEA SA AI EROARE STERGI SI IMPORTI CEEA CE ITI ZICE DIN CLASA PARINTE HOTEL !!!!
import yas.proiect.smart.Turism;


public class Apartament extends Turism{
  
    int nrcamere;
    int nrlocuri;
    int nrApartament;
    int etaj;
    
    boolean buc, micdejun, aerconditionat;

//------------------------------------------------CONSTRUCTORI---------------------------------------------------
   public Apartament(){
        super();
        
        nrlocuri=0;
        nrcamere=0;
        nrApartament=0;
        etaj=0; 
        buc=false;
        aerconditionat=false;
        micdejun=false;
            
    }
   public Apartament(Apartament c){
        super(c);
        
        nrlocuri=c.nrlocuri;
        nrcamere=c.nrcamere;
        nrApartament=c.nrApartament;
        etaj=c.etaj;
       
        buc=c.buc;
        aerconditionat=c.aerconditionat;
        micdejun=c.micdejun;
        
    } 
   public Apartament(String nume,float rating, double pret[], String adresa,  int program[],int nrlocuri, int nrcamere, int nrApartament, int etaj , boolean buc, boolean aerconditionat, boolean micdejun){
        super( nume,  adresa, program,  rating, pret);
        
        this.nrlocuri=nrlocuri;
        this.nrcamere=nrcamere;
        this.nrApartament=nrApartament;
        this.etaj=etaj;
        
        this.buc=buc;
        this.aerconditionat=aerconditionat;
        this.micdejun=micdejun;
    }
//-------------------------------------------------SUPRASCRIERE METODA TOSTRING------------------------------------------------------
    @Override
    public String toString() {
         return "Apartamentul cu numarul "+nrApartament+" are numele: "+nume+" are rating ul de "+rating+" stelute "+
               " se afla la adresa "+adresa+ " se deschide la ora "+program[0]+ " si se inchide la ora "+program[1]+"\n"+
               "Permite cazarea a "+nrlocuri+ " persoane si are "+nrcamere+ " camere \n"+
               "Se afla la etajul "+etaj+"\n"+
               "Are pretul "+pret[0]+ "lei \n";
    }
 //-------------------------------------------------------METODE----------------------------------------------------------------------   
   
    public void afisareSpecificatii(){
       if(buc){
           System.out.println("Acest apartament are bucatarie.");
       }else {
           System.out.println("Acest apartament NU are bucatarie.");
       }
       
       if(aerconditionat){
           System.out.println("Acest apartament are aer conditionat.");
       }else {
           System.out.println("Acest apartament NU are baer conditionat.");
       }
       
        if(micdejun){
           System.out.println("Daca stati cazati la acest apartament aveti mic de jun inclus in pret.");
       }else {
           System.out.println("Daca stati cazati la acest apartament NU aveti mic de jun inclus in pret.");
       }
   }
    public String Specificatii(){ // ACTUALIZAT PT INTERFATA
       StringBuilder result = new StringBuilder(); 
       if(buc){
             result.append("Acest apartament are bucatarie.\n");
       }else {
              result.append("Acest apartament NU are bucatarie.\n");
       }
       
       if(aerconditionat){
             result.append("Acest apartament are aer conditionat.\n");
       }else {
              result.append("Acest apartament NU are baer conditionat.\n");
       }
       
        if(micdejun){
              result.append("Daca stati cazati la acest apartament aveti mic de jun inclus in pret.\n");
       }else {
             result.append("Daca stati cazati la acest apartament NU aveti mic de jun inclus in pret.\n");
       }
        return result.toString();
   }  
    public int getNrcamere() {
        return nrcamere;
    }
    public void setNrcamere(int nrcamere) {
        this.nrcamere = nrcamere;
    }
    public int getNrlocuri() {
        return nrlocuri;
    }
    public void setNrlocuri(int nrlocuri) {
        this.nrlocuri = nrlocuri;
    }
    public int getNrApartament() {
        return nrApartament;
    }
    public void setNrApartament(int nrApartament) {
        this.nrApartament = nrApartament;
    }
    public int getEtaj() {
        return etaj;
    }
    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }
    public boolean isBuc() {
        return buc;
    }
    public void setBuc(boolean buc) {
        this.buc = buc;
    }
    public boolean isMicdejun() {
        return micdejun;
    }
    public void setMicdejun(boolean micdejun) {
        this.micdejun = micdejun;
    }
    public boolean isAerconditionat() {
        return aerconditionat;
    }
    public void setAerconditionat(boolean aerconditionat) {
        this.aerconditionat = aerconditionat;
    } 
    public double factura(int nrnopti,int nrAdulti, int nrCopii){
       return nrnopti*(pret[0]*nrAdulti+pret[0]/2*nrCopii);
    
}   
    public static void AfisareNrloc(ArrayList<Apartament> vectorApartament, int nrloc, boolean aerconditionat) {
        for(Apartament apartament:vectorApartament){
         if(apartament.nrlocuri==nrloc && apartament.aerconditionat==aerconditionat) 
             System.out.println(apartament);
      }
    }
    //------------------------------------------------------LUCRU CU FISIERE----------------------------------------------
    public static void ScriereBinFis(ArrayList<Apartament> vectorApartament, File fisier){
          try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fisier))) {
            outputStream.writeObject(vectorApartament);
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
    //*********************************************************************************************************************
    public static void ScriereTxtFis(ArrayList<Apartament> vectorApartament, File fisier){
        
        Sterg(fisier); //sterg ceea ce aveam inainte pt ca am dat true in parametrii pentru a putea scrie in continuare
        for(int i=0;i<vectorApartament.size();i++){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fisier, true))){
            writer.write(vectorApartament.get(i).nume+"-"+vectorApartament.get(i).rating+ "-"+vectorApartament.get(i).pret[0]+"-"+vectorApartament.get(i).adresa+"-"+vectorApartament.get(i).program[0]+"-"+vectorApartament.get(i).program[1]+"-"+vectorApartament.get(i).nrlocuri+"-"+vectorApartament.get(i).nrcamere+"-"+vectorApartament.get(i).nrApartament+"-"+vectorApartament.get(i).etaj+"-"+vectorApartament.get(i).buc+"-"+vectorApartament.get(i).aerconditionat+"-"+vectorApartament.get(i).micdejun);
            writer.write("\n");
            
        }catch(IOException e){
            e.printStackTrace();
        }
        }
        System.out.println("Am modificat continutul fisierului");
    }
    public static ArrayList CitireTxtFis(File fisier){
         
        ArrayList<Apartament> lista =  new ArrayList<>();;
         try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fisier))) {
           
            String linie;
           
            
            while ((linie = bufferedReader.readLine()) != null) {
                
                String[] campuri = linie.split("-");
                Apartament a = new Apartament(
                        campuri[0], // Nume
                        Float.parseFloat(campuri[1]), // Rating
                        new double[]{ Double.parseDouble(campuri[2])}, // Pret
                        campuri[3], // Adresa
                        new int[]{Integer.parseInt(campuri[4]), Integer.parseInt(campuri[5])}, // prog
                        Integer.parseInt(campuri[6]), // nrlocuri
                        Integer.parseInt(campuri[7]), // nrcamere
                        Integer.parseInt(campuri[8]), // nrapart
                         Integer.parseInt(campuri[9]), //etaj
                        Boolean.parseBoolean(campuri[10]), //buc
                        Boolean.parseBoolean(campuri[11]), // aer
                        Boolean.parseBoolean(campuri[12])  //mic dejun
                        
                );

                
                lista.add(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
       return lista;
        
        
    }
}