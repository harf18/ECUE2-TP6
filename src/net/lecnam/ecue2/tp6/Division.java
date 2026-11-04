package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    public double division2(int a, int b) {
        try {
            return (double) (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro (" + e.getMessage() + ")");
            return Double.NaN;
        }
    }

    public double division3(int a, int b) throws IOException {
        try {
            return (double) (a / b);
        } catch (ArithmeticException e) {
            throw new IOException("Division par zéro impossible : " + a + " / " + b, e);
        }
    }
}