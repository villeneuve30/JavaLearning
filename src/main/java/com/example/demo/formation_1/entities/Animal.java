package com.example.demo.formation_1.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private int age;

    @ManyToOne
    private Pays pays;

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Animal_Food",
            joinColumns = { @JoinColumn(name = "animal_id") },
            inverseJoinColumns = { @JoinColumn(name = "food_id") }
    )
    Set<Food> foods = new HashSet<>();
    public Animal() {
        super();
    }
    public Animal(String nom, int age, Pays pays) {
        this.nom = nom;
        this.age = age;
        this.pays = pays;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Pays getPays() {
        return pays;
    }
    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Set<Food> getFoods() {
        return foods;
    }
    public void addFood(Food foods) {
        this.foods.add(foods);
    }

    @Override
    public String toString() {
        return "Animal: {id:" + id + ", nom:" + nom + ", age:" + age + " pays:" + pays.getName() + "}";
    }
}
