package mx.gob.semarnat.dependencyinyection.aop;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExample {
    
    //@Pointcut("execution(* mx.gob.semarnat.dependencyinyection.aop.TargetObject.hello(..))")
    // @Pointcut("within(TargetObject)")
    @Pointcut("@annotation(Annotation)")
    public void targetObjectMethods(){
        
    }
}
