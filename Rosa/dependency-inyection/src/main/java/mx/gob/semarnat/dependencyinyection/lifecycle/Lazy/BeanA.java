package mx.gob.semarnat.dependencyinyection.lifecycle.Lazy;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class BeanA {
    private static final Logger log = LoggerFactory.getLogger(BeanA.class);
    @PostConstruct
    public void init(){
        log.info("init bean a");
    }
    
}
