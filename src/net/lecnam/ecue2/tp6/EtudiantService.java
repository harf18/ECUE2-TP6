package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EtudiantService {


    public static void sauve(Etudiant[] etudiants, String cheminCompletFichier) throws IOException {
        Path p = Paths.get(cheminCompletFichier);

        for (Etudiant etudiant : etudiants) {
            Files.writeString(Paths.get(cheminCompletFichier), etudiant.toString(), StandardOpenOption.APPEND);
        }
    }
}
