package com.mycompany.contenidomedia.modelo;

public class PeliculaCinema extends ContenidoMedia {
    private String director;

    public PeliculaCinema(String idMedia, String titulo, int duracionSeg, String director) {
        super(idMedia, titulo, duracionSeg);
        this.director = director;
    }

    public PeliculaCinema() {
        super();
    }

    public void mostrarTrailer() {
        System.out.println("Mostrando trailer de: " + getTitulo());
    }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
}
