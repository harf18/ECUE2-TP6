package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EtudiantService {

    public void sauve(Etudiants[] etudiants, String cheminCompletFichier) throws IOException {
        Path path = Paths.get(cheminCompletFichier);

        Files.deleteIfExists(path);

        for (Etudiants etudiant : etudiants) {
            Files.writeString(
                    path,
                    etudiant.toString(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        }
    }

    public Etudiants[] charge(String cheminCompletFichier) throws IOException {
        Path path = Paths.get(cheminCompletFichier);

        List<String> lignes = Files.readAllLines(path);

        Etudiants[] etudiants = new Etudiants[lignes.size()];

        for (int i = 0; i < lignes.size(); i++) {
            String ligne = lignes.get(i).trim();

            if (ligne.startsWith("\"") && ligne.endsWith("\"")) {
                ligne = ligne.substring(1, ligne.length() - 1);
            }

            String[] elements = ligne.split("\",\"");

            String ine = elements[0];
            String nom = elements[1];
            String prenom = elements[2];

            etudiants[i] = new Etudiants(ine, nom, prenom);
        }

        return etudiants;
    }
}