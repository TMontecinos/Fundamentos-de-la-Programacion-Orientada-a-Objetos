package com.mycompany.revision1.modelo;

public class TaxiAutonomo extends VehiculoAutonomo {
    private double tarifaPorKm;
    private BateriaLitio packBaterias;

    public TaxiAutonomo(String vin, double velocidadMax, double tarifaPorKm, BateriaLitio packBaterias) {
        super(vin, velocidadMax);
        this.tarifaPorKm = tarifaPorKm;
        this.packBaterias = packBaterias;
    }

    public void solicitarRecargaRapida() {
        System.out.println("Solicitando recarga rápida. Carga actual: " + packBaterias.getPorcentajeCarga() + "%");
    }

    public double getTarifaPorKm() { return tarifaPorKm; }
    public BateriaLitio getPackBaterias() { return packBaterias; }
}
