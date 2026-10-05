package com.mycompany.revision1;

import com.mycompany.revision1.modelo.AudioLibro;
import com.mycompany.revision1.modelo.Descargable;
import com.mycompany.revision1.modelo.LibroImpreso;
import com.mycompany.revision1.modelo.RecursoBiblioteca;
import com.mycompany.revision1.modelo.RevistaAcademica;
import com.mycompany.revision1.modelo.SoporteTecnico;

public class RevisionBiblioteca {
    public static void main(String[] args) {
        LibroImpreso libro = new LibroImpreso(350, "Tapa dura", "LIB001", "Programacion Java", true);
        SoporteTecnico soporte = new SoporteTecnico("MP3", true);
        AudioLibro audio = new AudioLibro(420.5, soporte, "AUD001", "Java en audio", true);
        RevistaAcademica revista = new RevistaAcademica(25, "10.1234/biblioteca.25", "REV001", "Revista de Tecnologia", true);

        RecursoBiblioteca[] recursos = {libro, audio, revista};

        System.out.println("=== RECURSOS DE LA BIBLIOTECA ===");
        for (RecursoBiblioteca recurso : recursos) {
            System.out.println(recurso);
            recurso.prestar();
            System.out.println("Disponible: " + recurso.isDisponible());
            recurso.devolver();
        }

        libro.hojearPaginas();
        audio.reproducirMuestra();

        Descargable descargable = revista;
        descargable.descargar();
    }
}
