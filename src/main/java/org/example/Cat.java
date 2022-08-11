package org.example;

public class Cat extends Mammal{
    public Cat(String animal, String name, int age, int health) {
        super(animal, name, age, health);
    }

    public String eat()
    {
        return(getName() + " eats");
    }
    public String kill(Animal animal)
    {
        animal.die();
        return(getName() + " kills " + animal.getName());
    }
}