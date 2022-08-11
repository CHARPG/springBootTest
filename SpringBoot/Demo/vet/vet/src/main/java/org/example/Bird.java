package org.example;

public class Bird extends Animal{

    private boolean isFlying;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public String breathe()
    {
        return(this.getName() + " breathes");
    }

    public void breed(Animal animal1, Animal animal2)
    {
        System.out.println(animal1.getName() + " breeds with " + animal2.getName());
        flyingRatArray.add(new FlyingRat("rat", 0, 100));
    }
}
