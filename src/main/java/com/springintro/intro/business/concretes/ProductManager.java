package com.springintro.intro.business.concretes;

import java.util.List;

import com.springintro.intro.business.abstracts.ProductService;
import com.springintro.intro.dataAccess.abstracts.ProductDao;
import com.springintro.intro.entities.concretes.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
    
}
