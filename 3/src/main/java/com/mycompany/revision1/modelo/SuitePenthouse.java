package com.mycompany.revision1.modelo;

public class SuitePenthouse extends HabitacionHotel {
    private boolean jacuzziPrivado;
    private ServicioMayordomo mayordomoVIP;

    public SuitePenthouse(int numeroHabitacion, double precioNocheBase, boolean jacuzziPrivado, ServicioMayordomo mayordomoVIP) {
        super(numeroHabitacion, precioNocheBase);
        this.jacuzziPrivado = jacuzziPrivado;
        this.mayordomoVIP = mayordomoVIP;
    }

    @Override
    public double calcularCostoEstadia(int noches) {
        double costo = getPrecioNocheBase() * noches;
        if (jacuzziPrivado) {
            costo += 50000.0 * noches;
        }
        return costo;
    }

    public void solicitarCenaGourmet() {
        System.out.println("Cena gourmet solicitada para la suite Penthouse " + getNumeroHabitacion() + ".");
        mayordomoVIP.atenderLlamadaVIP();
    }

    public boolean isJacuzziPrivado() {
        return jacuzziPrivado;
    }

    public ServicioMayordomo getMayordomoVIP() {
        return mayordomoVIP;
    }
}
