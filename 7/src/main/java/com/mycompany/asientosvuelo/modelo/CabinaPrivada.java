package com.mycompany.asientosvuelo.modelo;

public class CabinaPrivada {
    private int numPantallaHD;
    private boolean asientoReclinable180;

    public CabinaPrivada(int numPantallaHD, boolean asientoReclinable180) {
        this.numPantallaHD = numPantallaHD;
        this.asientoReclinable180 = asientoReclinable180;
    }

    public void activarMasaje() {
        System.out.println("Masaje activado en la cabina privada.");
    }

    public int getNumPantallaHD() { return numPantallaHD; }
    public boolean isAsientoReclinable180() { return asientoReclinable180; }
}
