package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    // division1() provoque un crach pur et simple si l'appelant ne se méfie pas.
    //
    //division2() masque l'erreur en renvoyant 0.0. C'est dangereux : si l'appelant fait division2(0, 5), le résultat est 0.0. S'il fait division2(10, 0), le résultat est aussi 0.0. Impossible pour le reste du programme de savoir qu'un calcul erroné a eu lieu.
    //
    //division3() signale clairement l'échec et oblige l'utilisateur de la méthode à traiter le cas d'erreur dès la compilation.

    public double division1(int a, int b) {
        return a / b;
    }

    public double division2(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Erreur : Division par zéro impossible !");
            return 0.0;
        }
    }

    public double division3(int a, int b) throws IOException {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            throw new IOException("Erreur : Division par zéro (b = 0 ets interdit)." , e);
        }
    }
}