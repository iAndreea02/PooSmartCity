/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yas.proiect.smart;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Activitati extends Parc_Public{
    String[] activitati;
    int nr_activitati;
    public Activitati(){
    super();
    this.nr_activitati=0;
    }
    public Activitati(String nume, String adresa, int program[], float rating, Double pret,double suprafata,int nr_activitati ){
    super(nume,adresa ,program,rating,pret,suprafata);
    this.nr_activitati=nr_activitati;
    } 
    public Activitati(Activitati m){
    super(m);
    this.nr_activitati=m.nr_activitati;
    }
    public String toString(){
        ArrayList<String> g=new ArrayList<String>();
        for(String iter:activitati)
           g.add(iter);
    return super.toString()+"\nNumarul de activitati: "+this.nr_activitati+"\nActivitati: "+g;
    }
    
    public void setActivitati(String[] activitati) {
        activitati =new String[nr_activitati];
        this.activitati=activitati;
    }

    

    
}
