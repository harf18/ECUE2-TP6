package net.lecnam.ecue2.tp6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
}