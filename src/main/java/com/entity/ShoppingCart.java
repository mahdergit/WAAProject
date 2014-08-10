package com.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class ShoppingCart {
	@Id
	@GeneratedValue
	private int id;	
	@ManyToMany
	private List<Product> product;
	@ManyToOne
	private Account account;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	
	
	

}
