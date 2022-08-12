package org.example;
public class Bird extends Animal{
    private boolean isFlying;

    public Bird(String animal, String name, int age, int health) {
        super(animal, name, age, health);
    }

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

    public Animal breed(Animal animal1)
    {
        if(this.getClass() == animal1.getClass()) {
            return (new FlyingRat("rat", "rat", 0, 0));
        }
        else
        {
            return null;
        }
    }
}
