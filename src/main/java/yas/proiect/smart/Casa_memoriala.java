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
public class Casa_memoriala extends Muzeu{
    protected  String atarctie ="Casa memoriabila";
    public String Autor;
  
    public Casa_memoriala(){
    super();
    this.Autor="Necunoscut";
    }
    public Casa_memoriala(float rating,double pret ,String adresa, int[] program,String nume, String tipul,int an,String Autor){
    super(rating,pret,adresa,nume,program,tipul,an);
    this.Autor=Autor;
    }
    public Casa_memoriala(Casa_memoriala m){
    super(m);
    this.Autor=m.Autor;
    }
    
    
  public void cumparBilet(int nrCopii,int nrAdulti) throws Exception {
        System.out.println("******Bine ai venit la: " + nume+" ********");
        System.out.println("Pret la adulti este : " + pretadult + "lei.   \nPret la copii: " + pretcopil+" lei.");

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
    public String toString(){
    return super.toString()+"\n Autor: "+Autor;
    }
    
}
