package com.banco.internacional.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.internacional.Models.Fecha;

@Repository
public interface FechaRepository extends JpaRepository <Fecha,Long> {
    
}
