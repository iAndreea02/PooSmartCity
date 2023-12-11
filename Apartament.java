/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiect.proiectpoo;

import java.util.ArrayList;

public class Apartament extends Turism{
  
    int nrcamere;
    int nrlocuri;
    int nrApartament;
    int etaj;
    boolean buc, micdejun, aerconditionat;


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
    
   public Apartament(String nume,float rating, double pret[], String adresa,  int program[],String tippat,int nrlocuri, int nrcamere, int nrApartament, int etaj , boolean buc, boolean aerconditionat, boolean micdejun){
        super( nume,  adresa, program,  rating, pret);
        
        this.nrlocuri=nrlocuri;
        this.nrcamere=nrcamere;
        this.nrApartament=nrApartament;
        this.etaj=etaj;
        
        this.buc=buc;
        this.aerconditionat=aerconditionat;
        this.micdejun=micdejun;
    }

    @Override
    public String toString() {
         return "Apartamentul cu numarul "+nrApartament+" are numele: "+nume+" are rating ul de "+rating+" stelute "+
               " se afla la adresa "+adresa+ " se deschide la ora "+program[0]+ " si se inchide la ora "+program[1]+"\n"+
               "Permite cazarea a "+nrlocuri+ " persoane si are "+nrcamere+ " camere \n"+
               "Se afla la etajul "+etaj+"\n"+
               "Are pretul "+pret[0]+ "lei \n";
    }
    
   
    
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

}