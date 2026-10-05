package com.mycompany.asientosvuelo.modelo;

public class AsientoBusiness extends AsientoVuelo {
    private boolean accesoLounge;
    private CabinaPrivada suiteCabina;

    public AsientoBusiness(String codigoAsiento, double precioTarifa, boolean accesoLounge, CabinaPrivada suiteCabina) {
        super(codigoAsiento, precioTarifa);
        this.accesoLounge = accesoLounge;
        this.suiteCabina = suiteCabina;
    }

    @Override
    public double calcularEquipajePermitido() {
        return 32.0;
    }

    public void solicitarChampagne() {
        System.out.println("Champagne solicitado para el asiento " + getCodigoAsiento() + ".");
    }

    public boolean isAccesoLounge() { return accesoLounge; }
    public CabinaPrivada getSuiteCabina() { return suiteCabina; }
}
