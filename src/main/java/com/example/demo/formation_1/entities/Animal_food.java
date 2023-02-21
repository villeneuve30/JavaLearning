package com.example.demo.formation_1.entities;

public class Animal_food {
    private int animal_id;
    private int food_id;

    public Animal_food() {
        super();
    }
    public Animal_food(int animal_id, int food_id) {
        this.animal_id = animal_id;
        this.food_id = food_id;
    }

    public int getAnimal_id() {
        return animal_id;
    }
    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }
    public int getFood_id() {
        return food_id;
    }
    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    // override toString() method
    @Override
    public String toString() {
        return "Animal_Food: {animal_id:" + animal_id + ", food_id:" + food_id + "}";
    }
}
