package aopAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Around("execution(* aopAnnotation.BankTransactions.*(..))")
    public void myLogging(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("----- logging service -----");

        joinPoint.proceed();

        System.out.println("----- after logging -----");
    }

    public void myAfterLog()
    {
        System.out.println("----- after logging -----");
    }


}
