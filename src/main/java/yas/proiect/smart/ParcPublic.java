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

public class ParcPublic extends Turism {

    public int nrToalete;
    public double suprafata;
    
    public int nrBiciclete = 0;
    public int nrBanci;
    ///private String[] other;
    
    public ParcPublic() {
        super();
        suprafata=0;
        nrBanci = 0;
        nrToalete = 0;
        nrBiciclete=0;
    }

    public ParcPublic(String nume, String adresa, int program[], float rating, double[] pret,double suprafata ,int nrToalete,int nrBanci,int nrBiciclete) {
        super(nume, adresa, program, rating, pret);
        this.suprafata=suprafata;
        this.nrToalete = nrToalete;
        this.nrBanci=nrBanci;
        this.nrBiciclete=nrBiciclete;
    }

    public ParcPublic(ParcPublic P) {
        super(P);
        this.suprafata = P.suprafata;
        this.nrBanci=P.nrBanci;
        this.nrToalete=P.nrToalete;
        this.nrBiciclete=P.nrBiciclete;
    }


    public void folosescToaleta(double taxa) throws Exception {
        if (nrToalete == 0) {
            throw new Exception("Nu sunt toatele in parc :(");
        }
        System.out.println("\nTaxa la toaleta: " + taxa);
        bill += taxa;
    }
    
    public void setBiciclete(int nr_biciclete) {
    if(nr_biciclete<0)
    {System.out.println("Ati introdus o valoare negativa");
        System.exit(1);
    }
        this.nrBiciclete=nr_biciclete;
    }
    
    public void inchiriezBicicleta(int ora,int nr_adulti,int nr_copii){
    if(this.nrBiciclete ==0)
        System.out.println("Nu aveti biciclete disponibile:(");
    else 
    {   
        System.out.println("Ati inchiriat "+(nr_adulti+nr_copii)+"bicicleta/e.\n Pret/ora la *adult: " +super.pret[1]+ " *copii: " +super.pret[0]);
        bill+=(super.pret[1]*nr_adulti+super.pret[0]*nr_copii)*ora;
        System.out.println("Suma totata pentru "+ora+ "ora/e: "+((pret[1]*nr_adulti+pret[0]*nr_copii)*ora));
    }   
    }
        
    

    @Override
    public String toString() {
        return super.toString() +"\nSuprafata: " +this.suprafata+"\nNr de *toalete " + this.nrToalete+"\nNr de banci: "+this.nrBanci+"\nNr de biciclete de inchiriat: "+this.nrBiciclete ;
    }
    
        
    }
    


