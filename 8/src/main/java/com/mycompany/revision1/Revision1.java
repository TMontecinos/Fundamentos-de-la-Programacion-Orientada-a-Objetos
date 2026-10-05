package com.mycompany.revision1;

import com.mycompany.revision1.modelo.EncriptadorRSA;
import com.mycompany.revision1.modelo.PagoCripto;
import com.mycompany.revision1.modelo.PagoTarjeta;
import com.mycompany.revision1.modelo.PagoTransferencia;
import com.mycompany.revision1.modelo.TransaccionPago;

public class Revision1 {
    public static void main(String[] args) {
        EncriptadorRSA rsa = new EncriptadorRSA(2048, "TOKEN-SEGURIDAD");

        TransaccionPago transferencia = new PagoTransferencia("TR-001", 150.00, "Banco Estado");
        TransaccionPago tarjeta = new PagoTarjeta("TJ-002", 89.90, "1234", rsa);
        PagoCripto cripto = new PagoCripto("CR-003", 250.50, "wallet-XYZ", "Ethereum");

        transferencia.procesarPago();
        ((PagoTransferencia) transferencia).adjuntarComprobante();
        System.out.println(transferencia.generarComprobante());

        tarjeta.procesarPago();
        System.out.println(tarjeta.generarComprobante());

        cripto.procesarPago();
        System.out.println(cripto.generarComprobante());
        System.out.println("Hash: " + cripto.obtenerHashConfirmacion());
        System.out.println("Confirmaciones: " + cripto.numeroConfirmaciones());
    }
}
