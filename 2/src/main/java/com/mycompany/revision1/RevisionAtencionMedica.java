package com.mycompany.revision1;

import com.mycompany.revision1.modelo.AtencionMedica;
import com.mycompany.revision1.modelo.CirugiaUrgencia;
import com.mycompany.revision1.modelo.ConsultaGeneral;
import com.mycompany.revision1.modelo.Quirofano;
import com.mycompany.revision1.modelo.Telemedicina;

public class RevisionAtencionMedica {
    public static void main(String[] args) {
        ConsultaGeneral consulta = new ConsultaGeneral("CG-001", 30000, true);
        Quirofano sala = new Quirofano("QX-01", true);
        CirugiaUrgencia cirugia = new CirugiaUrgencia("CU-001", 500000, 2.5, sala);
        Telemedicina telemedicina = new Telemedicina("TM-001", 25000, "Teams");

        AtencionMedica[] atenciones = {consulta, cirugia, telemedicina};

        for (AtencionMedica atencion : atenciones) {
            System.out.println(atencion.getCodigoAtencion()
                    + " - Costo total: $" + atencion.calcularCostoTotal());
        }

        consulta.registrarDiagnostico("Control general satisfactorio");
        consulta.emitirRecetaMedica();

        cirugia.registrarDiagnostico("Apendicitis aguda");
        cirugia.prepararEquipo();

        System.out.println(telemedicina.generarFacturaXML());
        telemedicina.enviarPorCorreo("paciente@correo.cl");
    }
}
