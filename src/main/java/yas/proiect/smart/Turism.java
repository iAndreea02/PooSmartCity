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


public abstract class Turism  {
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
    
    public Turism(String nume,String adresa,int program[],float rating, Double pret)
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
    
    public static void menu(){
        System.out.println("**Bine ati venit in orasul Galati**");
        System.out.println("Acesta va fi meniul principal de unde va puteti alege activitatile zilnice");
         System.out.println("\n 1. Hotel/Apartament ");
         System.out.println("\n 2. Restaurant ");
         System.out.println("\n 3. Cafenele  ");
         System.out.println("\n 4. Parcuri publice");
         System.out.println("\n 5. Activitati in aer liber");
         System.out.println("\n 6. Spital de stat / Clinica privata");
    } 
    
   
//  
    public static void main(String[] args) {
        
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