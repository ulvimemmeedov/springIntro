package com.springintro.intro.business.concretes;

import java.util.List;

import com.springintro.intro.business.abstracts.ProductService;
import com.springintro.intro.core.utilities.results.DataResult;
import com.springintro.intro.core.utilities.results.Result;
import com.springintro.intro.core.utilities.results.SuccessDataResult;
import com.springintro.intro.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>
        (this.productDao.findAll(),"The products are listed");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product added");
    }
    
}
