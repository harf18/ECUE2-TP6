package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EtudiantService {

    // Exercice 4 : sauvegarde des étudiants
    public void sauve(Etudiants[] etudiants, String cheminCompletFichier) throws IOException {

        Path chemin = Path.of(cheminCompletFichier);

        Files.deleteIfExists(chemin);

        StringBuilder contenu = new StringBuilder();

        // Indique le séparateur utilisé par Excel
        contenu.append("sep=;\n");

        for (Etudiants etudiant : etudiants) {
            contenu.append(etudiant.toString());
        }

        Files.writeString(chemin, contenu.toString(), StandardCharsets.UTF_8);
    }

    // Exercice 5 : chargement des étudiants
    public Etudiants[] charge(String cheminCompletFichier) throws IOException {

        Path chemin = Path.of(cheminCompletFichier);

        List<String> lignes = Files.readAllLines(chemin, StandardCharsets.UTF_8);

        List<Etudiants> etudiants = new ArrayList<>();

        for (String ligne : lignes) {

            // Ignore la ligne sep=; si elle existe
            if (ligne.equals("sep=;") || ligne.isBlank()) {
                continue;
            }

            // Découpe les informations avec le séparateur ;
            String[] donnees = ligne.split(";");

            // Supprime les guillemets
            String ine = donnees[0].replace("\"", "");
            String nom = donnees[1].replace("\"", "");
            String prenom = donnees[2].replace("\"", "");

            // Crée un objet Etudiants
            Etudiants etudiant = new Etudiants(ine, nom, prenom);

            etudiants.add(etudiant);
        }

        // Convertit la liste en tableau
        return etudiants.toArray(new Etudiants[0]);
    }
}