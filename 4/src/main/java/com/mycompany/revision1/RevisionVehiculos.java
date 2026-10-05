package com.mycompany.revision1;

import com.mycompany.revision1.modelo.BateriaLitio;
import com.mycompany.revision1.modelo.BusExpreso;
import com.mycompany.revision1.modelo.DronEntrega;
import com.mycompany.revision1.modelo.TaxiAutonomo;

public class RevisionVehiculos {
    public static void main(String[] args) {
        BusExpreso bus = new BusExpreso("BUS-001", 90.0, 50);
        TaxiAutonomo taxi = new TaxiAutonomo("TAXI-001", 120.0, 800.0, new BateriaLitio(75.0, 82));
        DronEntrega dron = new DronEntrega("DRON-001", 80.0, 5.0);

        bus.iniciarRuta("Terminal Alameda");
        bus.anunciarSiguienteParada();
        bus.frenarEmergencia();

        taxi.iniciarRuta("Providencia");
        taxi.solicitarRecargaRapida();

        dron.iniciarRuta("Centro de distribución");
        System.out.println("Coordenadas del dron: " + dron.obtenerCoordenadas());
        dron.transmitirTelemetria();
    }
}
