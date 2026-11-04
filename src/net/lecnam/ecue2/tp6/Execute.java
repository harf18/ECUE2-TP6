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
        int a = 10;
        int b = 0;
        Division d1 = new Division(a,b);
        d1.division1();
    }

    private static void exercice2(){
        int a = 10;
        int b = 0;
        Division d2 = new Division(a,b);
        d2.division2();
    }

    private static void exercice3(){
        int a = 10;
        int b = 0;
        Division d3 = new Division(a,b);

        try {
            System.out.println("Résultat : " + d3.division3());

        } catch (IOException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    private static void exercice4(){


    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
