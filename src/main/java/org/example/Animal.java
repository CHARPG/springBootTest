package org.example;

public class Animal extends Main {
    private String name;
    private int age;
    private int health;

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
