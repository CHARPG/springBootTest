package org.example.test;

import org.example.Cat;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class MainTest {

    @Test
    void test_array_add()
    {
        ArrayList<FlyingRat> flyingRatArray = new ArrayList<>();
        ArrayList<Cat> catArray = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            flyingRatArray.add(new FlyingRat("rat", 0, 0));
            catArray.add(new Cat("cat", 0, 0));
        }
        assertEquals(3, flyingRatArray.size(), "this is not it");
        assertEquals(3, catArray.size(), "this is not it");
    }
}
