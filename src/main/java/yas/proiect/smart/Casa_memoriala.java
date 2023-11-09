/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yas.proiect.smart;

/**
 *
 * @author andre
 */
public class Casa_memoriala extends Muzeu{
    public static String atarctie ="Casa memoriabila";
    public String Autor;
    private int nrCamere;
    private String[] camere;
    
    public Casa_memoriala(){
    super();
    this.Autor="Necunoscut";
    }
    public Casa_memoriala(float ratting,double pret ,String adresa, int[] program,int nrAdulti,int nrCopii ,String nume, String tipul,int an,String Autor){
    super(ratting,pret,adresa,nume,program,nrAdulti,nrCopii,tipul,an);
    this.Autor=Autor;
    }
    public Casa_memoriala(Casa_memoriala m){
    super(m);
    this.Autor=m.Autor;
    }
    
    public void setCamere(int nrCamere,String[] camere){
        this.nrCamere=nrCamere;
        this.camere =camere; 
    }
    
    @Override
    public void interior() {
        System.out.println("Casa lui "+Autor+" este compus din: ");
        int i = 0;
        for (int j=0;j<this.nrCamere;j++) {
            i++;
            System.out.println(i + ". " + this.camere[j]);
        }
    }
    
    @Override
    public String toString(){
    return super.toString()+"\n Autor: "+Autor;
    }
    
}
