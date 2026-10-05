package com.mycompany.sensorindustrial;
import com.mycompany.sensorindustrial.modelo.*;
public class SensorIndustrialApp {
 public static void main(String[] args){
  SensorHumedad h=new SensorHumedad("H-01","Invernadero",true,65.5);
  SensorPresion p=new SensorPresion("P-01","Tubería principal",true,32.4,new CalibradorDigital("2026-09-20",0.05));
  SensorTemperatura t=new SensorTemperatura("T-01","Sala de máquinas",true,82.3);
  System.out.println(h);System.out.println("Punto de rocío estimado: "+h.calcularPuntoRocio());
  System.out.println(p);p.medirDeltaPresion();System.out.println(t);t.dispararSirenaEmergencia();t.enviarNotificacionMQTT();
 }
}