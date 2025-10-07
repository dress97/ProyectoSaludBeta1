package com.beta2.salud.cdm;

import java.util.Date;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Representa la estructura de un paciente según el CDM
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoPaciente", propOrder = {
        "id",
        "nombre",
        "fechaNacimiento",
        "historial",
        "resultadosLaboratorio",
        "citas"
})
public class TipoPaciente {
    @XmlElement(required = true)
    protected String id;

    @XmlElement(required = true)
    protected String nombre;

    @XmlSchemaType(name = "date")
    protected Date fechaNacimiento;

    protected TipoHistorial historial;

    protected TipoResultadosLaboratorio resultadosLaboratorio;

    protected TipoCitas citas;

    // Getters y Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public TipoHistorial getHistorial() { return historial; }
    public void setHistorial(TipoHistorial historial) { this.historial = historial; }

    public TipoResultadosLaboratorio getResultadosLaboratorio() { return resultadosLaboratorio; }
    public void setResultadosLaboratorio(TipoResultadosLaboratorio resultadosLaboratorio) { this.resultadosLaboratorio = resultadosLaboratorio; }

    public TipoCitas getCitas() { return citas; }
    public void setCitas(TipoCitas citas) { this.citas = citas; }
}
