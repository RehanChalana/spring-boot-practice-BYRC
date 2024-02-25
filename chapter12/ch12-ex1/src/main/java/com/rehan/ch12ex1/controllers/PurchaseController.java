package com.rehan.ch12ex1.controllers;

import java.util.List;
import com.rehan.ch12ex1.model.Purchase;
import com.rehan.ch12ex1.repositories.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository=purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases() {
        return purchaseRepository.findAllPurchases();
    }
}

