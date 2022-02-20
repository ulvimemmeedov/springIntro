package com.springintro.intro.business.abstracts;

import java.util.List;

import com.springintro.intro.core.utilities.results.DataResult;
import com.springintro.intro.core.utilities.results.Result;
import com.springintro.intro.entities.concretes.Product;


public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
