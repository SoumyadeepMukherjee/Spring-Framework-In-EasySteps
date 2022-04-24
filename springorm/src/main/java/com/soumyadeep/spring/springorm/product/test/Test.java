package com.soumyadeep.spring.springorm.product.test;

import java.util.List;

import com.soumyadeep.spring.springorm.product.dao.ProductDAO;
import com.soumyadeep.spring.springorm.product.entity.Product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/soumyadeep/spring/springorm/product/test/config.xml");
        ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");

        // Product product = new Product();
        // product.setId(1);
        // product.setName("Iphone");
        // product.setDesc("Awesome");
        // product.setPrice(800);

        // productDAO.create(product);
        // productDAO.update(product);
        // productDAO.delete(product);

        // Product product = productDAO.find(1);

        List<Product> products = productDAO.findAll();
        System.out.println(products);
    }
}