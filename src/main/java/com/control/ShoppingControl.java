package com.control;

import java.io.Serializable;
import java.util.Map;




import org.hibernate.SessionFactory;

import com.dao.AccountDAO;
import com.dao.HibernateUtil;
import com.dao.IAccountDAO;
import com.dao.ShoppingCartDAO;
import com.entity.Product;
import com.entity.ShoppingCart;




import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@Named("shoppingControl")
@SessionScoped
public class ShoppingControl implements Serializable{
	private String requestedUrl;
	private ShoppingCart shoppingCart;
	private ShoppingCartDAO scDao;

	private static SessionFactory sf = HibernateUtil.getSessionFactory();

	public ShoppingControl() {
		scDao = new ShoppingCartDAO();
	}

	public ShoppingCart getSelected() {
		if (shoppingCart == null) {
			shoppingCart = new ShoppingCart();
		}
		return shoppingCart;
	}

	public void removeProduct(Product product) {
		
		shoppingCart.getProduct().remove(product);
		
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	


	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

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
