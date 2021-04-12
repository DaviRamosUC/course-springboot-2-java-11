package com.devdavi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavi.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
