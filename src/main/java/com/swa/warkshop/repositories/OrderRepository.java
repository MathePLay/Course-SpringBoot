package com.swa.warkshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swa.warkshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
