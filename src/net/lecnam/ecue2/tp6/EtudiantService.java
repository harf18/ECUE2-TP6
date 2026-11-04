package net.lecnam.ecue2.tp6;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EtudiantService {

    public void sauve(Etudiants[] etudiants, String cheminCompletFichier) throws IOException {

        Path path = Paths.get(cheminCompletFichier);
        try {

            List<String> lignes = new ArrayList<>();
            for (Etudiants e : etudiants) {
                lignes.add(e.toString());
            }

            Files.write(path, lignes);
        }
        catch (IOException e){
            System.err.println("Erreur lors de l'écriture : " + e.getMessage());
        }
    }

    public Etudiants[] charge(String cheminCompletFichier) throws IOException {
        Path path = Paths.get(cheminCompletFichier);

        List<String> lignes = Files.readAllLines(path);

        Etudiants[] etudiants = new Etudiants[lignes.size()];

        for (int i = 0; i < lignes.size(); i++) {
            String ligne = lignes.get(i);

            String[] donnees = ligne.split(",");

            String ine = donnees[0].replace("\"", "").trim();
            String nom = donnees[1].replace("\"", "").trim();
            String prenom = donnees[2].replace("\"", "").trim();

            etudiants[i] = new Etudiants(ine, nom, prenom);
        }

        return etudiants;
    }

}
