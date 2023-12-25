package com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces.game;

public class PacManGame implements GamingConsole {
    public void left(){
        System.out.println("left");
    }
    public void right(){
        System.out.println("right");
    }
    public void up(){
        System.out.println("up");
    }
    public void down(){
        System.out.println("down");
    }
}
