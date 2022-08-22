package com.banco.internacional.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "fechas")
@Data
public class Fecha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer anio;
    private Integer feriados;
    private Integer diasTotales;
    private Integer diasLaborales;
        
}
