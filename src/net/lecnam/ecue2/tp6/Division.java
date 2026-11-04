package net.lecnam.ecue2.tp6;

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

        } catch (Exception e){
            System.out.println("Division par zéro");
            return 0.0;
        }
    }
}
