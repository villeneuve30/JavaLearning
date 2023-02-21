package com.example.demo.formation_2_pratique.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private Archeologue chef;

    @OneToMany(mappedBy = "equipe")
    @JsonIgnore
    private List<Archeologue> membres = new ArrayList<>();

    @OneToMany(mappedBy = "equipe")
    private List<Fouille> fouilles = new ArrayList<>();

    public Equipe() {
    }

    public Equipe(Archeologue chef, List<Archeologue> membres, List<Fouille> fouilles) {
        this.chef = chef;
        this.membres = membres;
        this.fouilles = fouilles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Archeologue getChef() {
        return chef;
    }

    public void setChef(Archeologue chef) {
        this.chef = chef;
    }

    public List<Archeologue> getMembres() {
        return membres;
    }

    public void setMembres(List<Archeologue> membres) {
        this.membres = membres;
    }

    public List<Fouille> getFouilles() {
        return this.fouilles;
    }

    public void addFouille(Fouille fouille) {
        this.fouilles.add(fouille);
    }
}
