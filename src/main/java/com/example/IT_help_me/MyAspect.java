package com.example.IT_help_me;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.IT_help_me.HpPrinter.*(..))")
    public void before() {
        System.out.println("I'm before");
    }
}
