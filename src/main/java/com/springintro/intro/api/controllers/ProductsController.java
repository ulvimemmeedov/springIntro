package com.springintro.intro.api.controllers;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * products controller
 * products api
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.springintro.intro.business.abstracts.ProductService;
import com.springintro.intro.entities.concretes.Product;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    private ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> getAll(){
        return this.productService.getAll();
    }
    
}
