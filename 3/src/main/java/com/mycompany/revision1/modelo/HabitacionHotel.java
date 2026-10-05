package com.mycompany.revision1.modelo;

public abstract class HabitacionHotel {
    private int numeroHabitacion;
    private double precioNocheBase;
    private boolean ocupada;

    public HabitacionHotel(int numeroHabitacion, double precioNocheBase) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioNocheBase = precioNocheBase;
        this.ocupada = false;
    }

    public abstract double calcularCostoEstadia(int noches);

    public void realizarCheckIn() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Check-in realizado en la habitación " + numeroHabitacion + ".");
        } else {
            System.out.println("La habitación " + numeroHabitacion + " ya está ocupada.");
        }
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public double getPrecioNocheBase() {
        return precioNocheBase;
    }

    public boolean isOcupada() {
        return ocupada;
    }
}
