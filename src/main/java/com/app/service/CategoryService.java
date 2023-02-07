package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.app.entities.Category;

public interface CategoryService {

	List<Category> getAllCategoryDetails();


	Category addCatDetails(Category cat);


	Category getCategoryById(Integer categoryId);

	

}
