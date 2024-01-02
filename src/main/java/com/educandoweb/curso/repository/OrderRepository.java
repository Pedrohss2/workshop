package com.educandoweb.curso.repository;

import com.educandoweb.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
