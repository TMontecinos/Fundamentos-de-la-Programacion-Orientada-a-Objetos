package com.mycompany.revision1;

import com.mycompany.revision1.modelo.*;

public class Revision1 {
    public static void main(String[] args) {
        EntradaGourmet entrada = new EntradaGourmet(
                "E001", "Ceviche Gourmet", 8000, true);

        Sommelier sommelier = new Sommelier("Carlos Mendoza", 3);
        PlatoPrincipal principal = new PlatoPrincipal(
                "P001", "Filete a la Pimienta", 18000, "Vacuno", sommelier);

        PedidoDelivery pedido = new PedidoDelivery(
                "D001", "Pasta Delivery", 12000, "Av. Principal 123");

        System.out.println("=== SISTEMA DE MENÚ ===");
        entrada.prepararPlato();
        System.out.println("Precio entrada: $" + entrada.calcularPrecioFinal());
        System.out.println("¿Alergenos verificados?: " + entrada.verificarAlergenos());

        principal.prepararPlato();
        System.out.println("Precio principal: $" + principal.calcularPrecioFinal());
        principal.sugerirMaridaje();

        pedido.prepararPlato();
        System.out.println("Precio delivery: $" + pedido.calcularPrecioFinal());
        System.out.println("Dirección: " + pedido.getDireccionEntrega());
        System.out.println("Empaque sellado: " + pedido.sellarEmpaque());
        System.out.println("Conservación: " + pedido.tiempoConservacionMin() + " minutos");
    }
}
