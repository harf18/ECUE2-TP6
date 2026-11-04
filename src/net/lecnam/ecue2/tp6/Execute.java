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

    private static void exercice1() {
        Division d = new Division();

        double resultat = d.division1(10, 0);

        System.out.println(resultat);
    }

    private static void exercice2() {
        Division d = new Division();

        double resultat = d.division2(10, 0);

        System.out.println(resultat);
    }

    private static void exercice3() {
        Division d = new Division();

        try {
            double resultat = d.division3(10, 0);
            System.out.println(resultat);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void exercice4() {

        Etudiants[] etudiants = {
                new Etudiants("20112003251", "Mouchard", "Yannis"),
                new Etudiants("15012006261", "Nouchet", "Zackarie"),
                new Etudiants("12102004106", "Forestier", "Julien")
        };

        EtudiantService service = new EtudiantService();

        try {
            service.sauve(etudiants, "etudiants.csv");
            System.out.println("Fichier etudiants.csv créé avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de la création du fichier : " + e.getMessage());
        }
    }

    private static void exercice5() {

    }

    private static void exercice6() {

    }

}