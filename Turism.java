package ugal.ro.smartcity;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public abstract class Turism {

    public float rating;
    protected double[] pret;
    public String adresa, nume;
    public int[] program = new int[2];
    protected double factura = 0.0;
    
    public Turism() 
    {
        rating = 0;
        pret=new double[]{0.0,0.0};
        adresa = " ";
        nume = " ";
        program[0] = 0;
        program[1] = 0;

    }

    public Turism(String nume, String adresa, int program[], float rating, double[] pret)
    {
        this.rating = rating;
        this.pret = pret;
        this.adresa = adresa;
        this.nume = nume;
        this.program = program;
    }

    public Turism(Turism copie)
    {
        rating = copie.rating;
        pret = copie.pret;
        adresa = copie.adresa;
        nume = copie.nume;
        program = copie.program;

    }

    public String toString() 
    {
        return "Nume: " + nume + "\nAdresa: " + adresa + "\nRating: " + rating + "\nPret  -adult: " + pret[0]+"   -copii au reducere"+"\nProgram: "
                + this.program[0] + " - " + this.program[1];
    }
/*
    public String getAdresa() {
        return adresa;
    }
    
     public double[] getPret() {
        return pret;
    }
      public int[] getProgram() {
        return program;
    }
      public String getNume() {
        return nume;
    }
       public float getRating() {
        return rating;
    }
  */   
    public void setAdresa(String adresa) 
    {
        this.adresa = adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public double getBill() {
        return factura;
    }
    

   

    public static void menu() {
        System.out.println("**Bine ati venit in orasul Galati**");
        System.out.println("\nAcesta va fi meniul principal de unde va puteti alege activitatile zilnice");
        System.out.println("Distractie placuata!:)");
        System.out.println("\n** 1. Hotel/Apartament **");
        System.out.println("** 2. Restaurant **");
        System.out.println("** 3. Cafenele **  ");
        System.out.println("** 4. Parcuri publice **");
        System.out.println("** 6. Spital de stat / Clinica privata **");
        System.out.println("** 7. Muzeu **");
        System.out.println("** 8. Case moemoriale **");
        System.out.println("** 9. Afisati factura **");
        System.out.println("** 10. Resetati **");
        System.out.println("** 11. Parasiti meniul principal **");
    }

}