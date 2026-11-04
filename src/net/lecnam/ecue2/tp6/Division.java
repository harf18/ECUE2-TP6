package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    // Pas la meilleure solution car aucun test
    public double division1(int a, int b){
        return a/b;
    }

    // Meilleure solution car plus courte et renvoie à minima une réponse
    public double division2(int a, int b){
        try{
            return a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Erreur : " + e.getMessage());
        }
        return a;
    }

    // Pas la meilleure solution car demande plus de travail sur la mise en place des exceptions
    public double division3(int a, int b) throws IOException {
        try{
            return a/b;
        }
        catch (ArithmeticException e){
            throw new IOException("Erreur de calcul", e);
        }
    }

}
