package net.lecnam.ecue2.tp6;

public class Etudiants {

    int INE;
    String nom;
    String prenom;

    /*Constructeur 1*/
    public Etudiants(int INE, String prenom, String nom) {
        this.INE = INE;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "{INE=" + INE + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }
}
