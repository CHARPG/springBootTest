package org.example;
public class Mammal extends Animal{

    public Mammal(String animal, String name, int age, int health) {
        super(animal, name, age, health);
    }

    public String breathe()
    {
        return(this.getName() + " breathes");
    }

    public Animal breed(Animal animal1, Animal animal2)
    {
        return (new Cat("cat", "cat", 0, 0));
    }
}
