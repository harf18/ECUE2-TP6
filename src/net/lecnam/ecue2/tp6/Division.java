package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Division {

    int a;
    int b;

    /*Constructeur*/
    public Division(int a, int b){
        this.a = a;
        this.b = b;
    }

    /*Exercice 1*/
    public double division1(){
        return this.a/this.b;
    }

    /*Exercice 2*/
    public double division2(){
        try{
            return this.a/this.b;

        } catch (ArithmeticException e){
            System.out.println("Division par zéro");
            return 0.0;
        }
    }

    /*Exercice 3*/
    public double division3() throws IOException {
        try {
            return this.a / this.b;

        } catch (ArithmeticException e) {
            throw new IOException("Erreur : division par zéro interdite !", e);
        }
    }
}
