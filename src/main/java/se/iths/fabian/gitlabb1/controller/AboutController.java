package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.fabian.gitlabb1.model.Person;

import java.util.List;

@Controller
@RequestMapping("/about")
public class AboutController {

    @GetMapping
    public String about(Model model) {
        List<Person> creators = List.of(
            new Person("Fabian", 123, "fabian@iths.se"),
            new Person("Ana", 123, "ana@iths.se")
        );
        model.addAttribute("creators", creators);
        return "about";
    }
}