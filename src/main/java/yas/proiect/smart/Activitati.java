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
public class Activitati extends Turism {
    int[] data = new int[3] ;
    ArrayList<String> lista = new ArrayList<String>();
    public Activitati(){
    super();
    data[0]=0;
    data[1]=0;
    data[2]=0;
    }
    public Activitati(String nume, String adresa, int program[], float rating, Double pret,int zi,int luna ,int an ){
    super(nume,adresa ,program,rating,pret);
    data[0]=zi;
    data[1]=luna;
    data[2]=an;
    } 
    public Activitati(Activitati m){
    super(m);
    data[0]=m.data[0];
    data[1]=m.data[1];
    data[2]=m.data[2];
    }
    public String toString(){
    return super.toString()+"\nData: "+data[0]+"."+data[1]+"."+data[2];
    }
}
