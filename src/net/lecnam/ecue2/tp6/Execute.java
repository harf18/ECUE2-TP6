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

        // Création des étudiants
        Etudiant e1 = new Etudiant("123456", "DIOP", "Alioune");
        Etudiant e2 = new Etudiant("234567", "DUPONT", "Jean");
        Etudiant e3 = new Etudiant("345678", "MARTIN", "Paul");
        Etudiant e4 = new Etudiant("456789", "DURAND", "Marie");

        // Création du tableau
        Etudiant[] etudiants = {e1, e2, e3, e4};

        // Création du service
        EtudiantService service = new EtudiantService();

        // Enregistrement dans le fichier CSV
        try {
            service.sauve(etudiants, "etudiants.csv");

            System.out.println("Fichier etudiants.csv créé avec succès !");

        } catch (IOException e) {
            System.out.println("Erreur lors de la création du fichier : "
                    + e.getMessage());
        }


    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
