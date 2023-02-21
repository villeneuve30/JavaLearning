package com.example.demo.formation_2_pratique.repositories;

import com.example.demo.formation_2_pratique.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public interface FouilleRepository extends JpaRepository<Fouille, PKFouille> {
    public HashSet<Fouille> findAllByEquipe(Equipe equipe);
}
