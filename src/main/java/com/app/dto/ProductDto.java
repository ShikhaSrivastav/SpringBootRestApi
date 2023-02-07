package com.app.dto;

public class ProductDto {
 private String productName;
 private double price;
 private Integer categoryId;
public ProductDto() {
	super();
}
public ProductDto(String productName, double price, Integer categoryId) {
	super();
	this.productName = productName;
	this.price = price;
	this.categoryId = categoryId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Integer getCategoryId() {
	return categoryId;
}
public void setCategoryId(Integer categoryId) {
	this.categoryId = categoryId;
}
@Override
public String toString() {
	return "ProductDto [productName=" + productName + ", price=" + price + ", categoryId=" + categoryId + "]";
}
 
}
