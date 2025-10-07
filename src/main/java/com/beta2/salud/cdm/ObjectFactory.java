package com.beta2.salud.cdm;

import jakarta.xml.bind.annotation.XmlRegistry;

/**
 * Fábrica de objetos para instanciar las clases del paquete com.ejemplo.salud.cdm
 */
@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {}

    public Paciente createPaciente() {
        return new Paciente();
    }

    public TipoPaciente createTipoPaciente() {
        return new TipoPaciente();
    }

    public TipoHistorial createTipoHistorial() {
        return new TipoHistorial();
    }

    public TipoResultadosLaboratorio createTipoResultadosLaboratorio() {
        return new TipoResultadosLaboratorio();
    }

    public TipoCitas createTipoCitas() {
        return new TipoCitas();
    }
}
