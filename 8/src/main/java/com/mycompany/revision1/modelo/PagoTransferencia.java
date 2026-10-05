package com.mycompany.revision1.modelo;

public class PagoTransferencia extends TransaccionPago {
    private String bancoOrigen;

    public PagoTransferencia(String idTransaccion, double montoUSD, String bancoOrigen) {
        super(idTransaccion, montoUSD);
        this.bancoOrigen = bancoOrigen;
    }

    @Override
    public boolean procesarPago() {
        setCompletado(true);
        return true;
    }

    public void adjuntarComprobante() {
        System.out.println("Comprobante de transferencia adjuntado. Banco: " + bancoOrigen);
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }
}
