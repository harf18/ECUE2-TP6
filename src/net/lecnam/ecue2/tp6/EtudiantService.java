package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class EtudiantService {

    public static void sauve(Etudiant[] etudiants, String cheminCompletFichier) throws IOException {
        Path path = Paths.get(cheminCompletFichier);
        Files.deleteIfExists(path);
        List<String> lignes = new ArrayList<>();
        if (etudiants != null) {
            for (Etudiant etudiant : etudiants) {
                if (etudiant != null) {
                    lignes.add(etudiant.toString());
                }
            }
        }
        Files.write(path, lignes, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }

    public static List<Etudiant> charge(String cheminCompletFichier) throws IOException {
        Path f = Paths.get(cheminCompletFichier);
        List<String> allLines = Files.readAllLines(f);

        List<Etudiant> listeEtudiants = new ArrayList<>();

        for (String line : allLines) {
            if (line == null || line.trim().isEmpty()) {
                continue;
            }

            String[] parts = line.split(",");
            Etudiant etudiant = new Etudiant(parts[0], parts[1], parts[2]);
            listeEtudiants.add(etudiant);
        }
        return listeEtudiants;
    }
}
