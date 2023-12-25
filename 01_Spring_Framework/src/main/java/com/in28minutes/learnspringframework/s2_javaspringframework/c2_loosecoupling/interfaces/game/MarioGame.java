package com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces.game;

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
