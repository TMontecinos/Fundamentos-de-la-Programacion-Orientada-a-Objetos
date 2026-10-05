package com.mycompany.revision1.modelo;

public class SuiteTematica extends HabitacionHotel implements SanitizableAutomatico {
    private String tematicaDecoracion;

    public SuiteTematica(int numeroHabitacion, double precioNocheBase, String tematicaDecoracion) {
        super(numeroHabitacion, precioNocheBase);
        this.tematicaDecoracion = tematicaDecoracion;
    }

    @Override
    public double calcularCostoEstadia(int noches) {
        return getPrecioNocheBase() * noches + 30000.0 * noches;
    }

    @Override
    public boolean iniciarCicloDesinfeccion() {
        System.out.println("Ciclo automático de desinfección iniciado en la suite temática " + getNumeroHabitacion() + ".");
        return true;
    }

    @Override
    public String obtenerReporteSeguridad() {
        return "Reporte de seguridad: suite " + getNumeroHabitacion()
                + " sanitizada correctamente. Temática: " + tematicaDecoracion + ".";
    }

    public String getTematicaDecoracion() {
        return tematicaDecoracion;
    }
}
