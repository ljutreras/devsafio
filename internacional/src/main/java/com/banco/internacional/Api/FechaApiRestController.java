package com.banco.internacional.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.banco.internacional.Models.Fecha;
import com.banco.internacional.Services.FechaService;

import java.util.List;

@RestController
@RequestMapping("/api/fecha")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class FechaApiRestController {
    @Autowired
    FechaService fechaService;

    @RequestMapping("/obtener")
    public List<Fecha> obtenerListaFecha(){
        List<Fecha> listadoFecha = fechaService.findAll();
        return listadoFecha;

    }

    @PostMapping(value = "/guardar")
    public ResponseEntity<Fecha> registrarFecha(@RequestBody Fecha fecha){
        fechaService.guardarFecha(fecha);
        return new ResponseEntity<Fecha>(fecha, HttpStatus.OK);
    }

    @PostMapping(value = "/eliminar/{id}")
    public ResponseEntity<Fecha> eliminarCliente(@PathVariable Long id){
        try{
            fechaService.deletedById(id);
            return new ResponseEntity<Fecha>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Fecha>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
