package com.mycompany.revision1.modelo;

public class BusExpreso extends VehiculoAutonomo {
    private int capacidadPasajeros;

    public BusExpreso(String vin, double velocidadMax, int capacidadPasajeros) {
        super(vin, velocidadMax);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void anunciarSiguienteParada() {
        System.out.println("Anuncio: próxima parada del bus expreso.");
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
}
