package com.springintro.intro.dataAccess.abstracts;

import com.springintro.intro.entities.concretes.Product;
/**
 * Product abstracts data access layer
*/
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}   
