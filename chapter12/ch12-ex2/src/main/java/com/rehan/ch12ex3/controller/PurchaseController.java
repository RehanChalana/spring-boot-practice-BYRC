package com.rehan.ch12ex3.controller;

import com.rehan.ch12ex3.model.Purchase;
import com.rehan.ch12ex3.repositories.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final ProductRepository productRepository;
    public PurchaseController(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase) {
        productRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases() {
        return productRepository.findALlPurchases();
    }
}
