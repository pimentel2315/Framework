package mx.gob.semarnat.dependencyinyection;

import mx.gob.semarnat.dependencyinyection.aop.TargetObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



//import mx.gob.semarnat.dependencyinyection.atributo.Coche;



@SpringBootApplication
/*@Configuration
@ComponentScan
@EnableAutoConfiguration*/
//@ComponentScan(basePackages = {"import mx.gob.semarnat.dependencyinyection", "qualfiers"})
//public class DependencyInyectionApplication {
    //static Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);
    //private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);


//@Bean
//public String getApplicationName(){
   //return "Este es el nombre de mi aplicacion";
//}

/*@Bean(initMethod = "init", destroyMethod = "destroy")
public ExplicitBean getBean(){
    return new ExplicitBean();
}*/


    /*public static void main(String[] args)  {        
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        //LifeCycleBean bean = context.getBean(LifeCycleBean.class);
           
        
    
    }
}*/


//ejemplo de lazy
public class DependencyInyectionApplication {
    
    
        public static void main(String[] args)  {        
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        TargetObject targetObject = context.getBean(TargetObject.class);
        targetObject.hello("Hello world");
        targetObject.foo();
    }
}






    
   //String nombreAplicacion = context.getBean(String.class);
    
    //System.out.println("Este es el resultado del bean" + nombreAplicacion);
	
           // Coche coche = context.getBean(Coche.class);
            //System.out.println(coche);
           //  Animal animal = context.getBean("pajaro",Animal.class);
             // nido Nido = context.getBean(nido.class);
            // log.info("Animal nombre ={} edad={}", animal.getNombre(), animal.getEdad());
            // Nido.imprimir();
              //avion.volar();
            // System.out.println("logger " + log);
            
 //EnvironmentService enviromentService = context.getBean(EnvironmentService.class);
 //log.info("Active environment {} ",enviromentService.getEnvironment());
 
           /* EjemploScopesService ejemploScopesService = context.getBean(EjemploScopesService.class);
            EjemploScopesService ejemploScopesService1 = context.getBean(EjemploScopesService.class);
            log.info("Are beans equals {} ", ejemploScopesService.equals(ejemploScopesService1));
            log.info("Are beans =={} ", ejemploScopesService == ejemploScopesService1);
*/

/*String nombreAplicacion = context.getBean(String.class);
           log.info("Nombre aplicacion {}", nombreAplicacion);
    */    

/*AreaCalculator calculator = context.getBean(AreaCalculator.class);
           log.info("Area Total {}", calculator.calcAreas());
        */

/*ExpressionParser parser = new SpelExpressionParser();
Expression expression = (Expression) parser.parseExpression("10 < 20 ");
log.info("Result {} ", expression.getValue());*/


  //public DependencyInyectionApplication() {
   
    
    









