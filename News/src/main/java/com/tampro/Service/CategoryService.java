package com.tampro.Service;

import java.util.List;

import com.tampro.Domain.Category;

public interface CategoryService {
	
	public Category getCategoryById(int id);
	
	public List<Category> getAllCategory();
	
	public Category getCategoryByUrl(String url);

}
