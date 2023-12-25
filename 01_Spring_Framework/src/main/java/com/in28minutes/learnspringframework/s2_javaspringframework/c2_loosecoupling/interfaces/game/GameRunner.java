package com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces.game;

public class GameRunner {

    GamingConsole game;
    public  GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running game:"+game);
        game.left();
        game.right();
        game.up();
        game.down();
    }
}
