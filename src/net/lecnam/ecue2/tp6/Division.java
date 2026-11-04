package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    public static double division1 (int a, int b){
        return a / b;
    }

    public static  double division2 (int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro, impossible !!!");
            return 0.0;
        }
    }

    public static double division3 (int a, int b) throws IOException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new IOException();
        }
    }
}
