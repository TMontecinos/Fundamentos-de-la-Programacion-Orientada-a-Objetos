package com.mycompany.asientosvuelo.modelo;

public class AsientoTurista extends AsientoVuelo {
    private boolean incluyeSnack;

    public AsientoTurista(String codigoAsiento, double precioTarifa, boolean incluyeSnack) {
        super(codigoAsiento, precioTarifa);
        this.incluyeSnack = incluyeSnack;
    }

    @Override
    public double calcularEquipajePermitido() {
        return 23.0;
    }

    public void elegirMenuEstandar() {
        System.out.println("Menú estándar seleccionado para el asiento " + getCodigoAsiento() + ".");
    }

    public boolean isIncluyeSnack() { return incluyeSnack; }
}
