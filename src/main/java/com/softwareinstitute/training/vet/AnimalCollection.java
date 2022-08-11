package com.softwareinstitute.training.vet;

import com.google.gson.Gson;
import org.example.Animal;
import org.example.Cat;
import org.example.FlyingRat;

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection{
    protected static List<Animal> animalList= new ArrayList();
    public static ArrayList<Cat> catArray = new ArrayList<>();
    public static final ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();
    private static String[] birdNames = {"Blungo", "Cungo", "Dungo"};
    private static String[] catNames = {"Bingo", "Bongo", "Boingo"};
    public AnimalCollection(){
        animalList.add((new Cat("e", 0, 0)));
        for (int i = 0; i < 3; i++) {
            flyingRatArray.add(new FlyingRat(birdNames[i], 0, 100));
            animalList.add(flyingRatArray.get(i));
        }
        for (int i = 0; i < 2; i++) {
            catArray.add(new Cat(catNames[i], 0, 100));
            animalList.add(catArray.get(i));
        }
        animalList.add(catArray.get(0).breed(catArray.get(0), catArray.get(1)));
    }

    public List<Animal> getAnimalCollection(){
        return this.animalList;
    }

    public String toString(){
        return new Gson().toJson(animalList);
    }
}
