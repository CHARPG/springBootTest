package org.example;

public class FlyingRat extends Bird implements Flying{

    public FlyingRat(String animal, String name, int age, int health) {
        super(animal, name, age, health);
    }

    public String eat()
    {
        return(getName() + " eats");
    }

    @Override
    public String takeOff() {
        return (getName() + " takes off");
    }

    @Override
    public String flight() {
        setFlying(true);
        return (getName() + " is flying");
    }

    @Override
    public String landing() {
        setFlying(false);
        return (getName() + " has landed");
    }
}
