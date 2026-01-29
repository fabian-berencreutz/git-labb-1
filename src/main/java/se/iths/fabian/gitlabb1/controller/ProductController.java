package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String products(Model model) {
        List<String> products = List.of("Laptop", "Phone", "Tablet");
        model.addAttribute("products", products);
        return "products";
    }
}