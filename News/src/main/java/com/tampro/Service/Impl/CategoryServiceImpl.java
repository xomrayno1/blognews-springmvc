package com.tampro.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tampro.Domain.Category;
import com.tampro.Repository.CategoryRepository;
import com.tampro.Service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.getCategoryById(id);
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.getAllCategoryBig();
	}

	@Override
	public Category getCategoryByUrl(String url) {
		// TODO Auto-generated method stub
		return categoryRepository.getCategoryByUrl(url);
	}

}
