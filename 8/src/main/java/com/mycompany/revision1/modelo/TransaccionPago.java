package com.mycompany.revision1.modelo;

public abstract class TransaccionPago {
    private String idTransaccion;
    private double montoUSD;
    private boolean completado;

    public TransaccionPago(String idTransaccion, double montoUSD) {
        this.idTransaccion = idTransaccion;
        this.montoUSD = montoUSD;
        this.completado = false;
    }

    public abstract boolean procesarPago();

    public String generarComprobante() {
        return "Comprobante de transacción " + idTransaccion
                + " | Monto: USD " + String.format("%.2f", montoUSD)
                + " | Completado: " + completado;
    }

    protected void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public double getMontoUSD() {
        return montoUSD;
    }

    public boolean isCompletado() {
        return completado;
    }
}
