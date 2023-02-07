package com.app.service;

import java.util.List;

import com.app.dto.IncrementPrice;
import com.app.dto.ProductDto;
import com.app.entities.Product;

public interface ProductService {

	List<Product> getAllProductsDetails();


	Product addProdDetails(Product product, Integer categoryId);


	String updatePrice(IncrementPrice dto);


	


	

}
