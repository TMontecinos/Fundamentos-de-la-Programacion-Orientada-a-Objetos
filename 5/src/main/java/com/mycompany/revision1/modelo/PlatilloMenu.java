package com.mycompany.revision1.modelo;

public abstract class PlatilloMenu {
    private String idPlato;
    private String nombre;
    private double precioBase;

    public PlatilloMenu(String idPlato, String nombre, double precioBase) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

    public void prepararPlato() {
        System.out.println("Preparando plato: " + nombre);
    }

    public String getIdPlato() { return idPlato; }
    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
}
