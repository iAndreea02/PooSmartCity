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
public class DemoTurism {
   
        public static void main(String[] args) {
             int prog1[] = {7, 22}, prog2[] = {12, 18};
    double[] pret1={5.6,10.3},pret0={6,11},pret3={0,6},pret4={10,27};
        ParcPublic parc1 = new ParcPublic("Gradina Publica", "Strada Domneasca", prog1, 4.5f, pret0, 988.0,5,7,10);
        ParcPublic parc0 = new ParcPublic();
        ParcPublic parc_copy = new ParcPublic(parc1);
        Muzeu muzeu1 = new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", prog2, 4.9f, pret4, "Stiinte ale naturii", 1930,988);
        Muzeu muzeu0 = new Muzeu();
        Muzeu muzeu_copy = new Muzeu(muzeu1);
        CasaMemoriala casa1 = new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", prog2,4.3f,pret3,"Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE");
       
            System.out.println(parc1+"\n\n"+muzeu1+"\n\n"+casa1);
    }
        
}
