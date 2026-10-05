package com.mycompany.revision1.modelo;

public class PagoCripto extends TransaccionPago implements VerificableBlockchain {
    private String walletDestino;
    private String redBlockchain;

    public PagoCripto(String idTransaccion, double montoUSD, String walletDestino,
                      String redBlockchain) {
        super(idTransaccion, montoUSD);
        this.walletDestino = walletDestino;
        this.redBlockchain = redBlockchain;
    }

    @Override
    public boolean procesarPago() {
        setCompletado(true);
        return true;
    }

    @Override
    public String obtenerHashConfirmacion() {
        return "HASH-" + getIdTransaccion() + "-" + redBlockchain;
    }

    @Override
    public int numeroConfirmaciones() {
        return isCompletado() ? 6 : 0;
    }

    public String getWalletDestino() {
        return walletDestino;
    }

    public String getRedBlockchain() {
        return redBlockchain;
    }
}
