package com.beta2.salud.servicios;
import com.beta2.salud.cdm.Paciente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Interfaz SOAP del servicio de Laboratorio.
 * Define el contrato para el endpoint LaboratorioService.
 */
@WebService(
        name = "LaboratorioPortType",
        targetNamespace = "http://ejemplo.com/salud",
        serviceName = "LaboratorioService",
        portName = "LaboratorioPort"
)
public interface LaboratorioPortType {
    @WebMethod(operationName = "ObtenerResultadosLaboratorio")
    @WebResult(name = "Paciente")
    Paciente obtenerResultadosLaboratorio(
            @WebParam(name = "pacienteId") String pacienteId
    );
}
