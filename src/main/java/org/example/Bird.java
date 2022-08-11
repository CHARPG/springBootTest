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

    public Animal breed(Animal animal1, Animal animal2)
    {
        return (new FlyingRat("rat", 0, 0));
    }
}
