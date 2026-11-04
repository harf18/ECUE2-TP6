
package net.lecnam.ecue2.tp6;

public class Etudiant {

    private String ine;
    private String nom;
    private String prenom;

    // Constructeur
    public Etudiant(String ine, String nom, String prenom) {
        this.ine = ine;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters
    public String getIne() {
        return ine;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "\"" + ine + "\",\"" + nom + "\",\"" + prenom + "\"\n";
    }
}
