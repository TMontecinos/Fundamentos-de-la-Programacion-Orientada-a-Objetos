package com.mycompany.revision1.modelo;

public class LibroImpreso extends RecursoBiblioteca {
    private int numPaginas;
    private String tipoEmpastado;

    public LibroImpreso() {
        super();
    }

    public LibroImpreso(int numPaginas, String tipoEmpastado, String id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numPaginas = numPaginas;
        this.tipoEmpastado = tipoEmpastado;
    }

    public void hojearPaginas() {
        System.out.println("Hojear paginas del libro: " + getTitulo());
    }

    public int getNumPaginas() { return numPaginas; }
    public String getTipoEmpastado() { return tipoEmpastado; }
    public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }
    public void setTipoEmpastado(String tipoEmpastado) { this.tipoEmpastado = tipoEmpastado; }

    @Override
    public String toString() {
        return "LibroImpreso{" + "numPaginas=" + numPaginas + ", tipoEmpastado='" + tipoEmpastado + '\'' + ", id='" + getId() + '\'' + ", titulo='" + getTitulo() + '\'' + '}';
    }
}
