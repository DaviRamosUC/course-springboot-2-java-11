package com.devdavi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
