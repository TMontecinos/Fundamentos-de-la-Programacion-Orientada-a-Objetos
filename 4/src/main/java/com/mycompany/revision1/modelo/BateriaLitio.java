package com.mycompany.revision1.modelo;

public class BateriaLitio {
    private double capacidadKWh;
    private int porcentajeCarga;

    public BateriaLitio(double capacidadKWh, int porcentajeCarga) {
        this.capacidadKWh = capacidadKWh;
        this.porcentajeCarga = porcentajeCarga;
    }

    public int getPorcentajeCarga() {
        return porcentajeCarga;
    }

    public double getCapacidadKWh() {
        return capacidadKWh;
    }
}
