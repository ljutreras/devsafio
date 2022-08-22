package com.banco.internacional.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banco.internacional.Models.Fecha;
import com.banco.internacional.Services.FechaService;

@Controller
@RequestMapping("/fecha")
public class FechaController {
     
    @Autowired
    FechaService fechaService;  //Inyeccion de metodos del Service

    @RequestMapping("")         
    public String index(@ModelAttribute("fecha")Fecha fecha){
        return "fecha.jsp";
    }

    @RequestMapping("/mostrar")
    public String mostrarFecha(@ModelAttribute("fecha") Fecha fecha, Model model) {
        List<Fecha> listaFecha = fechaService.findAll();                //Traemos los objetos guardados en la base de datos
        model.addAttribute("listaFecha", listaFecha);

        return "registroFecha.jsp";
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarFecha(@PathVariable("id")Long id){
        fechaService.deletedById(id);       //Eliminacion de el objeto en base de datos
        return"redirect:/fecha/mostrar";
    }
    
}
