package com.app.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.IncrementPrice;
import com.app.dto.ProductDto;
import com.app.entities.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService prodservice;
	@Autowired
	private ModelMapper mapper;
	@GetMapping
	public List<Product> getAllCategory() {
		return prodservice.getAllProductsDetails();
	}
	@PostMapping("/addprod")
	public Product addProduct(@RequestBody ProductDto prod )
	{
		Product product= mapper.map(prod, Product.class);
		return prodservice.addProdDetails(product,prod.getCategoryId());
	}
	@PutMapping
	public ApiResponse incrPrice(@RequestBody IncrementPrice dto) {
		return new ApiResponse(prodservice.updatePrice(dto));
	}
}

