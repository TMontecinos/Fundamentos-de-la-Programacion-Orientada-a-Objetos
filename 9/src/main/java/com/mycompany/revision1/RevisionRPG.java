package com.mycompany.revision1;

import com.mycompany.revision1.modelo.*;

public class RevisionRPG {
    public static void main(String[] args) {
        LibroHechizos grimorio = new LibroHechizos(5, "fuego");
        GuerreroEscudero guerrero = new GuerreroEscudero("Arthas", 150, 5, 80);
        MagoElemental mago = new MagoElemental("Merlín", 100, 6, 120, grimorio);
        ArqueroElfo arquero = new ArqueroElfo("Legolas", 90, 5, 95.5);

        System.out.println("=== PRUEBA DEL SISTEMA RPG ===");
        guerrero.atacar(mago);
        mago.invocarTormenta();
        arquero.atacar(guerrero);
        arquero.ejecutarHabilidadEspecial();
        guerrero.bloquearConEscudo();

        System.out.println("Runa: " + grimorio.buscarRunaPoderosa());
        System.out.println("Enfriamiento del arquero: " + arquero.tiempoEnfriamientoTurnos() + " turnos");
    }
}
