package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl(); // Instanciation statique
        MetierImpl metier = new MetierImpl(dao);
        metier.setDao(dao); // Injection des dépendances

        System.out.println("RESULTAT = " +metier.calcul());

        }
}
