package com.wangsu.web.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author linhz
 * @version 1.0 2019/6/11
 * @since 1.0
 */
@Aspect
@Component
public class ServiceMonitor {
    @Pointcut("execution(* com.wangsu.web..*Service.*(..))")
    public void ServiceMonitor() {
    }

    @Before("ServiceMonitor()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("doBefore");
    }

    @After("ServiceMonitor()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("doAfter");
    }

    @AfterReturning("ServiceMonitor()")
    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("doAfterReturning");
    }

    @AfterThrowing("ServiceMonitor()")
    public void deAfterThrowing(JoinPoint joinPoint) {
        System.out.println("deAfterThrowing");
    }

    @Around("ServiceMonitor()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("deAround");
        return joinPoint.proceed();
    }
}
