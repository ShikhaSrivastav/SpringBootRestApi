package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.IncrementPrice;
import com.app.dto.ProductDto;
import com.app.entities.Category;
import com.app.entities.Product;
import com.app.repository.ProductRepository;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductRepository prodRepo;
@Autowired
private CategoryService catservice;
	@Override
	public List<Product> getAllProductsDetails() {
	
		return prodRepo.findAll();
	}
	@Override
	public Product addProdDetails(Product product,Integer categoryId) {
	    Category cat = catservice.getCategoryById(categoryId);
		cat.addProduct(product);
		return prodRepo.save(product);
	}
	@Override
	public String updatePrice(IncrementPrice dto) {
	int rows = prodRepo.updateProdPrice(dto.getIncrement(),dto.getProductName());
		return "no of rows affected " + rows + " in table";
	}

}
