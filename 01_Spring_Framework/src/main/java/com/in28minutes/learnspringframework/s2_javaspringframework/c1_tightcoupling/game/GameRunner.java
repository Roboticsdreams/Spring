package com.in28minutes.learnspringframework.s2_javaspringframework.c1_tightcoupling.game;

public class GameRunner {
    /*
    MarioGame game;

    public  GameRunner(MarioGame game){
        this.game = game;
    }*/

    SuperContraGame game;
    public  GameRunner(SuperContraGame game){
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
