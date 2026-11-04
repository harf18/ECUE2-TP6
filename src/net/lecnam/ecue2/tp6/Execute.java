package net.lecnam.ecue2.tp6;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        exercice2();

        //exercice3();

        //exercice4();

        //exercice5();

        //exercice6();

    }

    public static double division1(int a, int b) {
        return (double) a / b;
    }

    private static void exercice1() {

        int a = 7;
        int b = 2;

        double resultat = division1(a, b);
        System.out.println(a + " / " + b + " = " + resultat);
    }

    private static void exercice2() {

        int a = 10;
        int b = 0;

        Division d = new Division();
        double resultat = d.division2(a, b);
        System.out.println(a + " / " + b + " = " + resultat);
    }

    private static void exercice3() {

    }

    private static void exercice4() {

    }

    private static void exercice5() {

    }

    private static void exercice6() {

    }

}