package com.beta2.salud.impl;

import com.beta2.salud.cdm.Paciente;
import com.beta2.salud.cdm.TipoResultadosLaboratorio;
import com.beta2.salud.servicios.LaboratorioPortType;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del servicio Laboratorio.
 * Devuelve resultados de laboratorio del paciente.
 */
@Service
@WebService(
        endpointInterface = "com.beta2.salud.servicios.LaboratorioPortType",
        serviceName = "LaboratorioService",
        portName = "LaboratorioPort",
        targetNamespace = "http://beta2.com/salud"
)
public class LaboratorioServiceImpl implements LaboratorioPortType {

    @Override
    public Paciente obtenerResultadosLaboratorio(String pacienteId) {
        Paciente paciente = new Paciente();
        paciente.setId(pacienteId);
        paciente.setNombre("Andrés Hernando Saldaña");

        TipoResultadosLaboratorio resultados = new TipoResultadosLaboratorio();
        resultados.getResultado().add("Hemograma completo - Normal (2025-01-15)");
        resultados.getResultado().add("Glucosa en sangre - Alto (2025-01-15)");

        paciente.setResultadosLaboratorio((List<TipoResultadosLaboratorio>) resultados);
        return paciente;
    }
}
