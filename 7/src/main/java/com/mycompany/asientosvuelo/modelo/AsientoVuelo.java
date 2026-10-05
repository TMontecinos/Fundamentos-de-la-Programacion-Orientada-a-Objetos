package com.mycompany.asientosvuelo.modelo;

public abstract class AsientoVuelo {
    private String codigoAsiento;
    private double precioTarifa;
    private boolean reservado;

    public AsientoVuelo(String codigoAsiento, double precioTarifa) {
        this.codigoAsiento = codigoAsiento;
        this.precioTarifa = precioTarifa;
        this.reservado = false;
    }

    public void reservarAsiento() {
        if (!reservado) {
            reservado = true;
            System.out.println("Asiento " + codigoAsiento + " reservado correctamente.");
        } else {
            System.out.println("El asiento " + codigoAsiento + " ya está reservado.");
        }
    }

    public abstract double calcularEquipajePermitido();

    public String getCodigoAsiento() { return codigoAsiento; }
    public double getPrecioTarifa() { return precioTarifa; }
    public boolean isReservado() { return reservado; }
}
