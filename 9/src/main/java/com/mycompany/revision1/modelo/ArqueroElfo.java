package com.mycompany.revision1.modelo;

public class ArqueroElfo extends PersonajeRPG implements LanzadorHabilidades {
    private double precisionPorcentaje;

    public ArqueroElfo() {
    }

    public ArqueroElfo(String nombre, int puntosVida, int nivel, double precisionPorcentaje) {
        super(nombre, puntosVida, nivel);
        this.precisionPorcentaje = precisionPorcentaje;
    }

    @Override
    public void atacar(PersonajeRPG objetivo) {
        System.out.println(getNombre() + " dispara una flecha contra " + objetivo.getNombre() + ".");
        objetivo.recibirDanio(18 + getNivel());
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        System.out.println(getNombre() + " ejecuta Lluvia de Flechas.");
    }

    @Override
    public int tiempoEnfriamientoTurnos() {
        return 3;
    }

    public double getPrecisionPorcentaje() { return precisionPorcentaje; }
    public void setPrecisionPorcentaje(double precisionPorcentaje) { this.precisionPorcentaje = precisionPorcentaje; }
}
