package com.example.demo.formation_2_pratique.repositories;

import com.example.demo.formation_2_pratique.entities.Equipe;
import com.example.demo.formation_2_pratique.entities.Fouille;
import com.example.demo.formation_2_pratique.entities.PKFouille;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public interface FouilleRepository extends JpaRepository<Fouille, PKFouille> {
    public HashSet<Fouille> findAllByEquipe(Equipe equipe);
}
