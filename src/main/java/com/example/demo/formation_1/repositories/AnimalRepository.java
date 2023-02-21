package com.example.demo.formation_1.repositories;

import com.example.demo.formation_1.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    List<Animal> findByNom( String nom );
    List<Animal> findByAge(int i);
}
