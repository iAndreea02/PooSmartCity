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

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// String[] tipul = {"Casa memoriabila","Muzeu"};

class Muzeu extends Turism {
//Nume muzeu

    //Date despre muzeu
    public int an;
    public String tipul;
    public int suprafata;
    protected double[] allPret;
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
    public Muzeu(String nume, String adresa, int program[], float rating, double[] pret, String tipul, int an, int suprafata,double[] allPret) {
        super(nume, adresa, program, rating, pret);
        this.tipul = tipul;
        this.an = an;
        this.suprafata = suprafata;
        this.allPret=allPret;
    }

    //-de copiere
    public Muzeu(Muzeu m) {
        super(m);
        this.tipul = m.tipul;
        this.an = m.an;
        this.suprafata = m.suprafata;
        this.allPret=m.allPret;
    }

    //Buy ticket & Entry
    public void cumparBilet(int nrCopii, int nrAdulti) {
       System.out.println("\n\nBine ai venit la: " + nume);
       System.out.println("Pret la adulti este : " + pret[1] + "lei.   \nPret la copii: " + pret[0] + " lei.");
        bill += nrCopii * pret[0] + nrAdulti * pret[1];
       System.out.println("Nr de adulti: " + nrAdulti + " lei. \nNr de copii: " + nrCopii + " lei va ajunge la pretul de " + (nrCopii * pret[0] + nrAdulti * pret[1]) + " lei\n\n");
    }
    public double showThatPrice(String nume){
    Map<String,Double> m =new HashMap<>();
    m.put("Poze",allPret[0]);
    m.put("Breloc",allPret[1]);
    m.put("Magneti",allPret[2]);
    m.put("Carti",allPret[3]);
        return m.get(nume);
    }
    //Shop +Poze
    public void vreaPoze() {
        System.out.println("Taxa de poze este : " + allPret[0]);
        bill += allPret[0];
    }

    public void vreaSuvenir(String raspuns) {
        System.out.println("La suvenir avem : Breloc " + allPret[1] + " \n Magneti- " + allPret[2] + "\n Carti -" + allPret[3]);
        //String raspuns = in.next();
        switch (raspuns) {
            case "Breloc":
                bill += allPret[1];
                break;
            case "Magneti":
                bill += allPret[2];
                break;
            case "Carti":
                bill += allPret[3];
                break;
            default:
                System.out.println("Din pacate,nu avem in stock:(");
        }
    }

    public void vreaSaDoneze(double donare) {

        System.out.println("Vizitatorii vor dona: "+donare);
      //  donare = in.nextDouble();
        bill += donare;

    }

    //@Override
    @Override
    public String toString() {
        return super.toString() + "\nCategorie: " + this.tipul + "\n Anul infintat: " + an + "\nSuprafata: " + this.suprafata;
    }

}
