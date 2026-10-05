package com.mycompany.revision1.modelo;

public class ConsultaGeneral extends AtencionMedica {
    private boolean esRevisionRutina;

    public ConsultaGeneral() {
    }

    public ConsultaGeneral(String codigoAtencion, double costoBase, boolean esRevisionRutina) {
        super(codigoAtencion, costoBase);
        this.esRevisionRutina = esRevisionRutina;
    }

    public boolean isEsRevisionRutina() {
        return esRevisionRutina;
    }

    public void setEsRevisionRutina(boolean esRevisionRutina) {
        this.esRevisionRutina = esRevisionRutina;
    }

    @Override
    public double calcularCostoTotal() {
        return isEsRevisionRutina() ? getCostoBase() : getCostoBase() * 1.10;
    }

    public void emitirRecetaMedica() {
        System.out.println("Receta médica emitida para la atención " + getCodigoAtencion());
    }
}
