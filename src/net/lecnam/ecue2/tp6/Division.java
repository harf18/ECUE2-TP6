package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {
    int a;
    int b;

    public static double division1(int a, int b) {
        return a/b;
    }

    public static double division2(int a, int b) {
        if (b != 0) {
            return a/b;
        } else {
            System.out.println("Un nombre ne peut pas être divisé par 0");
        }
        return -1;
    }

    public static double division3(int a, int b) throws IOException {
        try {
            int res = a / b;
            return (double) res;
        } catch (ArithmeticException e) {
            throw new IOException("Erreur : division par zéro impossible.", e);
        }
    }
}
