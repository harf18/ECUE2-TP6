package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    // Exercice 1
    public double division1(int a, int b) {
        return a / b;
    }

    // Exercice 2
    public double division2(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro impossible !");
            return -1;
        }
    }

    // Exercice 3
    // La solution 3 est pertinente car elle oblige
    // le développeur à gérer l'exception.
    public double division3(int a, int b) throws IOException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new IOException("Erreur : division par zéro impossible !");
        }
    }

}