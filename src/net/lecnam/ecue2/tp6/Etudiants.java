package net.lecnam.ecue2.tp6;

public class Etudiants {
    String ine ;
    String nom;
    String prenom;

    public Etudiants(String ine, String nom, String prenom) {
        this.ine = ine;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Accesseurs (Getters)
    public String getIne() {
        return ine;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // Redéfinition de toString() pour générer une ligne CSV : "INE","Nom","Prenom"\n
    @Override
    public String toString() {
        return "\"" + ine + "\",\"" + nom + "\",\"" + prenom + "\"\n";
    }

}
