package com.mycompany.asientosvuelo.modelo;

public class BoardingDigital extends AsientoVuelo implements CheckInOnLine {
    private String codigoQR;

    public BoardingDigital(String codigoAsiento, double precioTarifa, String codigoQR) {
        super(codigoAsiento, precioTarifa);
        this.codigoQR = codigoQR;
    }

    @Override
    public double calcularEquipajePermitido() {
        return 23.0;
    }

    @Override
    public String emitirBoardingPass() {
        return "Boarding Pass digital emitido. QR: " + codigoQR;
    }

    @Override
    public boolean validarPasaporte(String num) {
        return num != null && !num.trim().isEmpty();
    }

    public String getCodigoQR() { return codigoQR; }
}
