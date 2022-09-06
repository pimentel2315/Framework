/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.gob.semarnat.dependencyinyection.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author ur513
 */

@Component

public class Motor {    
    
     
    private String marca;    
    private Integer modelo;
    
    public Motor(){
        
    }

    
    public String getMarca() {
        return marca;
    }

   @Value("XL1")
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    

    public Integer getModelo() {
        return modelo;
    }

    @Value("1981")
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
}
