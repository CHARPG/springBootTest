package org.example;
import java.util.ArrayList;
public class Main {
    protected static final ArrayList<Cat> catArray = new ArrayList<>();
    protected static final ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();
    private static String[] birdNames = {"Blungo", "Cungo", "Dungo"};
    private static String[] catNames = {"Bingo", "Bongo", "Boingo"};

    public static void main(String[] args)
    {
        for(int i = 0; i < 3; i++) {
            flyingRatArray.add(new FlyingRat(birdNames[i], 0, 100));
        }
        for(int i = 0; i < 2; i++) {
            catArray.add(new Cat(catNames[i], 0, 100));
        }

        //breeding
        System.out.println("Amount of cats: " + catArray.size());

        System.out.println(catArray.get(0).breed(catArray.get(0), catArray.get(1)));
        catArray.get(2).setName(catNames[2]);
        catArray.get(2).setAge(0);

        System.out.println(catArray.get(2).getName() + " now exists");

        System.out.println("Amount of cats: " + catArray.size() + "\n");

        //cat actions
        System.out.println(catArray.get(0).eat() + "\n");

        //bird actions
        System.out.println(flyingRatArray.get(0).eat());

        //cat killing
        for(int i = 0; i < flyingRatArray.size(); i++)
        {
            System.out.println(catArray.get(i).move(flyingRatArray.get(i).getName()));

            System.out.println(catArray.get(i).kill(flyingRatArray.get(i--)) + "\n");
        }
        System.out.println("Amount of flying rats " + flyingRatArray.size());
    }
}
