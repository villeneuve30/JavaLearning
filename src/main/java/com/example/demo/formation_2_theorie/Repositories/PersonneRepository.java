package com.example.demo.formation_2_theorie.Repositories;

import com.example.demo.formation_2_theorie.Entities.Formateur;
import com.example.demo.formation_2_theorie.Entities.Personne;
import com.example.demo.formation_2_theorie.Entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

//    @Query("SELECT f FROM Formateur")
//    List<Formateur> findAllFormateurs();
//
//    @Query("SELECT S FROM Stagiaire")
//    List<Stagiaire> findAllStagiaires();
}
