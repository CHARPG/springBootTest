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

    public String breed(Animal animal1, Animal animal2)
    {
        if(animal1.getClass() == animal2.getClass())
        {
            flyingRatArray.add(new FlyingRat("rat", 0, 0));
        }
        return (animal1.getName() + " breeds with " + animal2.getName());
    }
}
