package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c5_SpringCreateObjects;

import com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c5_SpringCreateObjects.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c5_SpringCreateObjects.game")
public class AppGamingSpringBean {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext
                             (AppGamingSpringBean.class)) {

            context.getBean(GameRunner.class).run();

        }
    }
}
