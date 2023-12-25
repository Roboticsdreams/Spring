package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c7_Exercises;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealworldSpringContext {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(RealworldSpringContext.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
