package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c4_loosecoupling.springlevel2.game;

public class MarioGame implements GamingConsole {

    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("accelerate");
    }
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go to hole");
    }
}
