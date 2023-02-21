package com.example.demo.formation_1.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double quantity;
    private Double price;

    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Animal_Food",
            joinColumns = { @JoinColumn(name = "food_id") },
            inverseJoinColumns = { @JoinColumn(name = "animal_id") }
    )
    Set<Animal> animals = new HashSet<>();

    public Food() {
        super();
    }

    public Food(String name, Double quantity, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    // override toString() method
    @Override
    public String toString() {
        return "Food: {id:" + id + ", name:" + name + ", quantity:" + quantity + ", price:" + price + "}";
    }
}
