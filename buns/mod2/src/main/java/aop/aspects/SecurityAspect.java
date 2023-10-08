package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Checking access rights to get a book/magazine");
        System.out.println("---------------------------------------");
    }
}
