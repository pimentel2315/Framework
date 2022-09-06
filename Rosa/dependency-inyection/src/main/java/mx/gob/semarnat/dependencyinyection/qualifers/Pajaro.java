/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.gob.semarnat.dependencyinyection.qualifers;


import mx.gob.semarnat.dependencyinyection.qualifers.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 *
 * @author ur513
 */
@Component
@Primary
public class Pajaro extends Animal implements Volador {

    private static final Logger log = LoggerFactory.getLogger(Pajaro.class);
   
    public Pajaro(@Value ("carpintero") String nombre, @Value ("2") Integer edad) {
        super(nombre, edad);
    }

    
    
    
 
    @Override
    public void volar() {
        log.info("Soy un pajaro y estoy volando");
        
    }
    
}
