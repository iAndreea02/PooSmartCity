/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yas.proiect.smart;
import java.util.Scanner;
import java.util.Set;


 abstract public class Turism {
     
    float ratting;
    protected Double pret ;
    String adresa;
    int[] program=new int[2];
    public Scanner in=new Scanner (System.in);
     
     public Turism()
    {
        ratting=0;
       // pret=0.0;
        adresa=" ";
        program[0]=0;
        program[1]=0;
    }
    
    public Turism(float ratting, String adresa, int program[])
    {
        this.ratting=ratting;
       this.pret=0.0;
        this.adresa=adresa;
        this.program=program;
    }
    
    public Turism(Turism copie)
    {
        ratting=copie.ratting;
        pret=copie.pret;
        adresa=copie.adresa;
        program=copie.program;
    }
    
    @Override
    public String toString()
    {
        return " \nRatting: "+ratting+ " \nAdresa: "+adresa+ 
                "\n Program : "+program[0]+" - "+program[1];
    }
    
    
    public void setProgram(int[] program){
    this.program= program;
    }
    
    public int[] getProgram(){
    return program;
    }
     
    public double getPret(){
    return pret;
    }
    
   
    
//    public void setNrPersoane(int nr_copii, int nr_adulti)
//    {
//        this.nr_adulti = nr_adulti;
//        this.nr_copii = nr_copii;
//    }
//    
     public static void main(String[] args) throws Exception {
            Persoana p1;
            int[] program = {12,17};int[] prog1 = {14,19};
            double[] p = {4,10,3.4,6.7};
            String[] cam ={"Arme din razboi","Picturi","Sabii din perioada lui Decebal","Primele monezi "};
           String[] cas = {"Bucatarie","Bai","Sala de conferinte","Dormitor"};
            p1=new Persoana(3,4,"Radu");
           Muzeu m = new Muzeu(4.9f,"Str Domneasca 17",prog1,"Muzeul Romaniei","Istorie",1980);
//            Muzeu nec = new Muzeu();
//            Muzeu copy = new Muzeu(m);
//            Casa_memoriala a=new Casa_memoriala(4.9f,"Str Iorga",prog1,"Casa lui Ioan Cuza","istorie",1888,"Ioan Cuza");
//            System.out.println(a); 
//            a.setPret(p, 12, 40);
//            a.setCamere(4,cas);
//            a.intrare(p1);
//            a.interior();
            
           m.setPret(p,15,20);
           //m.setProgram(program);
           m.setMuzeu(cam);
           System.out.println(m);
           
           
           m.intrare(p1);
           m.interior();
           m.vreaPoze(p1);
           m.vreaSuvenir(p1);
           m.vreaSaDoneze(p1, 5);
           
           System.out.println(p1);
           
           //Setam nr camere
           
         
            
     }
}