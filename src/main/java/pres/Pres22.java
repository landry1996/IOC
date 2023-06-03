package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres22 {
    public static void main(String[] args) throws Exception{
        //DaoImpl dao = new DaoImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("donner la classe la couche Dao: ");
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
         IDao dao= (IDao) cdao.getConstructor().newInstance();
        System.out.println(dao.getData());


      // MetierImpl metier = new MetierImpl();
        System.out.println("donner la classe la couche Metier: ");
        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cmetier.getConstructor().newInstance();

        //metier.setDao(dao); // Injection des dépendances
        Method setDao = cmetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);// Injection des dépendances
        System.out.println("RESULTAT = "+metier.calcul());

    }
}
