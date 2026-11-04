package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class EtudiantService {

    public void sauve(Etudiants[] etudiants, String cheminCompletFichier) throws IOException {

        Path chemin = Path.of(cheminCompletFichier);

        // Supprime le fichier s'il existe déjà
        Files.deleteIfExists(chemin);

        // Construit le contenu du fichier
        StringBuilder contenu = new StringBuilder();

        for (Etudiants etudiant : etudiants) {
            contenu.append(etudiant.toString());
        }

        // Ecrit le contenu dans le fichier
        Files.writeString(chemin, contenu.toString(), StandardCharsets.UTF_8);
    }
}