package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();

        exercice3();

        exercice4();

        exercice5();

        //exercice6();

    }

    private static void exercice1(){
        Division.division1(10, 0);
    }

    private static void exercice2(){
        Division.division2(10, 0);
    }

    // La méthode 3 est la meilleur car elle rend l'exception "checked" et force le devellopeur à s'en occuper.
    private static void exercice3() {
        try {
            Division.division3(10, 0);
        } catch (IOException e) {
            System.out.println("Division par zéro dans exercice 3, impossible !!!");
        }
    }

    private static void exercice4(){
        Path p = Paths.get(String.valueOf(Paths.get("")), "etudiant.csv");

        try {
            Files.deleteIfExists(p);
            Files.createFile(p);
        } catch (IOException e) {
            System.out.println();
        }

        Etudiant[] etudiants = {
          new Etudiant("Al", "Debaran", "RZ19992831"),
          new Etudiant("Regulus", "Corneas", "RZ15998456"),
          new Etudiant("Betelgueuse", "Romani-Contee", "RZ111555658")
        };

        try {
            EtudiantService.sauve(etudiants, p.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void exercice5() {
        Path p = Paths.get(String.valueOf(Paths.get("")), "etudiant.csv");
        Etudiant[] etudiants;

        try {
            etudiants = EtudiantService.charge(p.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Etudiant etudiant : etudiants)
        {
            System.out.println(etudiant);
        }

    }

    private static void exercice6(){


    }

}
