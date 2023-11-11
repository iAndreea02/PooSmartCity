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
    int[] program = new int[2];

    public Turism() {
        rating = 0;
        pret = 0.0;
        adresa = " ";
        nume = " ";
        program[0] = 0;
        program[1] = 0;

    }

    public Turism(String nume, String adresa, int program[], float rating, Double pret) {
        this.rating = rating;
        this.pret = pret;
        this.adresa = adresa;
        this.nume = nume;
        this.program = program;
    }

    public Turism(Turism copie) {
        rating = copie.rating;
        pret = copie.pret;
        adresa = copie.adresa;
        nume = copie.nume;
        program = copie.program;

    }

    public String toString() {
        return "Nume: " + nume + "\nAdresa: " + adresa + "\nRating: " + rating + "\nPret: " + pret + "\nProgram: "
                 +this.program[0] + " - " + this.program[1];
    }

    public String getAdresa() {
        return adresa;
    }

    public Double getPret() {
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

//  
    public static void main(String[] args) {
        boolean hai = false;
        int rasp;
        Scanner in = new Scanner(System.in);
        int prog1[] = {7,22},prog2[]={12,18};
        Parc_Public parc1 = new Parc_Public("Gradina Publica","Strada Domneasca",prog1,4.5f,0.0,10,3,2);
        Muzeu muzeu1 = new Muzeu("Muzeul din Gradina Botanica","Faleza Galati",prog2,4.9f,15.0,"Stiinte ale naturii",1930);
        Casa_memoriala casa1 = new Casa_memoriala("Casa Cuza Vodă","Strada Alexandru Ioan Cuza",prog2,4.3f,12.6,"Istorie",1939,"Alexandru Ioan Cuza",10,"LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE");
       
            try{
                System.out.println(parc1+"\n\n"+muzeu1+"\n\n"+casa1);
            }catch (Exception e) {
                System.out.println(e);
            }
        }
    }


