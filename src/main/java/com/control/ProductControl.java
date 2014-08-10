package com.control;

import java.io.Serializable;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.dao.AccountDAO;
import com.entity.Product;

@Named("productControl")
@SessionScoped
public class ProductControl implements Serializable{
	private Product product;
	private String image;
	
	public ProductControl(){
//		acDao = new AccountDAO();
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String searchProduct() {
		return null;
	}
	
	public void moveToCart(){
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext()
				.getRequestParameterMap();
		image = params.get("url");
	//	product
		
		
		
	}

}
