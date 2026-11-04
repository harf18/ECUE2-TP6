package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EtudiantService {


    public static void sauve(Etudiant[] etudiants, String cheminCompletFichier) throws IOException {
        Path p = Paths.get(cheminCompletFichier);

        for (Etudiant etudiant : etudiants) {
            Files.writeString(Paths.get(cheminCompletFichier), etudiant.toString(), StandardOpenOption.APPEND);
        }
    }

    public static Etudiant[] charge(String cheminCompletFichier) throws IOException {
        Path p = Paths.get(cheminCompletFichier);
        List<String> lines = Files.readAllLines(p);
        int nEtudiant = 0;
        Etudiant[] etudiants = new Etudiant[lines.size()];

        for (String line : lines) {
            String[] part = line.split(",");

            if (part.length == 3)
            {
                etudiants[nEtudiant] = new Etudiant(part[2], part[1], part[0]);
                nEtudiant++;
          ;  }

        }


        return etudiants;
    }
}
