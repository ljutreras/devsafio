package com.banco.internacional.Services;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.internacional.Models.Fecha;
import com.banco.internacional.Repositories.FechaRepository;

@Service
public class FechaService {
    Calendar fechaInicial = Calendar.getInstance(); //Inicializamos la fecha inicial
    Calendar fechaFinal = Calendar.getInstance();   //Inicializamos la fecha de termino
    Calendar festivo = Calendar.getInstance();      //Inicializamos la fecha de festivo
    Set<Integer> listaFest = new HashSet<Integer>(); //Inicializamos la lista de numeros Integer 


    @Autowired
    FechaRepository fechaRepository;


    public List<Fecha> findAll() {
        return fechaRepository.findAll();
    }

    public void deletedById(Long id) {
        fechaRepository.deleteById(id);
    }

    public void actualizarFecha(@Valid Fecha fecha){
        int counter = 0;  
        int fest = 0; 
        int contadorDias = 0;                           //Inicializamos el contador de dia
        int contadorHabil = 0;                          //Inicializamos el contador de dia habil
        boolean diaHabil = false;                       //Inicializamos el dia habil como False
        int diasLaborales = 0;                          //Inicializador deas laborales

        
        fechaInicial.set(fecha.getAnio(), 0, 00);       //Seteamos la fecha inicial
        fechaFinal.set(fecha.getAnio(), 11, 30);        //Seteamos la fecha de termino
        
        while (counter < fecha.getFeriados()) {         //Mientras counter sea menor que 5
            fest = (int) (Math.random() * 30);          //Generamos un numero aleatorio entre 0 y 30                        
            listaFest.add(fest);                               
            counter++;                                  //Se suma 1 al counter                                
        }

        /* Recorremos la lista y se la asignamos a la fecha festiva */
        for (Integer dia : listaFest) {                 //Por cada Int encontrado en la lista, lo almacenamos en la variable dia                        
            festivo.set(fecha.getAnio(), 8, dia);       //Lo agregamos como dia a la variable festivo
            
        }

        //Mientras la fecha inicial se encuentre antes que la fecha final o sea igual que la final
        while (fechaInicial.before(fechaFinal) || fechaInicial.equals(fechaFinal)) {                         
            contadorDias++;                                                                 //Contador de dias le sumamos 1                        
            if (fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY                 //Si la fecha inicial es != de Sabado
                            && fechaInicial.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY    // y distinta de domingo
                            ) { 
                    diaHabil = true;                    //Dia habil pasa a ser true

            } else {                                    //De lo contrario
                    diaHabil = false;                   //Dia Habil sigue siendo Falso
            }
    
            if (diaHabil == true) {                     //Si dia habil es == a TRUE
                    contadorHabil++;                    //le sumamos una unidad a contador Habil
            }       

            
            fechaInicial.add(Calendar.DATE, 1);         //Le agregamos 1 día a la fecha inicial y vuelve al ciclo
        }

        for(int i=0;i<listaFest.size()+1;i++){          //Recorrer elementos de listaFest
            diasLaborales = contadorHabil - i;          //descontamos los elementos al contador de dias habiles    
        }
        
        fecha.setDiasLaborales(diasLaborales);          //Seteamos el atributo DiasLaborales con los dias obtenidos
        fecha.setDiasTotales(contadorDias);             //Seteamos el atributo DiasTotales con los dias obtenidos
    
        fechaRepository.save(fecha);                    //Guardamos el objeto actualizado
    }
    }



