package com.gamelist.gamelist.service;

import com.gamelist.gamelist.entity.Game;

import java.util.List;

public interface GameService {
    List<Game> getAllGames();

    Game saveGame(Game game);

    Game getGameById(int id);
    Game updateGame(Game game);

    void deleteGame(int id);
}
