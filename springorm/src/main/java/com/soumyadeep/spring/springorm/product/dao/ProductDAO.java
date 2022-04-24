package com.soumyadeep.spring.springorm.product.dao;

import java.util.List;

import com.soumyadeep.spring.springorm.product.entity.Product;

public interface ProductDAO {

    int create(Product product);

    void update(Product product);

    void delete(Product product);

    Product find(int id);

    List<Product> findAll();
}