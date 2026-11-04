package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Execute {

    public static void main(String[] args) {
        // exercice1();
        // exercice2();
        // exercice3();
        // exercice4();
        exercice5();
        // exercice6();
    }

    private static void exercice1() {
        Division div = new Division();
        double resultat = div.division1(10, 0);
        System.out.println("Résultat : " + resultat);
    }

    private static void exercice2() {
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

    private static void exercice4() {
        Etudiants[] etudiants = new Etudiants[] {
                new Etudiants("123456789AA", "DUPONT", "Jean"),
                new Etudiants("987654321BB", "MARTIN", "Sophie"),
                new Etudiants("456789123CC", "DURAND", "Pierre")
        };

        EtudiantService service = new EtudiantService();

        try {
            service.sauve(etudiants, "etudiants.csv");
            System.out.println("Le fichier etudiants.csv a été créé avec succès à la racine du projet.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
        }
    }

    private static void exercice5() {
        EtudiantService service = new EtudiantService();

        try {
            Etudiants[] etudiants = service.charge("etudiants.csv");
            System.out.println("--- Liste des noms des étudiants chargés ---");
            for (Etudiants etudiant : etudiants) {
                System.out.println(etudiant.getNom());
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        }
    }

    private static void exercice6() {

    }
}