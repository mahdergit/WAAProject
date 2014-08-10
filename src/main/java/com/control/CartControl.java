package com.control;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.entity.Account;
import com.entity.Product;
import com.entity.ShoppingCart;

@Named("cartControl")
@SessionScoped
public class CartControl implements Serializable {
	private ShoppingCart shoppingCart;
	
	public void addToCart(Product product,int quantity){
		
	}
	public void getCart(Account account){
		
	}
	
	public void removeFromCart(Product product){
		
	}
	
	public void removeCart(){
		
	}
	

}
