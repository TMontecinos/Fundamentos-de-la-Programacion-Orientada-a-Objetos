package com.mycompany.sensorindustrial.modelo;

public class SensorHumedad extends SensorIndustrial {

    private double nivelPuntualPorcentaje;

    public SensorHumedad(String id, String area, boolean activo, double nivel) {
        super(id, area, activo);
        nivelPuntualPorcentaje = nivel;
    }

    public double tomarLectura() {
        return nivelPuntualPorcentaje;
    }

    public double calcularPuntoRocio() {
        return nivelPuntualPorcentaje * 0.1;
    }

    public double getNivelPuntualPorcentaje() {
        return nivelPuntualPorcentaje;
    }

    public void setNivelPuntualPorcentaje(double v) {
        nivelPuntualPorcentaje = v;
    }
}
