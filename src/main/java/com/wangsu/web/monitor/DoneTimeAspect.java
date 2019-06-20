package com.wangsu.web.monitor;

import com.wangsu.web.annotation.DoneTime;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author linhz
 * @version 1.0 2019/6/19
 * @since 1.0
 */
@Aspect
@Component
public class DoneTimeAspect {

    @Around("@annotation(doneTime)")
    public Object around(ProceedingJoinPoint joinPoint, DoneTime doneTime) throws Throwable {
        System.out.println("方法开始时间是:" + new Date());
        Object o = joinPoint.proceed();
        System.out.println("方法结束时间是:" + new Date());
        return o;
    }

}
