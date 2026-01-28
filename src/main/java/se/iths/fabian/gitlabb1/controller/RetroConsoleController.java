package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.fabian.gitlabb1.model.RetroConsole;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/consoles")
public class RetroConsoleController {
    @GetMapping
    public String getAllConsoles(Model model) {
        List<RetroConsole> consoleList = new ArrayList<>();

        RetroConsole console1 = new RetroConsole("Game Boy Advance", 2001, "Nintendo");
        RetroConsole console2 = new RetroConsole("Sega Genesis / Mega Drive", 1988, "Sega");
        RetroConsole console3 = new RetroConsole("GameCube", 2001, "Nintendo");

        consoleList.add(console1);
        consoleList.add(console2);
        consoleList.add(console3);

        model.addAttribute("consoles", consoleList);
        return "consoles"; 
    }
}
