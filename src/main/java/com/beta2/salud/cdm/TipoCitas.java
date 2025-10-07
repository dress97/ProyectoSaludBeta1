package com.beta2.salud.cdm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Citas médicas del paciente
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCitas", propOrder = {
        "cita"
})
public class TipoCitas {
    @XmlElement(required = true)
    protected List<String> cita;

    public List<String> getCita() {
        if (cita == null) {
            cita = new ArrayList<>();
        }
        return this.cita;
    }
}
