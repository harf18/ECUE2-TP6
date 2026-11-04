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

}
