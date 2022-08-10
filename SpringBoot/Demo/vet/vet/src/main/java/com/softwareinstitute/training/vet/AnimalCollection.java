package com.softwareinstitute.training.vet;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {
    private List<Animal> animalList= new ArrayList();

    public AnimalCollection(){
        this.animalList.add(new Animal("Gareth"));
        this.animalList.add(new Animal("Alex"));
        this.animalList.add(new Animal("Billy"));
        this.animalList.add(new Animal("Ash"));
        this.animalList.add(new Animal("Tom"));
    }

    public List<Animal> getAnimalCollection(){
        return this.animalList;
    }

    public String toString(){
        String json = new Gson().toJson(animalList);
        return json;
    }
}
