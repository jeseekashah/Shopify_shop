package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Inventory {
@Id
@GeneratedValue
private int productId;
private String productName;
private String productDesc;
private double rate;
private int quantity;
private String location;


public Inventory() {
	super();
}

public Inventory(int productId, String productName, String productDesc, double rate, int quantity, String location) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDesc = productDesc;
	this.rate = rate;
	this.quantity = quantity;
	this.location = location;
}

public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}




}
