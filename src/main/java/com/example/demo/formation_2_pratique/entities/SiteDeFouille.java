package com.example.demo.formation_2_pratique.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SiteDeFouille {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nom_ville", nullable = false)
    private String nomVille;

    @OneToMany(mappedBy = "siteDeFouille")
    private List<Parcelle> parcelles;

    public SiteDeFouille() {
    }

    public SiteDeFouille(String nomVille, List<Parcelle> parcelles) {
        this.nomVille = nomVille;
        this.parcelles = parcelles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public List<Parcelle> getParcelles() {
        return parcelles;
    }

    public void addParcelles(Parcelle parcelle) {
        this.parcelles.add(parcelle);
    }
}
