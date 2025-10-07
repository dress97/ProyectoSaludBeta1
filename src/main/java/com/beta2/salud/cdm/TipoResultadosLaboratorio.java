package com.beta2.salud.cdm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Resultados de laboratorio del paciente
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoResultadosLaboratorio", propOrder = {
        "resultado"
})
public class TipoResultadosLaboratorio {
    @XmlElement(required = true)
    protected List<String> resultado;

    public List<String> getResultado() {
        if (resultado == null) {
            resultado = new ArrayList<>();
        }
        return this.resultado;
    }

    public void addAll(TipoResultadosLaboratorio resultadosLaboratorio) {

    }
}
