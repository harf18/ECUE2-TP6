package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.List;

public class EtudiantService {

    public void save(Etudiants[] etudiants, String cheminCompletFichier) throws IOException{
        Path chemin = Paths.get(cheminCompletFichier);

        /*Initialiser une liste qui contiendra chaque ligne*/
        List<String> lignes = new ArrayList<>();

        /*Parcourir toutes les lignes*/
        for (Etudiants etu : etudiants) {
            if (etu != null) {
                lignes.add(etu.toString());
            }
        }

        /*.write écrase le fichier s'il existe déjà OU le créer s'il n'existe pas*/
        Files.write(chemin, lignes, StandardCharsets.UTF_8);
    }
}
