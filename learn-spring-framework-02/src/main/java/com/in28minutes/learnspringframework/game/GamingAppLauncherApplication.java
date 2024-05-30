package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.in28minutes.learnspringframework.game", "com.in28minutes.learnspringframework" })
public class GamingAppLauncherApplication {

	@Bean
	public GamingConsole pacmanGame() {
		var game = new PacmanGame();
		return game;
	}

//    @Bean
//    public GameRunner gameRunner(@Qualifier("pacmanGame") GamingConsole game) {
//    	System.out.println("Parameter:" + game);
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}
