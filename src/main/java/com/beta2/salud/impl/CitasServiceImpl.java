package com.beta2.salud.impl;

import com.beta2.salud.cdm.Paciente;
import com.beta2.salud.cdm.TipoCitas;
import com.beta2.salud.servicios.CitasPortType;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.time.LocalDate;

@Service
@WebService(
        endpointInterface = "com.beta2.salud.servicios.CitasPortType",
        serviceName = "CitasService",
        portName = "CitasPort",
        targetNamespace = "http://ejemplo.com/salud"
)
public class CitasServiceImpl implements CitasPortType {

    @Override
    public Paciente obtenerProximaCita(String pacienteId) {
        Paciente paciente = new Paciente();
        paciente.setId(pacienteId);
        paciente.setNombre("Andrés Hernando Saldaña");

        TipoCitas citas = new TipoCitas();
        citas.getCita().add("Consulta control de hipertensión - " + LocalDate.now().plusDays(7));
        citas.getCita().add("Examen de laboratorio general - " + LocalDate.now().plusDays(30));

        paciente.setCitas((List<TipoCitas>) citas);
        return paciente;
    }
}