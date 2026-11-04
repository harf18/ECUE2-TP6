
package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EtudiantService {

    // Exercice 4 : enregistrer les étudiants dans un fichier CSV
    public void sauve(Etudiant[] etudiants, String cheminCompletFichier)
            throws IOException {

        Path chemin = Paths.get(cheminCompletFichier);

        Files.deleteIfExists(chemin);

        StringBuilder contenu = new StringBuilder();

        for (Etudiant etudiant : etudiants) {
            contenu.append(etudiant.toString());
        }

        Files.write(chemin, contenu.toString().getBytes(StandardCharsets.UTF_8));
    }

    // Exercice 5 : charger les étudiants depuis un fichier CSV
    public Etudiant[] charge(String cheminCompletFichier) throws IOException {

        Path chemin = Paths.get(cheminCompletFichier);

        // Lire toutes les lignes du fichier
        List<String> lignes = Files.readAllLines(chemin, StandardCharsets.UTF_8);

        // Liste pour stocker les étudiants
        List<Etudiant> etudiants = new ArrayList<>();

        // Parcourir chaque ligne
        for (String ligne : lignes) {

            // Découper la ligne à chaque virgule
            String[] donnees = ligne.split(",");

            // Vérifier qu'il y a bien trois informations
            if (donnees.length != 3) {
                throw new IOException("Format CSV invalide : " + ligne);
            }

            // Supprimer les guillemets
            String ine = donnees[0].replace("\"", "");
            String nom = donnees[1].replace("\"", "");
            String prenom = donnees[2].replace("\"", "");

            // Créer un nouvel objet Etudiant
            Etudiant etudiant = new Etudiant(ine, nom, prenom);

            etudiants.add(etudiant);
        }

        // Transformer la liste en tableau
        return etudiants.toArray(new Etudiant[0]);
    }
}
