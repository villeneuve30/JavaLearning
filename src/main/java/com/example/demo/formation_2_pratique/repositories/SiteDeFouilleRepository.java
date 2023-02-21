package com.example.demo.formation_2_pratique.repositories;

import com.example.demo.formation_2_pratique.entities.Equipe;
import com.example.demo.formation_2_pratique.entities.Fouille;
import com.example.demo.formation_2_pratique.entities.SiteDeFouille;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;

public interface SiteDeFouilleRepository extends JpaRepository<SiteDeFouille, Long> {
}
