package com.mycompany.revision1.modelo;

public class CirugiaUrgencia extends AtencionMedica {
    private double horasDuracion;
    private Quirofano quirofanoAsignado;

    public CirugiaUrgencia() {
    }

    public CirugiaUrgencia(String codigoAtencion, double costoBase, double horasDuracion, Quirofano quirofanoAsignado) {
        super(codigoAtencion, costoBase);
        this.horasDuracion = horasDuracion;
        this.quirofanoAsignado = quirofanoAsignado;
    }

    public double getHorasDuracion() {
        return horasDuracion;
    }

    public void setHorasDuracion(double horasDuracion) {
        this.horasDuracion = horasDuracion;
    }

    public Quirofano getQuirofanoAsignado() {
        return quirofanoAsignado;
    }

    public void setQuirofanoAsignado(Quirofano quirofanoAsignado) {
        this.quirofanoAsignado = quirofanoAsignado;
    }

    @Override
    public double calcularCostoTotal() {
        return getCostoBase() + (horasDuracion * 150000.0);
    }

    public void prepararEquipo() {
        if (quirofanoAsignado != null && quirofanoAsignado.isEsterilizado()) {
            System.out.println("Equipo preparado en quirófano " + quirofanoAsignado.getCodigoSala());
        } else {
            System.out.println("No se puede preparar el equipo: el quirófano no está esterilizado.");
        }
    }
}
