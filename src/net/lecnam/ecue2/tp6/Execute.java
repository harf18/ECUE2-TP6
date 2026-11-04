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

    private static void exercice1(){
        Division division = new Division();

        double resultat = division.division1(10, 0);

        System.out.println("Résultat : " + resultat);

    }

    private static void exercice2(){
        Division division = new Division();

        double resultat = division.division2(10, 0);

        System.out.println("Résultat : " + resultat);


    }

    private static void exercice3(){

        Division division = new Division();

        try {
            double resultat = division.division3(10, 0);
            System.out.println("Résultat : " + resultat);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void exercice4(){


    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
