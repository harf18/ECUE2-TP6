package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EtudiantService {

    public void sauve(Etudiants[] etudiants, String cheminCompletFichier) throws IOException {

        Path fichier = Paths.get(cheminCompletFichier);

        // Si le fichier existe déjà, on le supprime avant de le recréer
        Files.deleteIfExists(fichier);
        Files.createFile(fichier);

        // Écriture ligne par ligne (toString() se termine par un retour à la ligne)
        for (Etudiants etudiant : etudiants) {
            Files.writeString(fichier, etudiant.toString(), StandardOpenOption.APPEND);
        }
    }
}