package com.mycompany.revision1.modelo;

public class AudioLibro extends RecursoBiblioteca {
    private double duracionMinutos;
    private SoporteTecnico soporte;

    public AudioLibro() {
        super();
    }

    public AudioLibro(double duracionMinutos, SoporteTecnico soporte, String id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.duracionMinutos = duracionMinutos;
        this.soporte = soporte;
    }

    public void reproducirMuestra() {
        System.out.println("Reproduciendo muestra de: " + getTitulo() + " en formato " + soporte.getNombreFormato());
    }

    public double getDuracionMinutos() { return duracionMinutos; }
    public SoporteTecnico getSoporte() { return soporte; }
    public void setDuracionMinutos(double duracionMinutos) { this.duracionMinutos = duracionMinutos; }
    public void setSoporte(SoporteTecnico soporte) { this.soporte = soporte; }

    @Override
    public String toString() {
        return "AudioLibro{" + "duracionMinutos=" + duracionMinutos + ", soporte=" + soporte + ", id='" + getId() + '\'' + ", titulo='" + getTitulo() + '\'' + '}';
    }
}
