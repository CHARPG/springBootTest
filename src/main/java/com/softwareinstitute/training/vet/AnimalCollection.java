package com.softwareinstitute.training.vet;

import com.google.gson.Gson;
import org.example.Animal;
import org.example.Cat;
import org.example.FlyingRat;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {
    private List<Animal> animalList= new ArrayList();

    public AnimalCollection(){
        this.animalList.add(new Cat("Gareth", 3, 100));
        this.animalList.add(new Cat("Alex", 7, 80));
        this.animalList.add(new Cat("Billy", 2, 100));
        this.animalList.add(new FlyingRat("Ash", 7, 92));
        this.animalList.add(new FlyingRat("Tom", 4, 98));
    }

    public List<Animal> getAnimalCollection(){
        return this.animalList;
    }

    public String toString(){
        return new Gson().toJson(animalList);
    }
}
