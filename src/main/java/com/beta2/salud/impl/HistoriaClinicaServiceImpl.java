package com.beta2.salud.impl;

import com.beta2.salud.cdm.Paciente;
import com.beta2.salud.cdm.TipoHistorial;
import com.beta2.salud.servicios.HistoriaClinicaPortType;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del servicio Historia Clinica.
 * Devuelve información de historial médico del paciente.
 */
@Service
@WebService(
        endpointInterface = "com.beta2.salud.servicios.HistoriaClinicaPortType",
        serviceName = "HistoriaClinicaService",
        portName = "HistoriaClinicaPort",
        targetNamespace = "http://beta2.com/salud"
)
public class HistoriaClinicaServiceImpl implements HistoriaClinicaPortType {

    @Override
    public Paciente obtenerHistoriaClinica(String pacienteId) {
        Paciente paciente = new Paciente();  // ✅ Se declara una sola vez
        paciente.setId(pacienteId);
        paciente.setNombre("Juan Pérez");

        // Crear historial simulado
        List<TipoHistorial> historial = new ArrayList<>();

        TipoHistorial h1 = new TipoHistorial();
        h1.getEntrada().add("2024-01-15 - Consulta general: tensión arterial normal");
        historial.add(h1);

        TipoHistorial h2 = new TipoHistorial();
        h2.getEntrada().add("2024-03-10 - Control de hipertensión: medicamento ajustado");
        historial.add(h2);

        paciente.getHistorial().addAll(historial);

        return paciente;
    }
}
