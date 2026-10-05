package com.mycompany.contenidomedia.modelo;

public class ServidorCDN {
    private String ipNodo;
    private double anchoBandaGbps;

    public ServidorCDN(String ipNodo, double anchoBandaGbps) {
        this.ipNodo = ipNodo;
        this.anchoBandaGbps = anchoBandaGbps;
    }

    public ServidorCDN() {
    }

    public void balancearCarga() {
        System.out.println("Balanceando carga del nodo CDN " + ipNodo + " (" + anchoBandaGbps + " Gbps)");
    }

    public String getIpNodo() { return ipNodo; }
    public void setIpNodo(String ipNodo) { this.ipNodo = ipNodo; }
    public double getAnchoBandaGbps() { return anchoBandaGbps; }
    public void setAnchoBandaGbps(double anchoBandaGbps) { this.anchoBandaGbps = anchoBandaGbps; }
}
