package com.mycompany.revision1.modelo;

public abstract class PersonajeRPG {
    private String nombre;
    private int puntosVida;
    private int nivel;

    public PersonajeRPG() {
    }

    public PersonajeRPG(String nombre, int puntosVida, int nivel) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivel = nivel;
    }

    public abstract void atacar(PersonajeRPG objetivo);

    public void recibirDanio(int puntos) {
        if (puntos < 0) {
            puntos = 0;
        }
        puntosVida -= puntos;
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        System.out.println(nombre + " recibe " + puntos + " de daño. Vida restante: " + puntosVida);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getPuntosVida() { return puntosVida; }
    public void setPuntosVida(int puntosVida) { this.puntosVida = puntosVida; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
}
