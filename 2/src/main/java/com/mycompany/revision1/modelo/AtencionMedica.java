package com.mycompany.revision1.modelo;

public abstract class AtencionMedica {
    private String codigoAtencion;
    private double costoBase;

    public AtencionMedica() {
    }

    public AtencionMedica(String codigoAtencion, double costoBase) {
        this.codigoAtencion = codigoAtencion;
        this.costoBase = costoBase;
    }

    public String getCodigoAtencion() {
        return codigoAtencion;
    }

    public void setCodigoAtencion(String codigoAtencion) {
        this.codigoAtencion = codigoAtencion;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public abstract double calcularCostoTotal();

    public void registrarDiagnostico(String diag) {
        System.out.println("Diagnóstico registrado: " + diag);
    }
}
