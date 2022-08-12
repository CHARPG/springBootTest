package org.example.test;

import org.example.Cat;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FlyingRatTest {
    @Test
    void test_flyingrat_eat()
    {
        FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);

        assertEquals("rat eats", flyingRat.eat(), "this is not it");
    }

     @Test
     void test_flyingrat_name()
     {
         ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();

         flyingRatArray.add(new FlyingRat("rat", "rat",0, 100));
         flyingRatArray.get(0).setName("big rat");
         assertEquals("big rat", flyingRatArray.get(0).getName(), "this is not it");
     }

     @Test
     void test_flyingrat_age()
     {
         ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();

         flyingRatArray.add(new FlyingRat("rat", "rat",0, 100));

         assertEquals(0, flyingRatArray.get(0).getAge(), "this is not it");
     }

     @Test
     void test_flyingrat_get_health()
     {
         FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);
         flyingRat.setHealth(100);

         assertEquals(100, flyingRat.getHealth(), "this is not it");
     }

     @Test
     void test_flyingrat_is_flying()
     {
         FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);

         assertFalse(flyingRat.isFlying(), "this is not it");
     }

     @Test
     void test_flyingrat_takeoff()
     {
         FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);

         assertEquals("rat takes off", flyingRat.takeOff(), "this is not it");
     }

     @Test
     void test_flyingrat_flight()
     {
         FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);

         assertEquals("rat is flying", flyingRat.flight(), "this is not it");
     }

     @Test
     void test_flyingrat_landing()
     {
         FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);

         assertEquals("rat has landed", flyingRat.landing(), "this is not it");
     }

    @Test
    void test_flyingrat_breathe()
    {
        FlyingRat flyingRat = new FlyingRat("rat", "rat",0, 100);

        assertEquals("rat breathes", flyingRat.breathe(), "this is not it");
    }

/*    @Test
    void test_flyingrat_breed()
    {
        FlyingRat testFlyingRat = new FlyingRat("rat", 0, 0);
        FlyingRat testFlyingRat2 = new FlyingRat("rat", 0, 0);

        if(testFlyingRat.getClass() == testFlyingRat2.getClass()) {
            assertEquals("rat breeds with rat", testFlyingRat.breed(testFlyingRat, testFlyingRat2), "this is not it");
        }
        if(testFlyingRat.getClass() == testFlyingRat2.getClass()) {
            assertEquals("rat breeds with rat", testFlyingRat2.breed(testFlyingRat2, testFlyingRat), "this is not it");
        }
    }*/
}
