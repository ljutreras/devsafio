package com.banco.internacional.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.internacional.Models.Fecha;
import com.banco.internacional.Repositories.FechaRepository;

@Service
public class FechaService {
    @Autowired
    FechaRepository fechaRepository;

    public void guardarFecha(@Valid Fecha fecha) {
        fechaRepository.save(fecha);
    }

    public List<Fecha> findAll() {
        return fechaRepository.findAll();
    }

    public void deletedById(Long id) {
        fechaRepository.deleteById(id);
    }


}
