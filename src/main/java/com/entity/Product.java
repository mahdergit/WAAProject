package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
@Id
@GeneratedValue
private int id;
@ManyToMany(mappedBy="products")
private List<Order> orders;
@ManyToMany(mappedBy="product")
private List<ShoppingCart> shoppingCart;
@ManyToMany
private List<ProductCategory> productCategories;

private String name;
private double price;
private String description;


}
