package com.mycompany.revision1.modelo;

public class PedidoDelivery extends PlatilloMenu implements EmpacableTermico {
    private String direccionEntrega;

    public PedidoDelivery(String idPlato, String nombre, double precioBase, String direccionEntrega) {
        super(idPlato, nombre, precioBase);
        this.direccionEntrega = direccionEntrega;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + 3000.0;
    }

    @Override
    public boolean sellarEmpaque() {
        System.out.println("Empaque térmico sellado para: " + getNombre());
        return true;
    }

    @Override
    public int tiempoConservacionMin() {
        return 90;
    }

    public String getDireccionEntrega() { return direccionEntrega; }
}
