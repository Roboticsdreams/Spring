package com.in28minutes.learnspringframework.s2_javaspringframework.c1_tightcoupling;

import com.in28minutes.learnspringframework.s2_javaspringframework.c1_tightcoupling.game.GameRunner;
import com.in28minutes.learnspringframework.s2_javaspringframework.c1_tightcoupling.game.SuperContraGame;

public class AppGamingBasicJava_TC {
    public static void main(String[] args) {
       // var game= new MarioGame();
        var game = new SuperContraGame();
        var gamerRunner = new GameRunner(game);
        gamerRunner.run();
    }
}
