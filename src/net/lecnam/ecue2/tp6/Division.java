package net.lecnam.ecue2.tp6;

public class Division {

    public double division2(int a, int b) {
        try {
            return (double) (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro (" + e.getMessage() + ")");
            return Double.NaN;
        }
    }
}