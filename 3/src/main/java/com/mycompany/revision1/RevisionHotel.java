package com.mycompany.revision1;

import com.mycompany.revision1.modelo.HabitacionEstandar;
import com.mycompany.revision1.modelo.HabitacionHotel;
import com.mycompany.revision1.modelo.SanitizableAutomatico;
import com.mycompany.revision1.modelo.ServicioMayordomo;
import com.mycompany.revision1.modelo.SuitePenthouse;
import com.mycompany.revision1.modelo.SuiteTematica;

public class RevisionHotel {
    public static void main(String[] args) {
        HabitacionEstandar estandar = new HabitacionEstandar(101, 45000, 1);
        ServicioMayordomo mayordomo = new ServicioMayordomo("Carlos", 3);
        SuitePenthouse penthouse = new SuitePenthouse(501, 180000, true, mayordomo);
        SuiteTematica tematica = new SuiteTematica(302, 90000, "Espacial");

        HabitacionHotel[] habitaciones = {estandar, penthouse, tematica};

        for (HabitacionHotel habitacion : habitaciones) {
            habitacion.realizarCheckIn();
            System.out.println("Costo por 3 noches: $" + habitacion.calcularCostoEstadia(3));
        }

        estandar.solicitarToallasExtra();
        penthouse.solicitarCenaGourmet();

        SanitizableAutomatico sanitizable = tematica;
        sanitizable.iniciarCicloDesinfeccion();
        System.out.println(sanitizable.obtenerReporteSeguridad());
    }
}
