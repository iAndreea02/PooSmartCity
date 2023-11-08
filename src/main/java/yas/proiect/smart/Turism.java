/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yas.proiect.smart;
import java.util.Scanner;
import java.util.Set;


 abstract class Turism {
     
    float ratting;
    protected Double pret ;
    String adresa;
    int[] program=new int[2];
    Scanner in=new Scanner (System.in);
    public int nr_adulti;
    public int nr_copii;
     
    public Turism()
    {
        ratting=0;
        pret=0.0;
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
        return "Ratting: "+ratting+ "Adresa: "+adresa+ 
                "\n Program :"+program[0]+" - "+program[1];
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
    
   
    
    public void setNrPersoane(int nr_copii, int nr_adulti)
    {
        this.nr_adulti = nr_adulti;
        this.nr_copii = nr_copii;
    }
    
     public static void main(String[] args) throws Exception {
         
            int[] program = {12,17};int[] prog1 = {14,19};
            double[] p = {4,10,3.4,6.7,1.3,5};
           double[] x = {2.5,8,5,8,9.5,5.5};
           
           muzeu_casa m = new muzeu_casa(4.9f,"Str Domneasca 17",prog1,"Casa lui Alexandru Ioan Cuza","Casa memoriala");
            muzeu_casa nec = new muzeu_casa();
            muzeu_casa copy = new muzeu_casa(m);
            
            
           //Adaugam lista de pret
           m.setPreturi(p);
           
           //Add nr de copii/adulti
           m.setNrPersoane(3,4);
           
           //Adaugam program 
           m.setProgram(program);
           
           //Adaugam ceva despre
           m.SetAbout1("istoria domnitorului");
           
           //Setam nr camere
           
         
            
     }
}