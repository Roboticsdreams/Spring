package com.in28minutes.learnspringframework.s4_advancefeature.c11_JakartaCDI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDILauncher {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(CDILauncher.class)) {
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }
    }
}
