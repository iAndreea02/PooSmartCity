/*
Muzeu 
-Initializez info despre muzeu :an , tipul ,
            super (ratting ,adresa ,nume,program ,nr adulti ,nr copii),
            pretcopil,pretadult

-Creez constructori(parametru,fara parametru ,copiere)
-setam pretul pt adult dar si pt copil,dar la el va fi cu reducere
            *si setam si pretul pentru :suvenir,poze ,donari(aici va scris la tastatura)
-Cu toate ca alegem ce tip de muzeu vizitam,vom specifica si obiectele pe care le vor descoperi la intrare in muzeu
-Cream metoda cumparBilet ,unde vom adauga in factura pretul total la achizitionarea biletelor
-creem metoda vreaSaIntre,iar daca nu are bilet nu are acces sa intre


 */
package yas.proiect.smart;

import java.util.Scanner;
// String[] tipul = {"Casa memoriabila","Muzeu"};

class Muzeu extends Turism {
//Nume muzeu

    //Date despre muzeu
    public int an;
    public String tipul;
    public int suprafata;
    protected double bill = 0.0;

//Date bilet
    Scanner in = new Scanner(System.in);
    //Constructo -fara parametrii

    public Muzeu() {

        super();
        tipul = "Necunoscut";
        an = 0;
        suprafata = 0;
        // tipul=null;
    }

    //-cu param
    public Muzeu(String nume, String adresa, int program[], float rating, double[] pret, String tipul, int an, int suprafata) {
        super(nume, adresa, program, rating, pret);
        this.tipul = tipul;
        this.an = an;
        this.suprafata = suprafata;
    }

    //-de copiere
    public Muzeu(Muzeu m) {
        super(m);
        this.tipul = m.tipul;
        this.an = m.an;
        this.suprafata = m.suprafata;
    }

    //Buy ticket & Entry
    public void cumparBilet(int nrCopii, int nrAdulti) throws Exception {
        System.out.println("\n\nBine ai venit la: " + nume);
        System.out.println("Pret la adulti este : " + pret[1] + "lei.   \nPret la copii: " + pret[0] + " lei.");
        if (nrCopii <= 0 && nrAdulti <= 0) {
            throw new Exception("Nu ati setata corect numarul de adulti si/sau copii");
        }

        bill += nrCopii * pret[0] + nrAdulti * pret[1];
        System.out.println("Nr de adulti: " + nrAdulti + " lei. \nNr de copii: " + nrCopii + " lei va ajunge la pretul de " + (nrCopii * pret[0] + nrAdulti * pret[1]) + " lei\n\n");
    }

    //Shop +Poze
    public void vreaPoze(double pret) {
        System.out.println("Taxa de poze este : " + pret);
        bill += pret;
    }

    public void vreaSuvenir(double[] all_pret) {
        System.out.println("La suvenir avem : Breloc " + all_pret[0] + " \n Magneti- " + all_pret[1] + "\n Carti -" + all_pret[2]);
        String raspuns = in.next();
        switch (raspuns) {
            case "Breloc":
                bill += all_pret[0];
                break;
            case "Magneti":
                bill += all_pret[1];
                break;
            case "Carti":
                bill += all_pret[2];
                break;
            default:
                System.out.println("Din pacate,nu avem in stock:(");
        }
    }

    public void vreaSaDoneze(double donare) {

        System.out.println("Vizitatorii vor dona: ");
        donare = in.nextDouble();
        bill += donare;

    }

    //@Override
    @Override
    public String toString() {
        return super.toString() + "\nCategorie: " + this.tipul + "\n Anul infintat: " + an + "\nSuprafata: " + this.suprafata;
    }

}
