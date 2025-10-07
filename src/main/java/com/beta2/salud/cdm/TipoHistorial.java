package com.beta2.salud.cdm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Historial clínico del paciente
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoHistorial", propOrder = {
        "entrada"
})
public class TipoHistorial {
    @XmlElement(required = true)
    private String evento;

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {

    }

    public <E> List<E> getEntrada() {
        return List.of();
    }

    public void addAll(List<TipoHistorial> historial) {
    }
}
