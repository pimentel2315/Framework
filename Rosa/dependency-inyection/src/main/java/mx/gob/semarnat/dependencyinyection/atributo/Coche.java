/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.gob.semarnat.dependencyinyection.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author ur513
 */

@Component

public class Coche {
    
    
    private String marca;    
    private Integer modelo;   
    private Motor motor;

    public Coche() {
    }
 
    

    public String getMarca() {
        return marca;
    }

    @Value("Vw")
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

    
    public Motor getMotor() {
        return motor;
    }

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + '}';
    }
    
    
}
