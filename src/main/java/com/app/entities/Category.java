package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.app.dto.ProductDto;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
	//@NotBlank(message="required")
	private String categoryName;
	//@NotBlank(message="required")
	private String description;
	@JsonIgnore
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL,
			orphanRemoval = true)
	private List<Product> products=new ArrayList<>();
	
	
	public Category() {
		
	}
	

	public Category(String categoryName,String description) {
		super();
		this.categoryName = categoryName;
		this.description = description;
		
	}


	//convinience method
	public void addProduct(Product prod) {
		products.add(prod);
		prod.setCategory(this);
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", description=" + description + ", products=" + products
				+ "]";
	}
	
}
//fetch = FetchType.LAZY,
