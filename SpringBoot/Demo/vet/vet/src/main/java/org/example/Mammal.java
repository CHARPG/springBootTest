package org.example;

public class Mammal extends Animal{

    public String breathe()
    {
        return(this.getName() + " breathes");
    }

    public String breed(Animal animal1, Animal animal2)
    {
        if(animal1.getClass() == animal2.getClass())
        {
            catArray.add(new Cat("cat", 0, 0));
        }
        return (animal1.getName() + " breeds with " + animal2.getName());
    }
}
