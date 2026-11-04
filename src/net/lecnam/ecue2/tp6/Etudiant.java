package net.lecnam.ecue2.tp6;

public class Etudiant {
    private  String prenom;
    private String nom;
    private String ine;

    public Etudiant(String prenom, String nom, String ine) {
        this.prenom = prenom;
        this.nom = nom;
        this.ine = ine;
    }

    @Override
    public String toString() {
        return String.format("\"%s\",\"%s\",\"%s\"\n", ine, nom, prenom);
    }
}
