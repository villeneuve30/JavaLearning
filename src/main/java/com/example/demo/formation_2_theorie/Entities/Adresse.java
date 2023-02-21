package com.example.demo.formation_2_theorie.Entities;

import jakarta.persistence.*;

@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="numero")
    private int numero;
    @Column(name="rue")
    private String rue;
    @Column(name="ville")
    private String ville;
    @Column(name="code_postal")
    private String codePostal;
    @Column(name="pays")
    private String pays;
    @OneToOne
    @JoinColumn(name="personne_id")
    private Personne personne;

    public Adresse() {
    }

    public Adresse(int numero, String rue, String ville, String codePostal, String pays, Personne personne) {
        this.numero = numero;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.pays = pays;
        this.personne = personne;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
