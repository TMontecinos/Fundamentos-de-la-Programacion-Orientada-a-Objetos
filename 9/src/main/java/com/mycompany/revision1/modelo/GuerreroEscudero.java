package com.mycompany.revision1.modelo;

public class GuerreroEscudero extends PersonajeRPG {
    private int armaduraPesada;

    public GuerreroEscudero() {
    }

    public GuerreroEscudero(String nombre, int puntosVida, int nivel, int armaduraPesada) {
        super(nombre, puntosVida, nivel);
        this.armaduraPesada = armaduraPesada;
    }

    @Override
    public void atacar(PersonajeRPG objetivo) {
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + " con su espada.");
        objetivo.recibirDanio(15 + getNivel());
    }

    public void bloquearConEscudo() {
        System.out.println(getNombre() + " bloquea el próximo ataque con su escudo.");
    }

    public int getArmaduraPesada() { return armaduraPesada; }
    public void setArmaduraPesada(int armaduraPesada) { this.armaduraPesada = armaduraPesada; }
}
