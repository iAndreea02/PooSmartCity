/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yas.proiect.smart;
import java.util.Scanner;
// String[] tipul = {"Casa memoriabila","Muzeu"};
class Muzeu extends Turism {
//Nume muzeu
    //public static String atractie ="Muzeu";
    public int an;
    public String tipul;  //Muzeu
    public String nume;
    private double[] all_pret = new double[4]; //Pretul la toate accesorile
   
    protected double pretcopil;
    protected double pretadult;
    
    private String[] obiecte;
    private double bill=0.0; 
    
    Scanner in=new Scanner(System.in);
    //Constructo -fara parametrii

    public Muzeu() {

        super();
        tipul = "Necunoscut";
        an=0;
        // tipul=null;
    }

    //-cu param
    public Muzeu(float rating, Double pret, String adresa,String nume, int program[],int nrAdulti,int nrCopii, String tipul,int an) {
        super(rating,pret,adresa,nume,program,nrAdulti,nrCopii);
        this.tipul = tipul;
        this.an=an;
    }

    //-de copiere
    public Muzeu(Muzeu m) {
        super(m);
        tipul = m.tipul;
        an=m.an;
    }

    public void setPret(double[] pret, double pretintreg, int reducere)throws Exception {
        if (pret.length != 4)
        throw new Exception("Lista de preturi nu a fost introdusa corect");
        all_pret = pret;
        this.pretcopil = pretintreg - pretintreg * reducere / 100;
        this.pretadult = pretintreg;
    }   

    public void setMuzeu(String[] obj) {
       
        this.obiecte = obj;
    }

    public void intrare() throws Exception {
        System.out.println("Bine ai venit la: " + nume);
        System.out.println("Pret la adulti este : " + pretadult + "   Pret la copii: " + pretcopil);

        if (nrCopii <= 0 && nrAdulti <= 0) {
            throw new Exception("Nu ati setata corect numarul de adulti si/sau copii");
        }

        bill += nrCopii * pretcopil + nrAdulti * pretadult;
        System.out.println("Nr de adulti: " + nrAdulti + " Nr de copii " + nrCopii + "va ajunge la pretul de " + (nrCopii * pretcopil + nrAdulti * pretadult) + " lei");
        
    }

    //todo
//    public void todo(){
//            
//    }
    public void vreaPoze(Persoana P1) {
        System.out.println("Taxa de poze este : " +all_pret[0]);
        P1.bill += all_pret[0];
    }

    public void vreaSuvenir(Persoana P1) {
        System.out.println("La suvenir avem : Breloc " + all_pret[1] + " \n Magneti- " + all_pret[2] + "\n Carti -" + all_pret[3]);
        String raspuns = in.next();
        switch (raspuns) {
            case "Breloc":
                P1.bill += all_pret[1];
                break;
            case "Magneti":
                P1.bill += all_pret[2];
                break;
            case "Carti":
                P1.bill += all_pret[3];
                break;
            default:
                System.out.println("Din pacate,nu avem in stock:(");
        }
    }

    public void vreaSaDoneze(Persoana P1, double donare) {
        System.out.println("Ei vor dona: " + donare);
        P1.bill += donare;

    }

    public void interior() {
        System.out.println("In interiorul cladirii veti descoperii urmatoarele lucrurui:");
        int i = 0;
        for (String iter : this.obiecte) {
            i++;
            System.out.println(i + ". " + iter);
        }

    }

    //@Override
    @Override
    public String toString() {
        return  "\n Nume: " + this.nume
                + "\nCategorie : " + this.tipul +"\nAnul infiintat: "+an+ super.toString()
                ;
    }

}
