package com.mycompany.asientosvuelo;

import com.mycompany.asientosvuelo.modelo.*;

public class AsientosVuelo {
    public static void main(String[] args) {
        AsientoTurista turista = new AsientoTurista("12A", 150.0, true);
        turista.reservarAsiento();
        turista.elegirMenuEstandar();
        System.out.println("Equipaje permitido: " + turista.calcularEquipajePermitido() + " kg");

        CabinaPrivada cabina = new CabinaPrivada(1, true);
        AsientoBusiness business = new AsientoBusiness("2A", 500.0, true, cabina);
        business.reservarAsiento();
        business.solicitarChampagne();
        business.getSuiteCabina().activarMasaje();
        System.out.println("Equipaje permitido: " + business.calcularEquipajePermitido() + " kg");

        BoardingDigital boarding = new BoardingDigital("18C", 180.0, "QR-2026-001");
        System.out.println(boarding.emitirBoardingPass());
        System.out.println("Pasaporte válido: " + boarding.validarPasaporte("P12345678"));
        System.out.println("Equipaje permitido: " + boarding.calcularEquipajePermitido() + " kg");
    }
}
