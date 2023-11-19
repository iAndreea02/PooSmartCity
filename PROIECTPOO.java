/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proiect.proiectpoo;

import java.util.ArrayList;
import java.util.Scanner;
public class PROIECTPOO {

    public static void main(String[] args) {
        
        //UTILIZATOR
        String nume;
        String prenume;
        
        int nrAdulti;
        int nrCopii;
        int varsta;
        int nrNopti;
        
        double factura;
        
        //OBIECTE
      
        Hotel h =new Hotel();
        System.out.println(h);
        ArrayList<Hotel> vectorHotel= new ArrayList<Hotel>();
        vectorHotel.add(new Hotel("Steluta",4.5f,( new double[] {450.50}),"Bd Crizantemelor, Nr.15",new int[] {10,22},30, true, false, false,true,true)) ;
        vectorHotel.add( new Hotel("VEGA",3.2f, ( new double[] {545.50}),"Str. Sperantei, Nr.70",new int[] {9,22},45, true, true, true,true,false));
        vectorHotel.add(new Hotel("MERCUR",5.0f,( new double[] {850.60}),"Str.Domneasca, nr 1",new int[] {8,20},20, false, false, true,true,true));
        vectorHotel.add(new Hotel("Resort Dunarea",4.2f, ( new double[] {650.55}),"Bld Traian Vuia",new int[] {6,22},80, true, true, true,true,false)); 
        vectorHotel.add(new Hotel("Danubius",3.2f,( new double[] {677.50}),"Str Basarabiei, Nr.15",new int[] {10,22},30, true, false, false,true,true)) ;
        vectorHotel.add( new Hotel("Angel",3.2f, ( new double[] {574.50}),"Str. Cluj, Nr.75",new int[] {9,22},45, true, true, true,true,false));
        vectorHotel.add(new Hotel("NEXUS",5.0f,( new double[] {690.60}),"Str.Regiment Siret, nr 74",new int[] {8,23},110, false, false, true,true,true));
        vectorHotel.add(new Hotel("SATURN",2.2f, ( new double[] {238.55}),"Bld Calugareni, nr 43",new int[] {6,22},80, true, true, true,true,false)); 
        vectorHotel.add(new Hotel("Galmond",3.89f, ( new double[] {350.57}),"Bld. Mihai Eminescu, Nr 45",new int[] {10,22},90, true, false, true,true,false)) ;
        vectorHotel.add(new Hotel("Ibis",3.4f, ( new double[] {363.57}),"Bld. Vlad Tepes, Nr 377",new int[] {10,22},100, true, false, true,true,false)) ;
       
        Apartament A =new Apartament();
        System.out.println(A);
        ArrayList<Apartament> vectorApartament= new ArrayList<Apartament>();
        vectorApartament.add(new Apartament("ApartHotel", 3.22f,( new double[] {450.50}),"Str. Brailei , Nr.120",new int[] {10,22},"dublu",4,2,23,5,true,true,true));
        vectorApartament.add(new Apartament("Belvedere", 4.32f,( new double[] {670.50}),"Str. Henri Coanda, Nr.13",new int[] {11,22},"triplu",5,3,53,6,false,true,true));
        vectorApartament.add(new Apartament("FRUMI", 3.22f,( new double[] {783.59}),"Bld. Mihail Petrini, Nr 33",new int[] {8,20},"dublu",4,2,66,2,true,true,false));
        vectorApartament.add(new Apartament("POO", 5.00f,( new double[] {120.50}),"Str. Otelarilor, nr 47",new int[] {11,23},"King",5,3,45,4,false,true,false));
        vectorApartament.add(new Apartament("Angeli", 4.42f,( new double[] {320.50}),"Str. George Cosbuc , Nr.43",new int[] {10,22},"dublu",4,2,20,1,true,true,true));
        vectorApartament.add(new Apartament("Paul", 3.32f,( new double[] {330.55}),"Str. Frunzei, Nr.42",new int[] {10,23},"triplu",5,3,35,6,false,true,true));
        vectorApartament.add(new Apartament("Alina", 3.33f,( new double[] {433.49}),"Bld. Basarabiei, Nr 34",new int[] {8,24},"dublu",4,2,10,1,true,true,false));
        vectorApartament.add(new Apartament("Apartamentul lu' Sesam", 2.5f,( new double[] {222.55}),"Str. Mihai Bravo, nr 47",new int[] {11,23},"King",5,3,55,4,false,true,false));
        vectorApartament.add(new Apartament("Apartamentul 21", 3.22f,( new double[] {993.59}),"Bld. Ciprian Porumbescu, Nr 30",new int[] {11,20},"dublu",4,2,8,1,true,true,false));
        vectorApartament.add(new Apartament("Novac", 1.4f,( new double[] {321.93}),"Str. Siderurgistilor, nr 47",new int[] {7,23},"King",5,3,34,2,false,true,false));
        
        
        
        
        //PROGRAM
        String optiune;
        int opt;

        Scanner in;
        in = new Scanner(System.in);
        

        //--------------------------------**DATE UTILIZATOR**--------------------------------------------------
        System.out.println("Buna ziua!! Va rugam sa introduceti urmatoarele date!");
        System.out.println("Nume: ");
        nume = in.next();
        System.out.println("Prenume: ");
        prenume = in.next();

        System.out.println("Doriti sa faceti o rezervare? Y  N ");
        optiune = in.next();
   
        if(optiune.equals("Y")){
             System.out.println("Numarul de adulti?");
             nrAdulti=in.nextInt();
       
             System.out.println("Numarul de copii?");
             nrCopii=in.nextInt();
             
            
          int aux=nrCopii;
          if(aux>0){
          for(int i=0;i<aux;i++){
               System.out.println("Introduceti varsta copiilor!");
               varsta=in.nextInt();
               if(varsta>=17){
                   System.out.println("ATENTIE!! Acest copil va fi considerat adult ");
                 
               }
                   
           }
               
        }
            System.out.println("Pe cate nopti se va face rezervarea? ");
            nrNopti=in.nextInt();
            
            System.out.println();
            System.out.println("Ati introdus datele: ");
            System.out.println("Nume: "+nume);
            System.out.println("Prenume: "+prenume);
            System.out.println("Numarul de adulti: "+nrAdulti+ " si numarul de copii: "+ nrCopii); 
            System.out.println("Rezervarea o sa fie pe: "+nrNopti+" nopti.");
            System.out.println();
            System.out.println("Afisam optiunile de hotel: ");
            System.out.println(vectorHotel);
            System.out.println(vectorApartament);
            System.out.println("Va rugam sa alegeti cifra hotelului la care doriti sa faceti rezervarea:!");
            opt=in.nextInt();
            //factura=vectorHotel.get(opt-1).factura(nrNopti,nrAdulti,nrCopii);
            //System.out.println("Factura dvs. "+factura);

        }
    }
}