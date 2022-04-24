package com.soumyadeep.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductsList {
    private List<String> productsNames;

    public List<String> getProductsNames() {
        return productsNames;
    }

    public void setProductsNames(List<String> productsNames) {
        this.productsNames = productsNames;
    }

    @Override
    public String toString() {
        return "ProductsList [productsNames=" + productsNames + "]";
    }

}