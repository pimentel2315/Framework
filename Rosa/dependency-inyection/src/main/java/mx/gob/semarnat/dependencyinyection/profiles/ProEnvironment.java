/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.gob.semarnat.dependencyinyection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author ur513
 */
@Service
@Profile("pro")
public class ProEnvironment implements EnvironmentService{

    @Override
    public String getEnvironment() {
        return"Pro";
    }
    
}
