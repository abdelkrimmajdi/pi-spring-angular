package com.example.vitanova.Controller;

import com.example.vitanova.Service.ProductService;

public class ProductController {


    public void delete(Long IdProduct) {
        ProductService.delete(IdProduct);
    }

}
