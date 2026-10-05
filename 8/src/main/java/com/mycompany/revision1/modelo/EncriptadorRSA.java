package com.mycompany.revision1.modelo;

public class EncriptadorRSA {
    private int longitudLlave;
    private String tokenSeguridad;

    public EncriptadorRSA(int longitudLlave, String tokenSeguridad) {
        this.longitudLlave = longitudLlave;
        this.tokenSeguridad = tokenSeguridad;
    }

    public String encriptarDatos(String datos) {
        return "RSA-" + longitudLlave + "[" + datos + "]-" + tokenSeguridad;
    }

    public int getLongitudLlave() {
        return longitudLlave;
    }

    public String getTokenSeguridad() {
        return tokenSeguridad;
    }
}
