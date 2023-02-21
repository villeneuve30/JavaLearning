package com.example.demo.formation_1.repositories;

import com.example.demo.formation_1.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaysRepository extends JpaRepository<Pays, Long> {
    Pays findByCode(String code);
    Optional<Pays> findById(Long id);
    Pays findByName(String name);
}
