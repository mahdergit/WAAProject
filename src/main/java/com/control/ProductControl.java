package com.control;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.entity.Product;

@Named("productControl")
@SessionScoped
public class ProductControl implements Serializable{
	private Product product;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String searchProduct() {
		return null;
	}

}
