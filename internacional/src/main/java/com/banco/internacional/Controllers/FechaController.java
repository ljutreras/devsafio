package com.banco.internacional.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banco.internacional.Models.Fecha;
import com.banco.internacional.Services.FechaService;

@Controller
@RequestMapping("/fecha")
public class FechaController {
    @Autowired
    FechaService fechaService;

    @RequestMapping("")
    public String index(@ModelAttribute("fecha")Fecha fecha){
        return "fecha.jsp";
    }

    @PostMapping("/guardar")
    public String guardarFecha(@Valid @ModelAttribute("fecha")Fecha fecha, Model model){
        
        fechaService.guardarFecha(fecha);
        List<Fecha> listaFecha = fechaService.findAll();
        model.addAttribute("listaFecha", listaFecha);

        return "registroFecha.jsp";
    }

    @RequestMapping("/mostrar")
    public String mostrarFecha(@ModelAttribute("fecha")Fecha fecha, Model model){
        List<Fecha> listaFecha = fechaService.findAll();
        model.addAttribute("listaFecha",listaFecha);
        return"registroFecha.jsp";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarFecha(@PathVariable("id")Long id){
        fechaService.deletedById(id);
        return"redirect:/fecha/mostrar";
    }

}
