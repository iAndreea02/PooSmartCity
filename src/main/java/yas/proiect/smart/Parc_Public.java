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

    public int nr_banci;
    public int nr_toalete;
    public int nr_magazine;
    //protected double[] all_pret;
    protected double bill = 0.0;
    //Activitati
    private boolean masini_copii;
    private boolean trambulina;
    private boolean caruser;
    private boolean biciclete;
    private ArrayList <String> lista_activitati = new ArrayList<>();
    public Parc_Public() {
        super();
        nr_banci = 0;
        nr_toalete = 0;
        nr_magazine = 0;
    }

    public Parc_Public(String nume,String adresa,int program[],float rating, Double pret, int nr_banci, int nr_toalete, int nr_magazine) {
       super(nume,adresa,program,rating,pret);
        this.nr_banci = nr_banci;
        this.nr_toalete = nr_toalete;
        this.nr_magazine = nr_magazine;

    }

    public Parc_Public(Parc_Public P) {
        super(P);
        this.nr_banci = P.nr_banci;
        this.nr_toalete = P.nr_toalete;
        this.nr_magazine = P.nr_magazine;
        
    }

    public boolean isBanci() {
        if (this.nr_banci == 0) {
            return false;
        }
        return true;
    }

    public void folosescToaleta(double taxa) throws Exception {
        if (nr_toalete == 0) {
            throw new Exception("Nu sunt toatele in parc :(");
        }
        System.out.println("\nTaxa la toaleta: " + taxa);
        bill += taxa;
    }
    public void vreaInghetata(double pret) throws Exception {
        if (nr_magazine == 0) {
            throw new Exception("Nu sunt magazine cu inghetata in parc :(");
        }
        System.out.println(" Poftiti la inghetata. Pretul este: " + pret + "\n\n");
        bill += pret;
    }

    public double getBill() {
        return bill;
    }

    public String toString() {
        return super.toString()+ "\nNr de *toalete " + this.nr_toalete + "  *banci " + this.nr_banci
                + "  *magazin cu inghetata " + this.nr_magazine;
    }
    
    //Activitati
    public void setActivitati(boolean masini_copii,boolean trambulina,boolean caruser,boolean biciclete){
    this.masini_copii=masini_copii;
    this.trambulina=trambulina;
    this.caruser=caruser;
    this.biciclete=biciclete;
    }
    public String isActivitati(){
    return "\n ***Activitati***"
            + "\n*Masini pentru copii: "+(this.masini_copii? "Da" : "Nu")+"\n*Tambulina: "+(this.trambulina? "Da" : "Nu")+
            "\n*Caruser: "+(this.caruser? "Da" : "Nu")+"\n*Biciclete de inchiriat: "+(this.biciclete? "Da" : "Nu");
    }
    public void vreaMasiniCopii(double pret)throws Exception{
        if(this.masini_copii==false)
            throw new Exception("In acest parc nu avem masini pentru copii");
        System.out.println("\nAti inchiriat o masina pentru copii.\nPret: "+pret);
        this.bill+=pret;
    }
    public void vreaTrambulina(double pret)throws Exception{
        if(this.masini_copii==false)
            throw new Exception("In acest parc nu avem Trambulina");
        System.out.println("\nAti platit o intrare in trambulina.Pret: "+pret);
        this.bill+=pret;
    }
    public void vreaCaruser(double pret)throws Exception{
        if(this.masini_copii==false)
            throw new Exception("In acest parc nu avem caruser");
        System.out.println("\nAti platit un bilet pentru caruser.\n Pret:  "+pret);
        this.bill+=pret;
    }
    public void vreaBicicleta(double pret)throws Exception{
        if(this.masini_copii==false)
            throw new Exception("In acest parc nu avem biciclete");
        System.out.println("\nAti inchiriat o bicicleta.\n Pret:  "+pret);
        this.bill+=pret;
    }
    public void addActivitati(String activ){
    lista_activitati.add(activ);
    System.out.println("Activitate adaugata: "+activ);
    }
    
}
