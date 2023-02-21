package com.example.demo.formation_2_pratique.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@IdClass(PKFouille.class)
public class Fouille {
    @ManyToOne
    @JoinColumn(name = "equipe_id")
    @Id private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "parcelle_id")
    @Id private Parcelle parcelle;

    @Temporal(TemporalType.DATE)
    @Id private Date date;

    public Fouille() {
    }

    public Fouille(Equipe equipe, Parcelle parcelle, Date date) {
        this.equipe = equipe;
        this.parcelle = parcelle;
        this.date = date;
    }

    public Parcelle getParcelle() {
        return parcelle;
    }

    public void setParcelle(Parcelle parcelle) {
        this.parcelle = parcelle;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

}
