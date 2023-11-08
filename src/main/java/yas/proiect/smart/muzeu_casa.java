/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yas.proiect.smart;


// String[] tipul = {"Casa memoriabila","Muzeu"};
class muzeu_casa extends Turism {
//Nume muzeu

    public String tipul;  //Muzeu sau Casa memoriala
    public String nume;
    public String about1;  //ex Autor sau istorie 

    private double[] all_pret=new double[6];
    private String[] camere;
    private int nr_camere;

    //Constructo -fara parametrii
    public muzeu_casa() {

        super();
        nume = "Necunoscut";
        tipul = "Necunoscut";
        // tipul=null;
    }

    //-cu param
    public muzeu_casa(float ratting, String adresa, int[] program, String nume, String tipul) {
        super(ratting, adresa, program);
        this.nume = nume;
        this.tipul = tipul;
    }

    //-de copiere
    public muzeu_casa(muzeu_casa m) {
        super(m);
        nume = m.nume;
        tipul = m.tipul;
    }

    public void setPreturi(double[] lei) throws Exception {
        if (lei.length != 6) {
            throw new Exception("Nu ati introdus suficente date");
        }
        all_pret = lei;
    }

    public void setAbout1(String about) {
        this.about1 = about;
    }

    public void setCamere(int nr_camere, String[] tema) {
        this.nr_camere = nr_camere;
        camere = new String[this.nr_camere];
        this.camere = tema;
    }

    public String[] getCamere() {
        return camere;
    }

    public void intrare(int nr_copii, int nr_adulti) throws Exception {
        System.out.println("Bine ai venit la: " + nume);
        System.out.println("Pret la adulti este : " + all_pret[1] + "   Pret la copii: " + all_pret[0]);

        if (nr_copii <= 0 && nr_adulti <= 0) {
            throw new Exception("Nu ati setata corect numarul de adulti si/sau copii");
        }

        super.pret = nr_copii * all_pret[1] + nr_adulti * all_pret[0];
        System.out.println("Nr de adulti:" + nr_adulti + "Nr de copii" + nr_copii + "va ajunge la pretul de " + pret + " lei");

    }
    
    //todo
    public void todo(){
        System.out.println("In "+tipul+"sunt "+nr_camere+" camere ,\n");
        for(int i=0;i<nr_camere;i++)
            System.out.println(i+". "+camere[i]);
    
    }
   
    public void vreaPoze() {
        System.out.println("Taxa de poze este : " + all_pret[2]);
        pret += all_pret[2];
    }

    public void vreaSuvenir() {
        System.out.println("La suvenir avem : Breloc " + all_pret[3] + " \n Magneti- " + all_pret[4] + "\n Carti -" + all_pret[5]);
        String raspuns = in.next();
        switch (raspuns) {
            case "Breloc":
                pret += all_pret[3];
                break;
            case "Magneti":
                pret += all_pret[4];
                break;
            case "Carti":
                pret += all_pret[5];
                break;
            default:
                System.out.println("Din pacate,nu avem in stock:(");
        }
    }

    public void vreaSaDoneze(double donare) {
        System.out.println("Ei vor dona: "+ donare);
        pret += donare;

    }
    
    //@Override
    @Override
    public String toString(){
    return "Atractie turistica : "+this.tipul+"\n Nume: "+this.nume
            +"\nCategorie :"+this.tipul+super.toString()+
            "\nPretul *copii"+this.all_pret[0]+" *adulti; "+this.all_pret[1]+
            "\n Despre: "+this.about1;
    }

    void SetAbout1(String toria_domnitorului) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
