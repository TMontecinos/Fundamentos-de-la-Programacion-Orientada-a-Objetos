package com.mycompany.revision1.modelo;

public class MagoElemental extends PersonajeRPG {
    private int manaPool;
    private LibroHechizos grimorio;

    public MagoElemental() {
    }

    public MagoElemental(String nombre, int puntosVida, int nivel, int manaPool, LibroHechizos grimorio) {
        super(nombre, puntosVida, nivel);
        this.manaPool = manaPool;
        this.grimorio = grimorio;
    }

    @Override
    public void atacar(PersonajeRPG objetivo) {
        System.out.println(getNombre() + " lanza un hechizo elemental contra " + objetivo.getNombre() + ".");
        objetivo.recibirDanio(20 + getNivel());
    }

    public void invocarTormenta() {
        System.out.println(getNombre() + " invoca una tormenta de " + grimorio.getElementoDominante() + ".");
    }

    public int getManaPool() { return manaPool; }
    public void setManaPool(int manaPool) { this.manaPool = manaPool; }
    public LibroHechizos getGrimorio() { return grimorio; }
    public void setGrimorio(LibroHechizos grimorio) { this.grimorio = grimorio; }
}
