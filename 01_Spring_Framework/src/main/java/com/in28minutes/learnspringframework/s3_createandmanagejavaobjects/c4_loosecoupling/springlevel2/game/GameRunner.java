package com.in28minutes.learnspringframework.s3_createandmanagejavaobjects.c4_loosecoupling.springlevel2.game;

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
