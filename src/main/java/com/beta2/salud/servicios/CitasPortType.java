package com.beta2.salud.servicios;

import com.beta2.salud.cdm.Paciente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(
        name = "CitasPortType",
        targetNamespace = "http://ejemplo.com/salud",
        serviceName = "CitasService",
        portName = "CitasPort"
)
public interface CitasPortType {
    @WebMethod(operationName = "ObtenerProximaCita")
    @WebResult(name = "Paciente")
    Paciente obtenerProximaCita(@WebParam(name = "pacienteId") String pacienteId);
}
