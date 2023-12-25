package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c4_loosecoupling.springlevel2.game;

public class SuperContraGame implements GamingConsole {
    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("shoot a bullet");
    }
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("sit-down");
    }
}
