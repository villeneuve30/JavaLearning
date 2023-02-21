package com.example.demo.formation_1.repositories;

import com.example.demo.formation_1.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
    Food findByName(String name);
}
