package se.iths.fabian.gitlabb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.fabian.gitlabb1.model.Product;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public String products(Model model) {
        List<Product> products = List.of(
            new Product("Laptop", 12000.0, "Electronics"),
            new Product("Phone", 8000.0, "Electronics"),
            new Product("Coffee Mug", 150.0, "Kitchen")
        );
        model.addAttribute("products", products);
        return "products";
    }
}