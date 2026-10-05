package com.mycompany.revision1.modelo;

public abstract class VehiculoAutonomo {
    private String vin;
    private double velocidadMax;
    private boolean enRuta;

    public VehiculoAutonomo(String vin, double velocidadMax) {
        this.vin = vin;
        this.velocidadMax = velocidadMax;
        this.enRuta = false;
    }

    public void iniciarRuta(String destino) {
        enRuta = true;
        System.out.println("Vehículo " + vin + " iniciando ruta hacia: " + destino);
    }

    public void frenarEmergencia() {
        enRuta = false;
        System.out.println("Frenado de emergencia activado para el vehículo " + vin + ".");
    }

    public String getVin() { return vin; }
    public double getVelocidadMax() { return velocidadMax; }
    public boolean isEnRuta() { return enRuta; }
}
