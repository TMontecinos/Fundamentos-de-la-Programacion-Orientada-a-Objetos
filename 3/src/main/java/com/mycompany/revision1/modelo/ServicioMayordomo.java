package com.mycompany.revision1.modelo;

public class ServicioMayordomo {
    private String nombreMayordomo;
    private int turnosDisponibles;

    public ServicioMayordomo(String nombreMayordomo, int turnosDisponibles) {
        this.nombreMayordomo = nombreMayordomo;
        this.turnosDisponibles = turnosDisponibles;
    }

    public void atenderLlamadaVIP() {
        if (turnosDisponibles > 0) {
            turnosDisponibles--;
            System.out.println("El mayordomo " + nombreMayordomo + " está atendiendo la llamada VIP.");
        } else {
            System.out.println("El mayordomo " + nombreMayordomo + " no tiene turnos disponibles.");
        }
    }

    public String getNombreMayordomo() {
        return nombreMayordomo;
    }

    public int getTurnosDisponibles() {
        return turnosDisponibles;
    }
}
