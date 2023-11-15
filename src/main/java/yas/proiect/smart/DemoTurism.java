/*
 
 */
package yas.proiect.smart;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class DemoTurism {

    public static void main(String[] args) {

        ParcPublic parc1 = new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10);
        ParcPublic parc0 = new ParcPublic();
        ParcPublic parc_copy = new ParcPublic(parc1);
        Muzeu muzeu1 = new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{10, 18}), 4.9f, (new double[]{5, 10}), "Stiinte ale naturii", 1930, 988);
        Muzeu muzeu0 = new Muzeu();
        Muzeu muzeu_copy = new Muzeu(muzeu1);
        CasaMemoriala casa1 = new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE");
        CasaMemoriala casa0 = new CasaMemoriala();
        CasaMemoriala casa_copy = new CasaMemoriala(casa1);

        ArrayList<Muzeu> vecMuzeu = new ArrayList<Muzeu>();
        vecMuzeu.add(new Muzeu());
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        vecMuzeu.add(new Muzeu("Muzeul din Gradina Botanica", "Faleza Galati", (new int[]{11, 17}), 4.9f, (new double[]{3.9, 5.2}), "Stiinte ale naturii", 1930, 988));
        
        ArrayList<CasaMemoriala> vecCasaMemoriala = new ArrayList<CasaMemoriala>();
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        vecCasaMemoriala.add(new CasaMemoriala("Casa Cuza Voda", "Strada Alexandru Ioan Cuza", (new int[]{12, 19}), 4.3f, (new double[]{3.5, 8.2}), "Casa", 1939, "Alexandru Ioan Cuza", "LA 158 DE ANI DE LA UNIREA PRINCIPATELOR ROMÂNE"));
        
        ArrayList<ParcPublic> vecParcPublic=new ArrayList<ParcPublic>();
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        vecParcPublic.add(new ParcPublic("Gradina Publica", "Strada Domneasca", (new int[]{10, 18}), 4.5f, (new double[]{8.5, 10.5}), 988.0, 5, 7, 10));
        
        System.out.println(muzeu1);
    }

}
