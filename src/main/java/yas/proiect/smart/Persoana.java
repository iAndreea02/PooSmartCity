/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yas.proiect.smart;


 class Persoana {
    public String numefamilie;
     public int nr_adulti;
    public int nr_copii;
    protected double bill=0.0;
    
    Persoana(){
    nr_adulti =0;
    nr_copii=0;
    numefamilie="Necunoscut";
    }
    public Persoana(int nr_adulti,int nr_copii,String numefamilie){
    this.nr_adulti = nr_adulti;
    this.nr_copii=nr_copii;
    this.numefamilie=numefamilie;
    }
    Persoana(Persoana P){
    this.nr_adulti = P.nr_adulti;
    this.nr_copii=P.nr_copii;
    this.numefamilie=P.numefamilie;
    }
    public double getBill(){
    return bill;
    }
    
    public String toString(){
    return "Familia "+this.numefamilie+" va achita in total suma de "+bill+" lei.";
    }
}
