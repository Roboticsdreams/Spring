package com.in28minutes.learnspringframework.s4_advancefeature.c12_xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c5_SpringCreateObjects.game.GameRunner;

import java.util.Arrays;

public  class XMLConfigurationLauncher {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            context.getBean(GameRunner.class).run();
        }
    }
}
