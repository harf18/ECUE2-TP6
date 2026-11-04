package net.lecnam.ecue2.tp6;

public class Division {
    // Exercice 1
    public double division1(int a, int b) {
        return a / b;
    }
    // Exercice 2
    public double division2(int a, int b) {

        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro impossible !");
            return Double.NaN;
        }
    }
}
