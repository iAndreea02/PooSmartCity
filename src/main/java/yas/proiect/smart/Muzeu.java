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
    
    //Date despre pret
    protected double pretcopil;
    protected double pretadult;

    
    protected double bill = 0.0;
    
//Date bilet
   

    Scanner in = new Scanner(System.in);
    //Constructo -fara parametrii

    public Muzeu() {

        super();
        tipul = "Necunoscut";
        an = 0;
        // tipul=null;
    }

    //-cu param
    public Muzeu(float rating, Double pret, String adresa, String nume, int program[],  String tipul, int an) {
        super(rating, pret, adresa, nume, program);
        this.tipul = tipul;
        this.an = an;
    }

    //-de copiere
    public Muzeu(Muzeu m) {
        super(m);
        tipul = m.tipul;
        an = m.an;
    }

    public void setPret( int reducere) throws Exception {
       
        this.pretcopil = this.pret - this.pret * reducere / 100;
        this.pretadult = this.pret;
    }


    //Buy ticket & Entry
    public void cumparBilet(int nrCopii,int nrAdulti) throws Exception {
        System.out.println("\n\nBine ai venit la: " + nume);
             System.out.println("Pret la adulti este : " + pretadult + "lei.   \nPret la copii: " + pretcopil+" lei.");
        if (nrCopii <= 0 && nrAdulti <= 0) {
            throw new Exception("Nu ati setata corect numarul de adulti si/sau copii");
        }

        bill += nrCopii * pretcopil + nrAdulti * pretadult;
        System.out.println("Nr de adulti: " + nrAdulti + " lei. \nNr de copii: " + nrCopii + " lei va ajunge la pretul de " + (nrCopii * pretcopil + nrAdulti * pretadult) + " lei\n\n");
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

    public void vreaSaDoneze() {
        double donare;
        System.out.println("Vizitatorii vor dona: " );
        donare=in.nextDouble();
        bill += donare;

    }
    
    
    //Bill
    public double getBill(){
        return bill;
    }
    
    //@Override
    @Override
    public String toString() {
        return  super.toString()+"\nTipul: "+this.tipul+"\n Anul infintarii: "+an;
    }

}
