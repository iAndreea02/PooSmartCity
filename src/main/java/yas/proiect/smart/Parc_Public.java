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

public class Parc_Public extends Turism {

    public int nr_banci;
    public int nr_toalete;
    public int nr_magazine;
    //protected double[] all_pret;
    protected double bill = 0.0;

    public Parc_Public() {
        super();
        nr_banci = 0;
        nr_toalete = 0;
        nr_magazine = 0;
    }

    public Parc_Public(float rating, double pret, String adresa, int[] program, String nume, int nr_banci, int nr_toalete, int nr_magazine) {
        super(rating, pret, adresa, nume, program);
        this.nr_banci = nr_banci;
        this.nr_toalete = nr_toalete;
        this.nr_magazine = nr_magazine;

    }

    public Parc_Public(Parc_Public P) {
        super(P);
        this.nr_banci = nr_banci;
        this.nr_toalete = nr_toalete;
        this.nr_magazine = nr_magazine;

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

}
