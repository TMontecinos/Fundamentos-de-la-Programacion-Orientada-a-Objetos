package com.mycompany.revision1.modelo;

public interface FacturableDigital {
    String generarFacturaXML();
    void enviarPorCorreo(String email);
}
