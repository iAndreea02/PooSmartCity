
package turism;


public class proiect {
    public static void main(String args[])
    {
   Restaurant a =new Restaurant();
   System.out.println(a);
   int[] program={10,22};
   double[] pret={48.5,15.99,20.99,25.99};
   Restaurant b =new Restaurant("Blue Aqua","pescaresc","str. regiment 11 siret", 4.5f,program, 100,true,true,"ciorba de vacuta si friptura cu piure","ou cu bacon impreuna cu gemuri si branzeturi","ciorba de burta si icre de  peste","paste carbonara impreuna cu carne de vita la cuptor cu portocale","aperol spritz , rom,cola si apa minerala",false,false,pret );
    System.out.println(b);
    Cafenele c=new Cafenele();
        System.out.println(c);
        program[0]=7;
        program[1]=4;
    Cafenele d=new Cafenele("FRESH","str basarabiei nr. 56",4.8f,program,false,"sandwich italian,sandwich cu sunca, sandwich rustic,sandwich cu ton,toast,sandwich grecesc,sandwich caesar","cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,true,true);
        System.out.println(d);
    
    } 
}
