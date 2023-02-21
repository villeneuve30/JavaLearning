package com.example.demo.formation_2_theorie.Entities;

import com.example.demo.formation_2_theorie.Enums.Civilite;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.*;

@Entity
@DiscriminatorValue("F")
public class Formateur extends Personne{
    @Column(name="date_embauche")
    @Temporal(TemporalType.DATE)
    private Date dateEmbauche;
    @Column(name="experience")
    private int experience;
    @Column(name="status")
    private String status;
    @Column(name="interne")
    private boolean interne;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "Formateur_Matiere",
            joinColumns = { @JoinColumn(name = "formateur_id") },
            inverseJoinColumns = { @JoinColumn(name = "matiere_id") }
    )
    Set<Matiere> matieres = new HashSet<>();
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "formateur")
    @JsonIgnore
    private List<Stagiaire> stagiaires = new ArrayList<>();

    public Formateur() {
        super();
    }

    public Formateur(String nom, String prenom, String email, Civilite civilite, Adresse adresse, Date dateEmbauche, int experience, String status, boolean interne) {
        super(nom, prenom, email, civilite, adresse);
        this.dateEmbauche = dateEmbauche;
        this.experience = experience;
        this.status = status;
        this.interne = interne;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Matiere> getMatieres() {
        return matieres;
    }
    public void addMatieres(Matiere matiere) {
        this.matieres.add(matiere);
    }

    public boolean isInterne() {
        return interne;
    }

    public void setInterne(boolean interne) {
        this.interne = interne;
    }

    public List<Stagiaire> getStagiaires() {
        return stagiaires;
    }
    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }
    @Override
    public String toString() {
        return "Formateur{" +
                ", dateEmbauche=" + dateEmbauche +
                ", experience=" + experience +
                ", status='" + status + '\'' +
                ", interne=" + interne +
                ", matieres=" + matieres +
                ", stagiaires=" + stagiaires +
                '}';
    }

}
