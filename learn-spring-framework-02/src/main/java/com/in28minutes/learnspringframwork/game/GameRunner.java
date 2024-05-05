package com.in28minutes.learnspringframwork.game;

import com.in28minutes.learnspringframework.game.MarioGame;


public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game ;

    }
    public void run() {
        // implementation for running the game
    	System.out.println("Running game: " + game);
    }
}