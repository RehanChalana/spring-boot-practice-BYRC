package com.rehan.ch8ex5.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rehan.ch8ex5.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }
}
