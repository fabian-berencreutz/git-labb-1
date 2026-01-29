package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.fabian.gitlabb1.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers(Model model) {

        List<User> users = new ArrayList<>();
        users.add(new User("ana", "ana@test.com", 41));
        users.add(new User("nora", "nora@test.com", 9));
        users.add(new User("vid", "vid@test.com", 7));

        model.addAttribute("users", users);

        return "users";
    }
}
