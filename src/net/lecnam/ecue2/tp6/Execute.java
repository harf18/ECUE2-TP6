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
        Etudiants[] listeEtudiants = new Etudiants[4];

        listeEtudiants[0] = new Etudiants(1111111, "Valentin", "Dujour");
        listeEtudiants[1] = new Etudiants(2222222, "Andrea", "Andreoli");
        listeEtudiants[2] = new Etudiants(3333333, "Alioune", "Diop");
        listeEtudiants[3] = null;

        String cheminFichier = "test.txt";

        EtudiantService service = new EtudiantService();
        try {
            // Puisque la méthode lance une IOException, l'appel doit obligatoirement être dans un try-catch
            service.save(listeEtudiants, cheminFichier);
            System.out.println("Sauvegarde réussie dans le fichier : " + cheminFichier);

        } catch (IOException e) {
            // En cas de problème (disque plein, accès refusé, etc.), on attrape l'erreur ici
            System.out.println("Erreur lors de la sauvegarde du fichier : " + e.getMessage());
        }
    }

    private static void exercice5(){


    }

    private static void exercice6(){


    }

}
