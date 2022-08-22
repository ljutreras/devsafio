package com.banco.internacional.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fechas")
public class Fecha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer anio;
    private Integer feriados;
    private Integer diasTotales;
    private Integer diasLaborales;
    
    public Fecha() {
    }

    public Fecha(Integer anio, Integer feriados, Integer diasTotales, Integer diasLaborales) {
        this.anio = anio;
        this.feriados = feriados;
        this.diasTotales = diasTotales;
        this.diasLaborales = diasLaborales;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getFeriados() {
        return feriados;
    }

    public void setFeriados(Integer feriados) {
        this.feriados = feriados;
    }

    public Integer getDiasTotales() {
        return diasTotales;
    }

    public void setDiasTotales(Integer diasTotales) {
        this.diasTotales = diasTotales;
    }

    public Integer getDiasLaborales() {
        return diasLaborales;
    }

    public void setDiasLaborales(Integer diasLaborales) {
        this.diasLaborales = diasLaborales;
    }

    

    

    



    
}
