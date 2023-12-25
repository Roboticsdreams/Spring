package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c4_loosecoupling.springlevel2;

import com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c4_loosecoupling.springlevel2.game.GameRunner;
import com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c4_loosecoupling.springlevel2.game.GamingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBean {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

            context.getBean(GameRunner.class).run();

        }
    }
}
