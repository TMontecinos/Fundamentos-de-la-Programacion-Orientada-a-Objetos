package com.mycompany.revision1.modelo;

public class EntradaGourmet extends PlatilloMenu {
    private boolean esFrio;

    public EntradaGourmet(String idPlato, String nombre, double precioBase, boolean esFrio) {
        super(idPlato, nombre, precioBase);
        this.esFrio = esFrio;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * (esFrio ? 1.05 : 1.10);
    }

    public boolean verificarAlergenos() {
        return true;
    }

    public boolean isEsFrio() { return esFrio; }
}
