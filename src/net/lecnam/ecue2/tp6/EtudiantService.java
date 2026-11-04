
package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EtudiantService {

    public void sauve(Etudiant[] etudiants, String cheminCompletFichier)
            throws IOException {

        Path chemin = Paths.get(cheminCompletFichier);

        // Supprimer le fichier s'il existe déjà
        Files.deleteIfExists(chemin);

        // Construire le contenu du fichier
        StringBuilder contenu = new StringBuilder();

        for (Etudiant etudiant : etudiants) {
            contenu.append(etudiant.toString());
        }

        // Écrire le contenu dans le fichier
        Files.write(chemin, contenu.toString().getBytes(StandardCharsets.UTF_8));
    }
}
