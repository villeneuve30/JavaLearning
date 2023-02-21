package com.example.demo.formation_1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String code;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pays")
    @JsonIgnore
    private List<Animal> animaux = new ArrayList<>();

    public Pays() {
        super();
    }
    public Pays(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }

    public List<Animal> getAnimaux() {
        return animaux;
    }
    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pays: {id:" + id + ", name:" + name + ", animaux:" + animaux + " code:" + code + "}";
    }
}
