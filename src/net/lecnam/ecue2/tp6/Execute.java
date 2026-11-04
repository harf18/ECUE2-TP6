package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        //exercice3();

        exercice4();

        //exercice5();

        //exercice6();

    }

    public static double division1(int a, int b) {
        return (double) a / b;
    }

    private static void exercice1() {

        int a = 7;
        int b = 2;

        double resultat = division1(a, b);
        System.out.println(a + " / " + b + " = " + resultat);
    }

    private static void exercice2() {

        int a = 10;
        int b = 0;

        Division d = new Division();
        double resultat = d.division2(a, b);
        System.out.println(a + " / " + b + " = " + resultat);
    }

    private static void exercice3() {

        int a = 10;
        int b = 0;

        Division d = new Division();
        try {
            double resultat = d.division3(a, b);
            System.out.println(a + " / " + b + " = " + resultat);
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    private static void exercice4() {

        Etudiants[] etudiants = {
                new Etudiants("1234567890A", "Alice", "Martin"),
                new Etudiants("2345678901B", "Bob", "Durand"),
                new Etudiants("3456789012C", "Chloé", "Bernard")
        };

        EtudiantService service = new EtudiantService();
        try {
            service.sauve(etudiants, "etudiants.csv");
            System.out.println("Fichier etudiants.csv créé");
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    private static void exercice5() {

    }

    private static void exercice6() {

    }

}