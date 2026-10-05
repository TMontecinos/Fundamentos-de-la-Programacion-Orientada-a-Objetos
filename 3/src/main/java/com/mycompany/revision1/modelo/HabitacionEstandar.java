package com.mycompany.revision1.modelo;

public class HabitacionEstandar extends HabitacionHotel {
    private int camasSupletorias;

    public HabitacionEstandar(int numeroHabitacion, double precioNocheBase, int camasSupletorias) {
        super(numeroHabitacion, precioNocheBase);
        this.camasSupletorias = camasSupletorias;
    }

    @Override
    public double calcularCostoEstadia(int noches) {
        return (getPrecioNocheBase() + camasSupletorias * 15000.0) * noches;
    }

    public void solicitarToallasExtra() {
        System.out.println("Se solicitaron toallas extra para la habitación " + getNumeroHabitacion() + ".");
    }

    public int getCamasSupletorias() {
        return camasSupletorias;
    }
}
