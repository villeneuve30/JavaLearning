package com.example.demo.formation_2_pratique.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Parcelle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "numero", nullable = false)
    private int numero;
    @Column(name = "longueur", nullable = false)
    private Double longueur;
    @Column(name = "largeur", nullable = false)
    private Double largeur;

    @OneToMany(mappedBy = "parcelle")
    private List<Fouille> fouilles;

    @ManyToOne
    @JoinColumn(name = "site_de_fouille_id")
    private SiteDeFouille siteDeFouille;

    public Parcelle() {
    }

    public Parcelle(Double longueur, Double largeur, SiteDeFouille siteDeFouille, int numero) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.siteDeFouille = siteDeFouille;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }

    public SiteDeFouille getSiteDeFouille() {
        return siteDeFouille;
    }

    public void setSiteDeFouille(SiteDeFouille siteDeFouille) {
        this.siteDeFouille = siteDeFouille;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Parcelle{" +
                "id=" + id +
                ", longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
