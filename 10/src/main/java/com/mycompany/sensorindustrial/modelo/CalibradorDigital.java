package com.mycompany.sensorindustrial.modelo;

public class CalibradorDigital {

    private String fechaUltimaCalibracion;
    private double margenError;

    public CalibradorDigital(String fecha, double margen) {
        fechaUltimaCalibracion = fecha;
        margenError = margen;
    }

    public void ajustarCeroAbsoluto() {
        System.out.println("Cero absoluto ajustado.");
    }

    public String getNombreFormato() {
        return fechaUltimaCalibracion;
    }

    public String getFechaUltimaCalibracion() {
        return fechaUltimaCalibracion;
    }

    public double getMargenError() {
        return margenError;
    }

    public void setFechaUltimaCalibracion(String v) {
        fechaUltimaCalibracion = v;
    }

    public void setMargenError(double v) {
        margenError = v;
    }

    public String toString() {
        return "CalibradorDigital{fecha='" + fechaUltimaCalibracion + "', margenError=" + margenError + "}";
    }
}
