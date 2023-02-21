package com.example.demo.formation_2_pratique.repositories;

import com.example.demo.formation_2_pratique.entities.Archeologue;
import com.example.demo.formation_2_pratique.entities.SiteDeFouille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.HashSet;

public interface ArcheologueRepository extends JpaRepository<Archeologue, Long> {
    @Query("SELECT a FROM Archeologue a " +
            "JOIN Fouille f ON f.equipe = a.equipe " +
            "JOIN Parcelle p ON f.parcelle = p.id " +
            "JOIN SiteDeFouille sdf ON p.siteDeFouille = sdf.id " +
            "WHERE sdf.id = :id_siteDeFouille")
    public HashSet<Archeologue> findAllBySiteDeFouille(@Param("id_siteDeFouille") SiteDeFouille siteDeFouille);
}
