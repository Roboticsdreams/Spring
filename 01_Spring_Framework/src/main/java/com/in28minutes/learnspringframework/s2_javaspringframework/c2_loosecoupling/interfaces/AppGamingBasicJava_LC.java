package com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces;


import com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces.game.PacManGame;
import com.in28minutes.learnspringframework.s2_javaspringframework.c2_loosecoupling.interfaces.game.GameRunner;

public class AppGamingBasicJava_LC {
    public static void main(String[] args) {
       // var game= new MarioGame();
       //var game = new SuperContraGame();
        //1.Object creation
       var game = new PacManGame();
       //2. Object create + wiring of dependency
        //Game is the dependency for GameRunner class
        var gamerRunner = new GameRunner(game);
        gamerRunner.run();
    }
}
