package com.rehan.ch8ex5.controllers;

import com.rehan.ch8ex5.model.Product;
import com.rehan.ch8ex5.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model page) {
        Object products = productService.findAll();
        page.addAttribute("products",products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product p, Double price , Model page) {
        productService.addProduct(p);
        Object products = productService.findAll();
        page.addAttribute("products",products);
        return "products.html";
    }


    
}
