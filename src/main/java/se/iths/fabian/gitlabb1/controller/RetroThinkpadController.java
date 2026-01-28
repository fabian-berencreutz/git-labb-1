package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.fabian.gitlabb1.model.RetroThinkpad;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thinkpads")
public class RetroThinkpadController {
    @GetMapping
    public String getAllThinkpads(Model model) {
        List<RetroThinkpad> thinkpadList = new ArrayList<>();

        RetroThinkpad thinkpad1 = new RetroThinkpad("ThinkPad T20", 2000, "T-series");
        RetroThinkpad thinkpad2 = new RetroThinkpad("ThinkPad X20", 2000, "X-series");
        RetroThinkpad thinkpad3 = new RetroThinkpad("ThinkPad 600X", 1998, "600-series");

        thinkpadList.add(thinkpad1);
        thinkpadList.add(thinkpad2);
        thinkpadList.add(thinkpad3);

        model.addAttribute("thinkpads", thinkpadList);
        return "thinkpads";
    }
}
