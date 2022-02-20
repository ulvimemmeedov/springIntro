package com.springintro.intro.business.abstracts;

import java.util.List;
import com.springintro.intro.entities.concretes.Product;


public interface ProductService {
    List<Product> getAll();
}
