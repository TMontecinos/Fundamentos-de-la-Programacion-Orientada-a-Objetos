package com.mycompany.revision1.modelo;

public class DronEntrega extends VehiculoAutonomo implements RastreableGPS {
    private double pesoMaxPaquete;

    public DronEntrega(String vin, double velocidadMax, double pesoMaxPaquete) {
        super(vin, velocidadMax);
        this.pesoMaxPaquete = pesoMaxPaquete;
    }

    @Override
    public String obtenerCoordenadas() {
        return "Latitud: -33.4489, Longitud: -70.6693";
    }

    @Override
    public void transmitirTelemetria() {
        System.out.println("Transmitiendo telemetría del dron. Coordenadas: " + obtenerCoordenadas());
    }

    public double getPesoMaxPaquete() {
        return pesoMaxPaquete;
    }
}
