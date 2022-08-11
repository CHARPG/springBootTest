package org.example;

import com.softwareinstitute.training.vet.AnimalCollection;

import static com.softwareinstitute.training.vet.AnimalCollection.catArray;
import static com.softwareinstitute.training.vet.AnimalCollection.flyingRatArray;

public class Animal{
    private String animal;
    private String name;
    private int age;
    private int health;

    public Animal(String animal, String name, int age, int health) {
        setAnimal(animal);
        setAge(age);
        setHealth(health);
        setName(name);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String move(String location)
    {
        return(this.getName() + " moves to " + location);
    }
    public String sleep()
    {
        return(this.getName() + " sleeps");
    }
    public String poop()
    {
        return(this.getName() + " poops");
    }
    public String die()
    {
        if(this instanceof Cat) {
            catArray.remove(this);
        }
        else if (this instanceof FlyingRat)
        {
            flyingRatArray.remove(this);
        }
        return(this.getName() + " dies");
    }
}