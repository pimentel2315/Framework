
package mx.gob.semarnat.dependencyinyection.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy //(false) //si el bean es lazy no se inicializara a menos que se inyecte
public class LifeCycleBean implements BeanNameAware,InitializingBean,DisposableBean{

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);
    @Override
    public void setBeanName(String name) {
        log.info("Bean name aware {}", name);
    
    }
    @PostConstruct
    public void init(){ 
        log.info("Post construct");
    }
    @PreDestroy
    public void destroyBean(){
       log.info("Pre destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
       log.info("After properties set method"); 
        
    }

    @Override
    public void destroy() throws Exception {
    log.info("Destroy method");        
// throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
