package mx.gob.semarnat.dependencyinyection.Autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Circle implements Figure {
//    @Value("2,5")
//    private double radius;

    @Override
    public double calculateArea() {
      return 0; //Math.PI * Math.pow(radius, 2);
    }
    
}
