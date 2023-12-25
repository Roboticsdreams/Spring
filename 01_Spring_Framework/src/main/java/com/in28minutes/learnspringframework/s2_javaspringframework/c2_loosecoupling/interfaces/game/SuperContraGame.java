package com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces.game;

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
