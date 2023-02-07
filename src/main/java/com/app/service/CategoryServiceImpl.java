package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.customexception.ResourseNotFoundException;
import com.app.entities.Category;
import com.app.repository.CategoryRepository;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository catRepo;
	
	@PostConstruct
	public void init() {
		System.out.println("in init of category service");
	}

	@Override
	public List<Category> getAllCategoryDetails() {
		// TODO Auto-generated method stub
		return catRepo.findAll();
	}

	@Override
	public Category addCatDetails(Category cat) {
		
		return catRepo.save(cat);
	}

	@Override
	public Category getCategoryById(Integer categoryId) {
		
		return catRepo.findById(categoryId).orElseThrow(()->new ResourseNotFoundException("wrong id"));
	}
	
	

}
