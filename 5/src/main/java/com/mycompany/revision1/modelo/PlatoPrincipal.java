package com.mycompany.revision1.modelo;

public class PlatoPrincipal extends PlatilloMenu {
    private String tipoProteina;
    private Sommelier sommelierAsignado;

    public PlatoPrincipal(String idPlato, String nombre, double precioBase,
                          String tipoProteina, Sommelier sommelierAsignado) {
        super(idPlato, nombre, precioBase);
        this.tipoProteina = tipoProteina;
        this.sommelierAsignado = sommelierAsignado;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + 2500.0;
    }

    public void sugerirMaridaje() {
        if (sommelierAsignado != null) {
            System.out.println(sommelierAsignado.recomendarVino(getNombre()));
        } else {
            System.out.println("No hay sommelier asignado para este plato.");
        }
    }

    public String getTipoProteina() { return tipoProteina; }
    public Sommelier getSommelierAsignado() { return sommelierAsignado; }
}
