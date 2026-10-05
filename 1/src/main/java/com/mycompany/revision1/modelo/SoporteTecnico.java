package com.mycompany.revision1.modelo;

public class SoporteTecnico {
    private String nombreFormato;
    private boolean activo;

    public SoporteTecnico() {
    }

    public SoporteTecnico(String nombreFormato, boolean activo) {
        this.nombreFormato = nombreFormato;
        this.activo = activo;
    }

    public String getNombreFormato() {
        return nombreFormato;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setNombreFormato(String nombreFormato) {
        this.nombreFormato = nombreFormato;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "SoporteTecnico{" + "nombreFormato='" + nombreFormato + '\'' + ", activo=" + activo + '}';
    }
}
