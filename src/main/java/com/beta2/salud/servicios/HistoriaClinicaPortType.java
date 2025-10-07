package com.beta2.salud.servicios;

import com.beta2.salud.cdm.Paciente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Interfaz SOAP del servicio Historia Clinica.
 * Define el contrato para el endpoint HistoriaClinicaService.
 */
@WebService(
        name = "HistoriaClinicaPortType",
        targetNamespace = "http://ejemplo.com/salud",
        serviceName = "HistoriaClinicaService",
        portName = "HistoriaClinicaPort"
)
public interface HistoriaClinicaPortType {
    @WebMethod(operationName = "ObtenerHistoriaClinica")
    @WebResult(name = "Paciente")
    Paciente obtenerHistoriaClinica(
            @WebParam(name = "pacienteId") String pacienteId
    );
}
