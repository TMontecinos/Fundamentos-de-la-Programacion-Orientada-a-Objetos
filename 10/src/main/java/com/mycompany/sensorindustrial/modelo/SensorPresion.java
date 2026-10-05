package com.mycompany.sensorindustrial.modelo;

public class SensorPresion extends SensorIndustrial {

    private double presionPSI;
    private CalibradorDigital dispositivoCalibrador;

    public SensorPresion(String id, String area, boolean activo, double presion, CalibradorDigital calibrador) {
        super(id, area, activo);
        presionPSI = presion;
        dispositivoCalibrador = calibrador;
    }

    public double tomarLectura() {
        return presionPSI;
    }

    public void medirDeltaPresion() {
        System.out.println("Variación de presión: " + presionPSI + " PSI.");
        if (dispositivoCalibrador != null) {
            System.out.println(dispositivoCalibrador);
        }
    }

    public double getPresionPSI() {
        return presionPSI;
    }

    public void setPresionPSI(double v) {
        presionPSI = v;
    }

    public CalibradorDigital getDispositivoCalibrador() {
        return dispositivoCalibrador;
    }

    public void setDispositivoCalibrador(CalibradorDigital v) {
        dispositivoCalibrador = v;
    }
}
