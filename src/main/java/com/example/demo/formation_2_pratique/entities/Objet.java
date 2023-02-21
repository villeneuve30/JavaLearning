package com.example.demo.formation_2_pratique.entities;

import com.example.demo.formation_2_pratique.enums.EtatCompletude;
import com.example.demo.formation_2_pratique.enums.EtatConservation;
import jakarta.persistence.*;

@Entity
public class Objet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fouille_id")
    private Fouille fouille;

    @Column(name = "designation", nullable = false)
    private String designation;

    @Enumerated(EnumType.STRING)
    @Column(name = "etat_conservation", nullable = false)
    private EtatConservation etatConservation;

    @Enumerated(EnumType.STRING)
    @Column(name = "etat_completude", nullable = false)
    private EtatCompletude etatCompletude;
    public Objet() {
    }

    public Objet(Fouille fouille, String designation, EtatConservation etatConservation, EtatCompletude etatCompletude) {
        this.fouille = fouille;
        this.designation = designation;
        this.etatConservation = etatConservation;
        this.etatCompletude = etatCompletude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fouille getFouille() {
        return fouille;
    }

    public void setFouille(Fouille fouille) {
        this.fouille = fouille;
    }

    public EtatConservation getEtatConservation() {
        return etatConservation;
    }

    public void setEtatConservation(EtatConservation etatConservation) {
        this.etatConservation = etatConservation;
    }

    public EtatCompletude getEtatCompletude() {
        return etatCompletude;
    }

    public void setEtatCompletude(EtatCompletude etatCompletude) {
        this.etatCompletude = etatCompletude;
    }
}
