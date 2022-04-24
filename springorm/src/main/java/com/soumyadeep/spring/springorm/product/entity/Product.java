package com.soumyadeep.spring.springorm.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String desc;
    @Column(name = "price")
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [desc=" + desc + ", id=" + id + ", name=" + name + ", price=" + price + "]";
    }

    public void setPrice(double price) {
        this.price = price;
    }

}