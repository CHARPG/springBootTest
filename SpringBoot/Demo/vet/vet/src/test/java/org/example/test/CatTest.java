package org.example.test;

import org.example.Cat;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class CatTest {

    @Test
     void test_get_cat_age()
    {
        ArrayList<Cat> catArray = new ArrayList<>();

        catArray.add(new Cat("cat", 0, 0));

        assertEquals(0, catArray.get(0).getAge(), "this is not it");
    }

    @Test
     void test_get_cat_eat()
    {
        Cat testCat = new Cat("cat", 0, 0);
        assertEquals("cat eats", testCat.eat(), "this is not it");
    }

    @Test
     void test_get_cat_kill()
    {
        Cat testCat = new Cat("cat", 0, 0);
        FlyingRat flyingRat = new FlyingRat("rat", 0, 100);
        assertEquals("cat kills rat", testCat.kill(flyingRat), "this is not it");
    }

    @Test
     void test_cat_name()
    {
        ArrayList<Cat> catArray = new ArrayList<>();

        catArray.add(new Cat("cat", 0, 0));
        catArray.get(0).setName("big cat");
        assertEquals("big cat", catArray.get(0).getName(), "this is not it");
    }

     @Test
     void test_cat_breed()
     {
         Cat testCat = new Cat("cat", 0, 0);
         Cat testCat2 = new Cat("cat", 0, 0);

         if(testCat.getClass() == testCat2.getClass()) {
             assertEquals("cat breeds with cat", testCat.breed(testCat, testCat2), "this is not it");
         }
     }

     @Test
     void test_cat_get_health()
     {
         Cat testCat = new Cat("cat", 0, 0);
         testCat.setHealth(100);
         assertEquals(100, testCat.getHealth(), "this is not it");
     }

     @Test
     void test_cat_die()
     {
         Cat testCat = new Cat("cat", 0, 0);

         assertEquals("cat dies", testCat.die(), "this is not it");
     }

     @Test
     void test_cat_breathe()
     {
         Cat testCat = new Cat("cat", 0, 0);

         assertEquals("cat breathes", testCat.breathe(), "this is not it");
     }
}