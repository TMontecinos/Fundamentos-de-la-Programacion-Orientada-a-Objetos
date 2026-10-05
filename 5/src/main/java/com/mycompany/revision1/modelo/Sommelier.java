package com.mycompany.revision1.modelo;

public class Sommelier {
    private String nombreExperto;
    private int certificacionNivel;

    public Sommelier(String nombreExperto, int certificacionNivel) {
        this.nombreExperto = nombreExperto;
        this.certificacionNivel = certificacionNivel;
    }

    public String recomendarVino(String plato) {
        if (plato == null || plato.isBlank()) {
            return "Vino blanco de la casa";
        }
        return "Maridaje recomendado para " + plato + ": Cabernet Sauvignon";
    }

    public String getNombreExperto() { return nombreExperto; }
    public int getCertificacionNivel() { return certificacionNivel; }
}
