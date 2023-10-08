package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethod()")
    public void beforeAddExceptionHandlingAdvice(JoinPoint joinPoint){
        System.out.println("beforeGetExceptionHandlingAdvice: catching exceptions while trying to get a book/magazine");
        System.out.println("---------------------------------------");
    }
}
