package com.beta2.salud.cdm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paciente", propOrder = {
        "id",
        "nombre",
        "edad",
        "genero",
        "historial",
        "resultadosLaboratorio",
        "citas"
})
public class Paciente {

    @XmlElement(required = true)
    private String id;

    @XmlElement(required = true)
    private String nombre;

    private int edad;

    @XmlElement(required = true)
    private String genero;

    @XmlElement(name = "historial")
    private List<TipoHistorial> historial;

    @XmlElement(name = "resultadosLaboratorio")
    private List<TipoResultadosLaboratorio> resultadosLaboratorio;

    @XmlElement(name = "citas")
    private List<TipoCitas> citas;

    // ---------- Getters & Setters -----------

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public List<TipoHistorial> getHistorial() {
        if (historial == null) {
            historial = new ArrayList<>();
        }
        return historial;
    }

    public void setHistorial(List<TipoHistorial> historial) {
        this.historial = historial;
    }

    public List<TipoResultadosLaboratorio> getResultadosLaboratorio() {
        if (resultadosLaboratorio == null) {
            resultadosLaboratorio = new ArrayList<>();
        }
        return resultadosLaboratorio;
    }

    public void setResultadosLaboratorio(List<TipoResultadosLaboratorio> resultadosLaboratorio) {
        this.resultadosLaboratorio = resultadosLaboratorio;
    }

    public List<TipoCitas> getCitas() {
        if (citas == null) {
            citas = new ArrayList<>();
        }
        return citas;
    }

    public void setCitas(List<TipoCitas> citas) {
        this.citas = citas;
    }
}
