package com.tampro.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tampro.Domain.Category;

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	public Category  getCategoryById(int id);
	
	@Query("SELECT e FROM Category e where e.idParent = 0")
	public List<Category> getAllCategoryBig();
	
	@Query("SELECT e FROM Category e where e.url = ?1")
	public Category getCategoryByUrl(String url);
}
	