package com.mycompany.contenidomedia.modelo;

public class EventoEnVivo extends ContenidoMedia {
    private int latenciaMs;
    private ServidorCDN nodoCDN;

    public EventoEnVivo(String idMedia, String titulo, int duracionSeg, int latenciaMs, ServidorCDN nodoCDN) {
        super(idMedia, titulo, duracionSeg);
        this.latenciaMs = latenciaMs;
        this.nodoCDN = nodoCDN;
    }

    public EventoEnVivo() {
        super();
    }

    public void ajustarCalidadDynamic() {
        if (latenciaMs > 100) {
            System.out.println("Ajustando calidad a una configuración inferior por alta latencia: " + latenciaMs + " ms");
        } else {
            System.out.println("Calidad dinámica estable. Latencia: " + latenciaMs + " ms");
        }
    }

    public int getLatenciaMs() { return latenciaMs; }
    public void setLatenciaMs(int latenciaMs) { this.latenciaMs = latenciaMs; }
    public ServidorCDN getNodoCDN() { return nodoCDN; }
    public void setNodoCDN(ServidorCDN nodoCDN) { this.nodoCDN = nodoCDN; }
}
