package com.mycompany.revision1.modelo;

public class Quirofano {
    private String codigoSala;
    private boolean esterilizado;

    public Quirofano() {
    }

    public Quirofano(String codigoSala, boolean esterilizado) {
        this.codigoSala = codigoSala;
        this.esterilizado = esterilizado;
    }

    public String getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
