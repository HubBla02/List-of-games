package com.gamelist.gamelist.controller;

import com.gamelist.gamelist.entity.Game;
import com.gamelist.gamelist.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GameController {
    private GameService service;

    public GameController(GameService service) {
        super();
        this.service = service;
    }

    @GetMapping("/games")
    public String listGames(Model model){
        model.addAttribute("games", service.getAllGames());
        return "games";
    }

    @GetMapping("/games/new")
    public String createGameForm(Model model){
        Game game = new Game();
        model.addAttribute("game", game);
        return "create_game";
    }

    @PostMapping("/games")
    public String saveGame(@ModelAttribute("game") Game game){
        service.saveGame(game);
        return "redirect:/games";
    }

    @GetMapping("/games/edit/{id}")
    public String editGameForm(@PathVariable int id, Model model){
        model.addAttribute("game", service.getGameById(id));
        return "edit_game";
    }

    @PostMapping("/games/{id}")
    public String updateGame(@PathVariable  int  id, @ModelAttribute("game") Game game, Model model){
        Game exGame = service.getGameById(id);
        exGame.setTitle(game.getTitle());
        exGame.setGenre(game.getGenre());
        exGame.setDeveloper(game.getDeveloper());
        exGame.setPlatform(game.getPlatform());
        exGame.setMultiplayer(game.getMultiplayer());
        exGame.setFree(game.getFree());
        service.updateGame(exGame);
        return "redirect:/games";
    }

    @GetMapping("/games/{id}")
    public String deleteGame(@PathVariable int id){
        service.deleteGame(id);
        return "redirect:/games";
    }
}
