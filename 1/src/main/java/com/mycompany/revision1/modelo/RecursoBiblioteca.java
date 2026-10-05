package com.mycompany.revision1.modelo;

public abstract class RecursoBiblioteca {
    private String id;
    private String titulo;
    private boolean disponible;

    public RecursoBiblioteca() {
        this.disponible = true;
    }

    public RecursoBiblioteca(String id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Recurso prestado: " + titulo);
        } else {
            System.out.println("El recurso no esta disponible: " + titulo);
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Recurso devuelto: " + titulo);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setId(String id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return "RecursoBiblioteca{" + "id='" + id + '\'' + ", titulo='" + titulo + '\'' + ", disponible=" + disponible + '}';
    }
}
