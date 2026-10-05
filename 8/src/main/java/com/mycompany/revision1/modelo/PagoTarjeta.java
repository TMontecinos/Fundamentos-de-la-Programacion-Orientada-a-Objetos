package com.mycompany.revision1.modelo;

public class PagoTarjeta extends TransaccionPago {
    private String ultimos4Digitos;
    private EncriptadorRSA moduloRSA;

    public PagoTarjeta(String idTransaccion, double montoUSD, String ultimos4Digitos,
                       EncriptadorRSA moduloRSA) {
        super(idTransaccion, montoUSD);
        this.ultimos4Digitos = ultimos4Digitos;
        this.moduloRSA = moduloRSA;
    }

    @Override
    public boolean procesarPago() {
        tokenizarTarjeta();
        setCompletado(true);
        return true;
    }

    public void tokenizarTarjeta() {
        String datos = "**** **** **** " + ultimos4Digitos;
        System.out.println("Tarjeta tokenizada: " + moduloRSA.encriptarDatos(datos));
    }

    public String getUltimos4Digitos() {
        return ultimos4Digitos;
    }

    public EncriptadorRSA getModuloRSA() {
        return moduloRSA;
    }
}
