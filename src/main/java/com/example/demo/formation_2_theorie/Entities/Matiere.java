package com.example.demo.formation_2_theorie.Entities;

import com.example.demo.formation_2_theorie.Enums.Difficulte;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nom")
    private String nom;
    @Column(name="duree")
    private int duree;
    @Column(name="difficulte")
    @Enumerated(EnumType.STRING)
    private Difficulte difficulte;

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Formateur_Matiere",
            joinColumns = { @JoinColumn(name = "matiere_id") },
            inverseJoinColumns = { @JoinColumn(name = "formateur_id") }
    )
    Set<Formateur> formateur = new HashSet<>();

    public Matiere() {
        super();
    }

    public Matiere(String nom, int duree, Difficulte difficulte) {
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
    }

    public Long getID() {
        return id;
    }

    public void setID(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public Set<Formateur> getFormateur() {
        return formateur;
    }

    public void addFormateur(Formateur formateur) {
        this.formateur.add(formateur);
    }

    @Override
    public String toString() {
        return "Matiere{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", duree=" + duree +
                ", difficulte='" + difficulte + '\'' +
                '}';
    }
}
