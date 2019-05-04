package com.tampro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tampro.Domain.News;

@Repository
@Transactional
public interface NewsRepository  extends JpaRepository<News, Integer>{

	@Query("SELECT e FROM News e where e.url = ?1")
	public News getNewsByUrl(String url);
	
	public News getNewById(int id);
}
