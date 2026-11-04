package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) throws IOException {

        //exercice1();

        //exercice2();

        exercice3();

        //exercice4();

        //exercice5();

        //exercice6();

    }

    private static void exercice1(){
        System.out.println(Division.division1(10,0));

    }

    private static void exercice2(){
        System.out.println(Division.division2(10,0));
        System.out.println(Division.division2(10,5));

    }

    private static void exercice3() throws IOException {
        //double resultat = Division.division3(10, 0);
        //System.out.println("Le résultat est : " + resultat);
        double resultat = Division.division3(10, 5);
        System.out.println("Le résultat est : " + resultat);
    }

    private static void exercice4(){


    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
