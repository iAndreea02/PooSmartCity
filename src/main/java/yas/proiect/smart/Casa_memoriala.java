/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yas.proiect.smart;

/*
Casa memoriabila 
-  

 */
public class Casa_memoriala extends Muzeu {

    public String Autor;
    private int nr_camere;
    private String EvenimentMemorial;

    public Casa_memoriala() {
        super();
        this.Autor = "Necunoscut";
         this.nr_camere = 0;
        this.EvenimentMemorial="Nimic";
    }

    public Casa_memoriala(String nume, String adresa, int program[], float rating, Double pret, String tipul, int an, String Autor, int nr_camere,String EvenimentMemoriala) {
        super(nume, adresa, program, rating, pret, tipul, an);
        this.Autor = Autor;
        this.nr_camere = nr_camere;
        this.EvenimentMemorial=EvenimentMemoriala;
    }

    public Casa_memoriala(Casa_memoriala m) {
        super(m);
        this.Autor = m.Autor;
         this.nr_camere = m.nr_camere;
        this.EvenimentMemorial=m.EvenimentMemorial;
    }

    public void cumparBilet(int nrCopii, int nrAdulti) throws Exception {
        System.out.println("******Bine ai venit la: " + nume + " ********");
        System.out.println("Pret la adulti este : " + pretadult + "lei.   \nPret la copii: " + pretcopil + " lei.");

        if (nrCopii <= 0 && nrAdulti <= 0) {
            throw new Exception("Nu ati setata corect numarul de adulti si/sau copii");
        }

        bill += nrCopii * pretcopil + nrAdulti * pretadult;
        System.out.println("Nr de adulti: " + nrAdulti + " \nNr de copii " + nrCopii + " va ajunge la pretul de " + (nrCopii * pretcopil + nrAdulti * pretadult) + " lei\n\n");
    }

    @Override
    public void vreaSuvenir(double[] all_pret) {
        System.out.println("La suvenir avem : Ghid " + all_pret[0] + " \n Carti- " + all_pret[1] + "\n Vedere -" + all_pret[2]);
        String raspuns = in.next();
        System.out.println("Cate bucati dori? ");
        int nr = in.nextInt();
        switch (raspuns) {
            case "Ghid":
                bill += all_pret[0];

                break;
            case "Carti":
                bill += all_pret[21];
                break;
            case "Vedere":
                bill += all_pret[2];
                break;
            default:
                System.out.println("Din pacate,nu avem in stock:(");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n Autor: " + Autor+"\nNumarul de camere: "+this.nr_camere+"\nEveniment memorial: "+this.EvenimentMemorial;
    }

}
