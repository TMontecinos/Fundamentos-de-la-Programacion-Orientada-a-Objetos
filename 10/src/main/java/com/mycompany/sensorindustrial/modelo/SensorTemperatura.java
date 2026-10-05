package com.mycompany.sensorindustrial.modelo;

public class SensorTemperatura extends SensorIndustrial implements NotificableAlarma {

    private double gradosCelsius;

    public SensorTemperatura(String id, String area, boolean activo, double grados) {
        super(id, area, activo);
        gradosCelsius = grados;
    }

    public double tomarLectura() {
        return gradosCelsius;
    }

    public void dispararSirenaEmergencia() {
        System.out.println("¡ALARMA! Sirena activada: " + gradosCelsius + " °C.");
    }

    public void enviarNotificacionMQTT() {
        System.out.println("MQTT: sensor " + getIdSensor() + ", temperatura=" + gradosCelsius + " °C.");
    }

    public double getGradosCelsius() {
        return gradosCelsius;
    }

    public void setGradosCelsius(double v) {
        gradosCelsius = v;
    }
}
