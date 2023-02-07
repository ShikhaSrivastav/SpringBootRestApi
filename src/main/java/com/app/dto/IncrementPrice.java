package com.app.dto;

public class IncrementPrice {
private String productName;
private double increment;
public IncrementPrice() {
	super();
}
public IncrementPrice(String productname, double increment) {
	super();
	this.productName = productname;
	this.increment = increment;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productname) {
	this.productName = productname;
}
public double getIncrement() {
	return increment;
}
public void setIncrement(double price) {
	this.increment = increment;
}
@Override
public String toString() {
	return "IncrementPrice [productname=" + productName + ", increment=" + increment + "]";
}

}
