package com.example.demo.formation_2_theorie.Entities;

import com.example.demo.formation_2_theorie.Enums.Civilite;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_personne")
@Table(name="personne")
public abstract class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="civilite")
    @Enumerated(EnumType.STRING)
    private Civilite civilite;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="email")
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="adresse_id")
    private Adresse adresse;

    public Personne() {
        super();
    }

    public Personne(String nom, String prenom, String email, Civilite civilite, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.civilite = civilite;
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                ", civilite='" + civilite + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
