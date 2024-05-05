package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GamingConsole;

@Component
public class GameRunner {
    private GamingConsole game;
    
    public GameRunner(@Qualifier("SuperContraGameQualifier")GamingConsole game2) {
        this.game = game2;
    }
    
    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
