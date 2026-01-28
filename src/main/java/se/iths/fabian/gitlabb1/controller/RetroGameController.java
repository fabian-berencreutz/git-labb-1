package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.fabian.gitlabb1.model.RetroGame;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/games")
public class RetroGameController {
    @GetMapping
    public String getAllGames(Model model) {
        List<RetroGame> gamesList = new ArrayList<>();
        RetroGame game1 = new RetroGame("Pokémon Crystal", 2000, "Game Boy Color");
        RetroGame game2 = new RetroGame("Pokémon FireRed ", 2004, "Game Boy Advance");
        RetroGame game3 = new RetroGame("Pokémon Platinum", 2008, "Nintendo DS");

        gamesList.add(game1);
        gamesList.add(game2);
        gamesList.add(game3);

        model.addAttribute("games", gamesList);
        return "games";
    }
}
