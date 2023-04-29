package com.productData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
      @Id
      private int id;
      private String name;
      private int cost;
      private String brand;
      private int tax;
      private String expirymonth;
      private int Quantity;
      private int stock; 
      private int offer;
      private String Supplier;
	   public int getid()
	   {
		   return id;
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getExpirymonth() {
		return expirymonth;
	}
	public void setExpirymonth(String expirymonth) {
		this.expirymonth = expirymonth;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}
	public String getSupplier() {
		return Supplier;
	}
	public void setSupplier(String supplier) {
		Supplier = supplier;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
