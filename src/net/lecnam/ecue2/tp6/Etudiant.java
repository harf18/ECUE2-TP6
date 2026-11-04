package net.lecnam.ecue2.tp6;

import java.io.IOException;

public class Etudiant {
    String ine;
    String nom;
    String prenom;

    public Etudiant(String ine, String nom, String prenom) {
        this.ine = ine;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getIne() {
        return ine;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return  ine + "," + nom + "," + prenom;
    }
}
