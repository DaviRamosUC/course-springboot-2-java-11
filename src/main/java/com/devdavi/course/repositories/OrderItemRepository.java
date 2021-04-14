package com.devdavi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavi.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	
}
