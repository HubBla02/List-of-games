package com.gamelist.gamelist;

import com.gamelist.gamelist.entity.Game;
import com.gamelist.gamelist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamelistApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GamelistApplication.class, args);
	}

	@Autowired
	GameRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Game game1 = new Game("Valorant", "FPS", "Riot Games", "Riot Client", "YES", "YES");
		Game game2 = new Game("League of legends", "MOBA", "Riot Games", "Riot Client", "YES", "YES");
		repo.save(game1);
		repo.save(game2);
	}
}
