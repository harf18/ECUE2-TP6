package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) throws IOException {

        //exercice1();

        //exercice2();

        //exercice3();

        exercice4();

        //exercice5();

        //exercice6();

    }

    private static void exercice1(){

        int a = 10;
        int b = 0;
        Division diviseur = new Division();
        System.out.println(diviseur.division1(a, b));

    }

    private static void exercice2(){

        int a = 10;
        int b = 0;
        Division diviseur = new Division();
        System.out.println(diviseur.division2(a, b));

    }

    private static void exercice3() throws IOException {

        int a = 10;
        int b = 0;
        Division diviseur = new Division();
        System.out.println(diviseur.division3(a, b));

    }

    private static void exercice4() throws IOException {

        Etudiants etud1 = new Etudiants("56165165gk", "Lissier", "Paul");
        Etudiants etud2 = new Etudiants("116655651e", "Detekt", "Yves");
        Etudiants[] listEtud = new Etudiants[2];
        listEtud[0] = etud1;
        listEtud[1] = etud2;
        EtudiantService serv = new EtudiantService();
        serv.sauve(listEtud, "C:/Users/ELE6a983e3a05dd7/Documents/sauvegarde.csv");

    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
