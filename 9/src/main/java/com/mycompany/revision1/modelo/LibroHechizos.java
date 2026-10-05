package com.mycompany.revision1.modelo;

public class LibroHechizos {
    private int totalGrimorios;
    private String elementoDominante;

    public LibroHechizos() {
    }

    public LibroHechizos(int totalGrimorios, String elementoDominante) {
        this.totalGrimorios = totalGrimorios;
        this.elementoDominante = elementoDominante;
    }

    public String buscarRunaPoderosa() {
        return "Runa poderosa de " + elementoDominante;
    }

    public int getTotalGrimorios() { return totalGrimorios; }
    public void setTotalGrimorios(int totalGrimorios) { this.totalGrimorios = totalGrimorios; }
    public String getElementoDominante() { return elementoDominante; }
    public void setElementoDominante(String elementoDominante) { this.elementoDominante = elementoDominante; }
}
