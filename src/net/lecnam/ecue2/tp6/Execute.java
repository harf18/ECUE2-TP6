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
        Division.division1(10, 0);
    }

    private static void exercice2(){
        Division.division2(10, 0);
    }

    private static void exercice3() {
        try {
            Division.division3(10, 0);
        } catch (IOException e) {
            System.out.println("Division par zéro dans exercice 3, impossible !!!");
        }
    }

    private static void exercice4(){


    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
