package com.example.demo.formation_2_theorie.Entities;

import com.example.demo.formation_2_theorie.Enums.Civilite;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorValue("S")
public class Stagiaire extends Personne {
    @Column(name="date_naissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "formateur_id")
    private Formateur formateur;
    public Stagiaire() {
        super();
    }

    public Stagiaire(String nom, String prenom, String email, Civilite civilite, Date dateNaissance, Adresse adresse, Formateur formateur) {
        super(nom, prenom, email, civilite, adresse);
        this.dateNaissance = dateNaissance;
        this.formateur = formateur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Formateur getFormateur() {
        return formateur;
    }
    public void setFormateur(Formateur formateur) {
        this.formateur = formateur;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "dateNaissance=" + dateNaissance +
                "} " + super.toString();
    }
}
