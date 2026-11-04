package net.lecnam.ecue2.tp6;

public class Etudiants {

    String ine, nom, prenom;

    public Etudiants(String ine, String nom, String prenom){
        this.ine = ine;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString(){
        return '"' + this.ine + "\",\"" + this.nom + "\",\"" + this.prenom + '"';
    }

}
