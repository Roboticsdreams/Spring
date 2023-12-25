package com.in28minutes.learnspringframework.s4_advancefeature.c10_prepostanotations;

import org.springframework.stereotype.Component;

@Component
public class SomeDependency {
    public void getPreDestroy() {
        System.out.println("Some logic before destroy");
    }

    public void getPostReady() {
        System.out.println("Some logic after initialization");
    }
}
