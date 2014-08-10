package com.control;

import java.io.Serializable;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("shoppingControl")
@SessionScoped
public class ShoppingControl implements Serializable{
	private String requestedUrl;
	public void checkout(){
		
	}
	public void continueShopping(){
		
	}
	public void moveToCart(){
		FacesContext fc = FacesContext.getCurrentInstance();
		Map<String, String> params = fc.getExternalContext()
				.getRequestParameterMap();
		requestedUrl = params.get("url");
		
		
	}
}
