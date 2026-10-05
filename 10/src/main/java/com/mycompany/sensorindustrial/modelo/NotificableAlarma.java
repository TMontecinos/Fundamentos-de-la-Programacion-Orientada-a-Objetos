package com.mycompany.sensorindustrial.modelo;

public interface NotificableAlarma {

    void dispararSirenaEmergencia();

    void enviarNotificacionMQTT();
}
