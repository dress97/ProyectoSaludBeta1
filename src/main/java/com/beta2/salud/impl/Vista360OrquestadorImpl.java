package com.beta2.salud.impl;

import com.beta2.salud.cdm.Paciente;
import com.beta2.salud.cdm.TipoCitas;
import com.beta2.salud.cdm.TipoHistorial;
import com.beta2.salud.cdm.TipoResultadosLaboratorio;
import com.beta2.salud.servicios.Vista360PortType;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ✅ Orquestador SOAP simulado que actúa como un ESB.
 *
 * Esta clase representa el punto de entrada del servicio SOAP Vista360.
 * Orquesta tres servicios internos:
 *  - HistoriaClinicaServiceImpl
 *  - LaboratorioServiceImpl
 *  - CitasServiceImpl
 *
 * Y construye un objeto Paciente “360°” combinando los datos de cada uno.
 *
 * Arquitectura: SOAP + ESB (simulado) + CDM (modelo canónico de Paciente)
 * Compatibilidad: JDK 17, Spring Boot 3.x, Apache CXF 4.x
 */
@Service
@WebService(
        endpointInterface = "com.beta2.salud.servicios.Vista360PortType",
        serviceName = "Vista360Service",
        portName = "Vista360Port",
        targetNamespace = "http://beta2.com/salud"
)
public class Vista360OrquestadorImpl implements Vista360PortType {

    @Autowired
    private HistoriaClinicaServiceImpl historiaService;

    @Autowired
    private LaboratorioServiceImpl laboratorioService;

    @Autowired
    private CitasServiceImpl citasService;

    /**
     * Combina información de historia clínica, laboratorio y citas
     * en un único objeto Paciente (CDM) para entregar una "Vista 360°".
     *
     * @param pacienteId Identificador único del paciente
     * @return Paciente con información consolidada de todas las fuentes.
     */
    @Override
    public Paciente obtenerVista360(String pacienteId) {
        Paciente pacienteHC = historiaService.obtenerHistoriaClinica(pacienteId);
        Paciente pacienteLab = laboratorioService.obtenerResultadosLaboratorio(pacienteId);
        Paciente pacienteCitas = citasService.obtenerProximaCita(pacienteId);

        Paciente paciente360 = new Paciente();
        paciente360.setId(pacienteId);
        paciente360.setNombre(pacienteHC.getNombre());
        paciente360.setEdad(pacienteHC.getEdad());
        paciente360.setGenero(pacienteHC.getGenero());

        // Historial
        if (pacienteHC.getHistorial() != null && !pacienteHC.getHistorial().isEmpty()) {
            paciente360.getHistorial().addAll(pacienteHC.getHistorial());
        }

        // Resultados de laboratorio
        if (pacienteLab.getResultadosLaboratorio() != null && !pacienteLab.getResultadosLaboratorio().isEmpty()) {
            paciente360.getResultadosLaboratorio().addAll(pacienteLab.getResultadosLaboratorio());
        }

        // Citas
        if (pacienteCitas.getCitas() != null && !pacienteCitas.getCitas().isEmpty()) {
            paciente360.getCitas().addAll(pacienteCitas.getCitas());
        }

        return paciente360;
    }
}
