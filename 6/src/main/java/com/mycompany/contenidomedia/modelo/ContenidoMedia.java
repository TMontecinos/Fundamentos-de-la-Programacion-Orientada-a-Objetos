package com.mycompany.contenidomedia.modelo;

public abstract class ContenidoMedia {
    private String idMedia;
    private String titulo;
    private int duracionSeg;

    public ContenidoMedia(String idMedia, String titulo, int duracionSeg) {
        this.idMedia = idMedia;
        this.titulo = titulo;
        this.duracionSeg = duracionSeg;
    }

    public ContenidoMedia() {
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }

    public void pausar() {
        System.out.println("Pausando: " + titulo);
    }

    public String getIdMedia() { return idMedia; }
    public void setIdMedia(String idMedia) { this.idMedia = idMedia; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public int getDuracionSeg() { return duracionSeg; }
    public void setDuracionSeg(int duracionSeg) { this.duracionSeg = duracionSeg; }
}
