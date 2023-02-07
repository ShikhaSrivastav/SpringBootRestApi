package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Category;
import com.app.service.CategoryService;



@RestController
@RequestMapping("/categories")
//@Validated
public class CategoryController {
	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping
	public List<Category> getAllCategory() {
		return categoryservice.getAllCategoryDetails();
	}
	@PostMapping
	public Category addCategory(@RequestBody Category cat) {
		return categoryservice.addCatDetails(cat);
	}
	

}
