/*
    -constructori
    -nr de banci
    -toalete publice
    -tolomatul de inghetata
    -activitati:    -mersul cu masinile pt copii
                    -trambuline
                    -caruser
                    -inchiriere biciclete
 */
package yas.proiect.smart;

import java.util.ArrayList;

public class Parc_Public extends Turism {

    public int nr_toalete;
    public double suprafata;
    protected double bill = 0.0;
    protected int nr_biciclete = 0;
    private boolean masini_copii;
    private boolean trambulina;
    ///private String[] other;
    
    public Parc_Public() {
        super();
        suprafata=0;
    }

    public Parc_Public(String nume, String adresa, int program[], float rating, Double pret,double suprafata ) {
        super(nume, adresa, program, rating, pret);
        this.suprafata=suprafata;

    }

    public Parc_Public(Parc_Public P) {
        super(P);
        this.suprafata = P.suprafata;

    }

  
    public void setToalete(int nr_toalete){
    this.nr_toalete=nr_toalete;
    }
    public void folosescToaleta(double taxa) throws Exception {
        if (nr_toalete == 0) {
            throw new Exception("Nu sunt toatele in parc :(");
        }
        System.out.println("\nTaxa la toaleta: " + taxa);
        bill += taxa;
    }
    
    public void setBiciclete(int nr_biciclete){
    if(nr_biciclete<0)
    {System.out.println("Ati introdus o valoare negativa");
        System.exit(1);
    }
        this.nr_biciclete=nr_biciclete;
    }
    public void inchiriezBicicleta(int ora,int nr_adulti,int nr_copii){
    if(this.nr_biciclete ==0)
        System.out.println("Nu aveti biciclete disponibile:(");
    else 
    {   
        System.out.println("Ati inchiriat "+(nr_adulti+nr_copii)+"bicicleta/e.\n Pret/ora la *adult: " +pret+ " *copii: " +(pret-0.2*pret));
        bill+=(pret*nr_adulti+pret*nr_copii)*ora;
        System.out.println("Suma totata pentru "+ora+ "ora/e: "+((pret*nr_adulti+pret*nr_copii)*ora));
    }   
    }
        
    public double getBill() {
        return bill;
    }

    public String toString() {
        return super.toString() +"\nSuprafata: " +this.suprafata+"\nNr de *toalete " + this.nr_toalete ;
    }
    
    public void setActivitati(boolean masini_copii, boolean trambulina) {
        this.masini_copii = masini_copii;
        this.trambulina = trambulina;
        
    }

    public String isActivitati() {
        return "\n ***Activitati***"
                + "\n*Masini pentru copii: " + (this.masini_copii ? "Da" : "Nu") + "\n*Tambulina: " + (this.trambulina ? "Da" : "Nu");
    }

    public void vreaMasiniCopii(double pret, int nr_copii) throws Exception {
        if (this.masini_copii == false) {
            throw new Exception("In acest parc nu avem masini pentru copii");
        }
        if (nr_copii == 0) {
            throw new Exception("Inchirierea masinilor din parc este strict pentru copii!");
        }
        System.out.println("\nAti inchiriat o masina pentru copii.\nPret: " + pret);
        this.bill += pret * nr_copii;
    }

    public void vreaTrambulina(double pret, int nr_copii) throws Exception {
        if (this.trambulina == false) {
            throw new Exception("In acest parc nu avem Trambulina");
        }
        if (nr_copii == 0) {
            throw new Exception("Trambulina este strict pentru copii!");
        }
        System.out.println("\nAti platit o intrare in trambulina.Pret: " + pret);
        this.bill += pret * nr_copii;
    }
    

}
