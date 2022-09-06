/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.gob.semarnat.dependencyinyection.qualifers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author ur513
 */
@Component
public class nido {
    @Autowired
   // @Qualifier
    private Animal animal;
    private static final Logger log = LoggerFactory.getLogger(nido.class);
    public void imprimir(){
        log.info("mi nido tiene al animal {}", animal.getNombre());
    }
    
}
