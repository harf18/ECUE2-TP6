package net.lecnam.ecue2.tp6;

public class Etudiants {

    private String ine;
    private String prenom;
    private String nom;

    public Etudiants(String ine, String prenom, String nom) {
        this.ine = ine;
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getIne() {
        return ine;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    // Format CSV : "INE","Nom","Prenom" suivi d'un retour à la ligne
    @Override
    public String toString() {
        return "\"" + ine + "\",\"" + nom + "\",\"" + prenom + "\"\n";
    }
}