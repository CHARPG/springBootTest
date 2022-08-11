package org.example;

public class Cat extends Mammal{
    public Cat(String name, int age, int health)
    {
        setName(name);
        setAge(age);
        setHealth(health);
    }
    public String eat()
    {
        return(getName() + " eats");
    }
    public String kill(Animal animal)
    {
        System.out.println(animal.die());
        return(getName() + " kills " + animal.getName());
    }
}