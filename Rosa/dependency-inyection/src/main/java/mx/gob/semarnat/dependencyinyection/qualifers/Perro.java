/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.gob.semarnat.dependencyinyection.qualifers;

import mx.gob.semarnat.dependencyinyection.qualifers.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author ur513
 */
@Component
public class Perro extends Animal {

    public Perro(@Value ("Rock")String nombre, @Value ("2") Integer edad) {
        super(nombre, edad);
    }
    
    
}
