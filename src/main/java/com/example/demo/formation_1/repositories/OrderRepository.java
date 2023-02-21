package com.example.demo.formation_1.repositories;

import com.example.demo.formation_1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>
{

}
