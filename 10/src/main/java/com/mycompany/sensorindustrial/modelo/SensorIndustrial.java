package com.mycompany.sensorindustrial.modelo;

public abstract class SensorIndustrial {

    private String idSensor, ubicacionArea;
    private boolean activo;

    public SensorIndustrial(String idSensor, String ubicacionArea, boolean activo) {
        this.idSensor = idSensor;
        this.ubicacionArea = ubicacionArea;
        this.activo = activo;
    }

    public abstract double tomarLectura();

    public void recalibrar() {
        System.out.println("Sensor " + idSensor + " recalibrado.");
    }

    public String getIdSensor() {
        return idSensor;
    }

    public String getUbicacionArea() {
        return ubicacionArea;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdSensor(String v) {
        idSensor = v;
    }

    public void setUbicacionArea(String v) {
        ubicacionArea = v;
    }

    public void setActivo(boolean v) {
        activo = v;
    }

    public String toString() {
        return "Sensor " + idSensor + " | Área: " + ubicacionArea + " | Activo: " + activo + " | Lectura: " + tomarLectura();
    }
}
