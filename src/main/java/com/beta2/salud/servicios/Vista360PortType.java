package com.beta2.salud.servicios;

import com.beta2.salud.cdm.Paciente;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Interfaz SOAP del servicio Vista 360.
 * Orquesta todos los servicios y devuelve una vista completa del paciente.
 */
@WebService(
        name = "Vista360PortType",
        targetNamespace = "http://beta2.com/salud"
)
public interface Vista360PortType {

    @WebMethod(operationName = "ObtenerVista360")
    @WebResult(name = "Paciente")
    Paciente obtenerVista360(
            @WebParam(name = "pacienteId") String pacienteId
    );
}