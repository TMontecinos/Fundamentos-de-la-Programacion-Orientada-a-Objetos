package com.mycompany.revision1.modelo;

public class Telemedicina extends AtencionMedica implements FacturableDigital {
    private String plataformaVideo;

    public Telemedicina() {
    }

    public Telemedicina(String codigoAtencion, double costoBase, String plataformaVideo) {
        super(codigoAtencion, costoBase);
        this.plataformaVideo = plataformaVideo;
    }

    public String getPlataformaVideo() {
        return plataformaVideo;
    }

    public void setPlataformaVideo(String plataformaVideo) {
        this.plataformaVideo = plataformaVideo;
    }

    @Override
    public double calcularCostoTotal() {
        return getCostoBase() * 0.90;
    }

    @Override
    public String generarFacturaXML() {
        return "<factura><codigo>" + getCodigoAtencion()
                + "</codigo><tipo>Telemedicina</tipo><total>"
                + calcularCostoTotal() + "</total></factura>";
    }

    @Override
    public void enviarPorCorreo(String email) {
        System.out.println("Factura XML enviada a: " + email);
    }
}
