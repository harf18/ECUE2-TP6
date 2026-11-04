package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        exercice3();

        //exercice4();

        //exercice5();

        //exercice6();

    }

    private static void exercice1() {
        Division div = new Division();
        double resultat = div.division1(10, 0);
        System.out.println("Résultat : " + resultat);
    }

    private static void exercice2(){
        Division div = new Division();
        double resultat = div.division2(10, 0);
        System.out.println("Résultat : " + resultat);
    }

    private static void exercice3() {
        Division div = new Division();
        try {
            double resultat = div.division3(10, 0);
            System.out.println("Résultat : " + resultat);
        } catch (IOException e) {
            System.err.println("Exception capturée dans exercice3 : " + e.getMessage());
        }
    }

    private static void exercice4(){


    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
