package com.gamelist.gamelist.service.impl;

import com.gamelist.gamelist.entity.Game;
import com.gamelist.gamelist.repository.GameRepository;
import com.gamelist.gamelist.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private GameRepository repository;

    public GameServiceImpl(GameRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public List<Game> getAllGames() {
        return repository.findAll();
    }

    @Override
    public Game saveGame(Game game) {
        return repository.save(game);
    }

    @Override
    public Game getGameById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Game updateGame(Game game) {
        return repository.save(game);
    }

    @Override
    public void deleteGame(int id) {
        repository.deleteById(id);
    }
}
