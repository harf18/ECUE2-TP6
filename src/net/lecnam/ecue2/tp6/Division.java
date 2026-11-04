package net.lecnam.ecue2.tp6;

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
}
