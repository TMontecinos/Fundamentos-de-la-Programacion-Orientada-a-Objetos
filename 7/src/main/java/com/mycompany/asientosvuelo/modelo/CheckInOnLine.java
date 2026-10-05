package com.mycompany.asientosvuelo.modelo;

public interface CheckInOnLine {
    String emitirBoardingPass();
    boolean validarPasaporte(String num);
}
