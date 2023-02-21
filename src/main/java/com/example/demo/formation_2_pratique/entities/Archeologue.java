package com.example.demo.formation_2_pratique.entities;

import jakarta.persistence.*;

@Entity
public class Archeologue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;

    public Archeologue() {
    }

    public Archeologue(Equipe equipe) {
        this.equipe = equipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Archeologue{" +
                "id=" + id +
                ", equipe=" + equipe +
                '}';
    }
}
