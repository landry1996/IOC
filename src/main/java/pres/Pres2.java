package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception{
        //DaoImpl dao = new DaoImpl();
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
         IDao dao= (IDao) cdao.getConstructor().newInstance();
        System.out.println(dao.getData());


      // MetierImpl metier = new MetierImpl();
        String metierClassName = scanner.nextLine();
        Class cmetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cmetier.getConstructor(IDao.class).newInstance(dao);

        //metier.setDao(dao); // Injection des dépendances
       // Method setDao = cmetier.getDeclaredMethod("setDao",IDao.class);
       // setDao.invoke(metier,dao);// Injection des dépendances

    }
}
