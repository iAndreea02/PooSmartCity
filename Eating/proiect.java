
package turism;

import java.util.ArrayList;


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
        ArrayList<Restaurant> vecRestaurant = new ArrayList<Restaurant>();
          vecRestaurant.add(new Restaurant("The Folly","restaurant & lounge","Bloc L1, Strada Domnească 13, Galați 800015", 4.1f,program, 80,true,true,"degetele de pui cu cartofi prajiti si sos de usturoi ","mic dejun fitness","risotto cu creveti si dovlecei","Piept de pui cu sos gorgonzola","Cocktail Green Apple,Jagermeister,Bubble tea,Caramel Frappe,Kozel Dark (Draught)",true,true,pret ));
          vecRestaurant.add(new Restaurant("MALU","restaurant & lounge & bar"," Strada Domnească 13, Galați 800015", 4.3f,program, 128,true,true,"Tigaie cu fășii de vită, brocoli, cartofi dulci, alune sărate","avocado toast","Piept de rață cu reducție de fructe","Somon exotic la cuptor","Cocktail Sex on the beach,Vodka,mint tea,chocolate  Frappe,Peroni Nastro Azzurro - Draught",false,true,pret ));
          vecRestaurant.add(new Restaurant("Acquarello ","restaurant "," Strada Nicolae Bălcescu 25, Galați 800017", 4.5f,program, 90,true,true,"Turnedo Rossini","Salmone Afumicato","Filetto alla pizzaiolo","Tagliattelle con gamberi","Cocktail Hugo,Ursus Retro,Peach Tea,Cosmopolitan,Apa Aqua Carpatica plata,Red Bull,Pepsi,Peroni Nastro Azzurro - Draught",false,true,pret ));
          vecRestaurant.add(new Restaurant("CRAFT Rebel Food ","restaurant "," lângă CEC Bank, Complex Potcoava de Aur, Galați 800070", 4.5f,program, 80,true,false," meniu cu pui tempura","Tigaie taraneasca(mic dejun)","ciorba de burta","muschiulet de porc in sos de piper verde","Cocktail Italian Gipsy,strawberry tea,Caffe Latte Viennese,Apa  perrier plata,Rockstar,Fanta,Corona",false,true,pret ));
          vecRestaurant.add(new Restaurant("Union Jack ","restaurant & pub "," Strada Roșiori 1, Galați 800066", 4.5f,program, 100,true,false," Cotlet de porc la cuptor cu piure și salata de varza, Sote de mazăre  cu piept de pui și castraveți murati ","U.J. Energy Bomb Breakfast","Kettle Fried Coquelet de Bretagne","Union Jack Skillet","Cocktail Cranberry Prosecco,Mojito,Long Island Iced Tea,Apa Minerala / Sparkling Water,Pepsi Max,Sprite,Peroni",false,false,pret ));
          vecRestaurant.add(new Restaurant("Amadeus","restaurant  "," Strada Brăilei 157, Galați 800402", 4.5f,program, 60,true,true,"Aripioare picante la grill cu dulceata de ardei iuti si cartofi pai ","Omletă cu verdeață","Ciorbă de vită, ardei iute, smântână","Salmone Zingarella","Margarita,Frappe cu inghetata / Iced coffee with ice-cream,Evervess,Espresso Dublu / Double Espresso,Apa Minerala / Sparkling Water,Limonada cu ghimbir / Lemonade with ginger,Coca Cola,apa plata izvorul muntelui,Hoegaarden",true,true,pret ));
          vecRestaurant.add(new Restaurant("STAGE - Nice Dining","restaurant  "," Strada General Alexandru Cernat 79, Galați 800105", 4.9f,program, 110,false,true,"MUSCHI DE VITA PE PIATRA INCINSA","Bon Ton","VALDOSTANA DE CURCAN","MUSCHI DE VITA IN CRUSTA DE IERBURI PROVENSALE","Cuba Libre,Cappuccino,Apa Plata / Still Water,Prigat,Fresh Grapefruit / Fresh Squeezed Grapefruit Juice,Mythos,Blue Lagoon,Jack Daniels",false,true,pret ));
          vecRestaurant.add(new Restaurant("Ca Jou","restaurant  "," Strada Domnească Strada Domnească, nr. 100, Galați 800201", 4.5f,program, 100,true,true,"MENIU CIORBA DE PESTE/PIPOTE LA CUPTOR","GOURMAND BREAKFAST","PASTRAV PRAJIT CU MUJDEI SI MAMALIGA","BEEFSTEAK SURF & TURF","Chivas Regal 12 yrs,Bombay Sapphire,Pina Colada,Heineken,Limonada cu menta si ghimbir / Lemonade with mint & ginger,Apa Plata / Still Water,Seven Up",false,true,pret ));
          vecRestaurant.add(new Restaurant("NOAH bar & lounge","restaurant  "," Aleea Faleza Dunării, Galați 800172", 3.4f,program, 140,true,false,"MENIU CIORBA DE PESTE/PIPOTE LA CUPTOR","Omletă Primavera","Pârjoale moldovenești","Mâncare de varză călită cu coastă de porc","Mirinda,Fresh Mixt / Fresh Squeezed Mixt Juice,Carlsberg,Miami Beach,Mexicola",true,true,pret ));
          vecRestaurant.add(new Restaurant("Blue Aqua","pescaresc","Bulevardul Marea Unire 75, Galați 827100", 4.4f,program, 150,true,true,"ciorba de vacuta si friptura cu piure","ou cu bacon impreuna cu gemuri si branzeturi","ciorba de burta si icre de  peste","paste carbonara impreuna cu carne de vita la cuptor cu portocale","aperol spritz , rom,cola si apa minerala",false,false,pret  ));
        System.out.println(vecRestaurant);
        
        ArrayList<Cafenele>vecCafenele = new ArrayList<Cafenele>();
        vecCafenele.add(new Cafenele("FRESH","Bulevardul Basarabiei 20, Galați",4.8f,program,false,"sandwich italian,sandwich cu sunca, sandwich rustic,sandwich cu ton,toast,sandwich grecesc,sandwich caesar","cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,true,true));
        vecCafenele.add(new Cafenele("Old Town Coffee Shop","Strada Domnească 105, Galați 800201",5.0f,program,false,"sandwich pork,sandwich prosciutto, sandwich pollo,sandwich cu ton,sandwich veggie","cafea simpla,cafea cu lapte,cafea lunga,cappuccino,ciocolata calda alba/neagra,frappe,irish coffe,ceaiuri diferite arome,pepsi,sprite,apa minerala,apa plata",pret,true,true,true));
        vecCafenele.add(new Cafenele("Caffello","Strada Eroilor 39, Galați 800119",5.0f,program,false," ","cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,frappe caramelizat,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,false,true));
        vecCafenele.add(new Cafenele("Shisha Caffe","Bloc Select, Strada Domnească 36, Galați 800008",4.2f,program,false,"","Espresso Scurt,Espresso Lung / Long Espresso,Cappuccino Amaretto,Espresso Americano,Caffe Latte Baileys,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,false,true));
        vecCafenele.add(new Cafenele("TED'S COFFEE CO.","Strada Domnească 29, Galați 800008",4.4f,program,true,"","Espresso / Double Espresso,Long Black,Caffe au Lait,Mochaccino,Coconut Macadamia Latte,Flavored Chocolate,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,false,true));
        vecCafenele.add(new Cafenele("Atelierul de cafea","Bloc S3, Strada 1 Decembrie 1918 Parter, Galați 800251",4.7f,program,false," ","cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,false,true));
        vecCafenele.add(new Cafenele("Wise Cafe","Strada Domnească 13, Galați 827100",5.0f,program,false," ","cafea simpla,cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,false,true));
        vecCafenele.add(new Cafenele("L'amour Caffe","Strada Brăilei 200a, Galați 800337",5.0f,program,false,"sandwich cu sunca, sandwich rustic,sandwich cu ton,toast,","cafea simpla,cafea cu lapte,cafea lunga,fanta,cola,apa minerala,apa plata",pret,true,true,true));
        vecCafenele.add(new Cafenele("Amerijan Cafee","Str. Doctor Alexandru Carnabel, Galați",4.4f,program,false,"","cafea cu lapte,cafea lunga,,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,false,true));
        vecCafenele.add(new Cafenele("Dream Coffee Shop @Bălcescu","Nr.3k, Strada Nicolae Bălcescu, Galați 800041",4.8f,program,false,"sandwich cu sunca,sandwich cu ton,toast,sandwich grecesc,sandwich caesar",",cafea cu lapte,cafea lunga,cafea lunga cu lapte,frappe,irish coffe,fanta,cola,apa minerala,apa plata",pret,true,true,true));
        System.out.println(vecCafenele);      

    }
}