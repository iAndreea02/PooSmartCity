/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yas.proiect.smart;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public abstract class Turism {
    float rating;
    double pret;
    String adresa, nume;
    int[] program=new int[2];
    
    
    public Turism()
    {
        rating=0;
        pret=0.0;
        adresa=" ";
        nume=" ";
        program[0]=0;
        program[1]=0;
        
    }
    
    public Turism(float rating, Double pret, String adresa,String nume, int program[])
    {
        this.rating=rating;
        this.pret=pret;
        this.adresa=adresa;
        this.nume=nume;
        this.program=program;
    }
    
    public Turism(Turism copie)
    {
        rating=copie.rating;
        pret=copie.pret;
        adresa=copie.adresa;
        nume=copie.nume;
        program=copie.program;
        
        
    }
    
    public String toString()
    {
        return "Nume: "+nume+"\nAdresa: "+adresa+"\nRating: "+rating+"\nPret: "+pret+"\nAdresa: "+adresa+"\nProgram: "+
                  + this.program[0] + " - " + this.program[1] ;
    }
      
    public String getAdresa()
    {
        return adresa;
    }
    
    public Double getPret()
    {
        return pret;
    }

    public int[] getProgram()
    {
        return program;
    }
    
    public String getNume()
    {
        return nume;
    }
    
    public float getRating()
    {
        return rating;
    }
    
  
    
   
//  
    public static void main(String[] args) {
        int program[]={12,18};
        double[] pret1={10.5,4.5,6.7,8.3};
        //Muzeu m = new Muzeu(4.6f,10.9,"Str Domneasca","Muzeul national",program,4,5,"Istorie",1980);
        //Casa_memoriala cm =new Casa_memoriala(3.6f,7.8,"Str Domneasca",program,2,4,"Casa lui Alexandru Ioan Cuza","Istorie",1981,"Alexandru Ioan Cuza");
        
        try{
            
            
            /* m.setPret(pret1, 20);
        m.cumparBilet();
        m.vreaPoze();
        m.vreaSaDoneze();
        m.vreaSuvenir();
        System.out.println("Factura pentru muzeu este : "+m.getBill() );
        */
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
    
}