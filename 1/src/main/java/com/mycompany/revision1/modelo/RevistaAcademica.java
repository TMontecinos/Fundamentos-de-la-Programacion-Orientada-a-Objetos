package com.mycompany.revision1.modelo;

public class RevistaAcademica extends RecursoBiblioteca implements Descargable {
    private int numeroEdicion;
    private String doiLicencia;

    public RevistaAcademica() {
        super();
    }

    public RevistaAcademica(int numeroEdicion, String doiLicencia, String id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numeroEdicion = numeroEdicion;
        this.doiLicencia = doiLicencia;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando revista academica: " + getTitulo());
    }

    public int getNumeroEdicion() { return numeroEdicion; }
    public String getDoiLicencia() { return doiLicencia; }
    public void setNumeroEdicion(int numeroEdicion) { this.numeroEdicion = numeroEdicion; }
    public void setDoiLicencia(String doiLicencia) { this.doiLicencia = doiLicencia; }

    @Override
    public String toString() {
        return "RevistaAcademica{" + "numeroEdicion=" + numeroEdicion + ", doiLicencia='" + doiLicencia + '\'' + ", id='" + getId() + '\'' + ", titulo='" + getTitulo() + '\'' + '}';
    }
}
