/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yas.proiect.smart;
import java.util.Map;
import java.util.Scanner;
public abstract class Turism {
    float rating;
    double pret;
    String adresa, nume;
    int[] program=new int[2];
    int nrPersoane, nrAdulti, nrCopii;
    
    
    public Turism()
    {
        rating=0;
        pret=0.0;
        adresa=" ";
        nume=" ";
        program[0]=0;
        program[1]=0;
        nrAdulti=0;
        nrCopii=0;
        nrPersoane=nrAdulti+nrCopii;
    }
    
    public Turism(float rating, Double pret, String adresa,String nume, int program[],int nrAdulti,int nrCopii)
    {
        this.rating=rating;
        this.pret=pret;
        this.adresa=adresa;
        this.nume=nume;
        this.program=program;
        this.nrAdulti=nrAdulti;
        this.nrCopii=nrCopii;
        nrPersoane=nrAdulti+nrCopii;
    }
    
    public Turism(Turism copie)
    {
        rating=copie.rating;
        pret=copie.pret;
        adresa=copie.adresa;
        nume=copie.nume;
        program=copie.program;
        nrAdulti=copie.nrAdulti;
        nrCopii=copie.nrCopii;
        nrPersoane=nrAdulti+nrCopii;
        
    }
    
    public String toString()
    {
        return "Nume: "+nume+"\nAdresa: "+adresa+"\nRating: "+rating+"\nPret: "+pret+"\nAdresa: "+adresa+"\nProgram: "+
                program+"\nNumarul de persoane: "+nrPersoane+" dintre care adulti: "+nrAdulti+" si copii: "+nrCopii;
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
    
    public int getNrPersoane()
    {
        return nrPersoane;
    }
    
    
//     public void afiseazaInformatii()
//    {
//        System.out.println("Nume: "+nume);
//        System.out.println("Adresa: "+adresa);
//        System.out.println("Rating: "+rating);
//        System.out.println("Pret: "+pret);
//        System.out.println("Program: "+program);
//        System.out.println("Numarul de persoane: "+nrPersoane+" dintre care adulti: "+nrAdulti+" si copii: "+nrCopii);
//    }

    
}