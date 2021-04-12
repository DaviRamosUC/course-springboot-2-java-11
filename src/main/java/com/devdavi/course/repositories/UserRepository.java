package com.devdavi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavi.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
