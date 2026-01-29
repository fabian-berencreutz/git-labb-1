package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("greeting", "Hej detta är ett test!");
        //PR demo after resolving merge conflict (Labb1)
        return "home";
    }
}
