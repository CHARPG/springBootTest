package org.example.test;

import org.example.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
     void test_animal_move() {
        Animal testAnimal = new Animal("animal", "animal",100, 100);
        assertEquals("animal moves to park", testAnimal.move("park"), "this is not it");
    }
    @Test
     void test_animal_sleep() {
        Animal testAnimal = new Animal("animal", "animal",100, 100);
        assertEquals("animal sleeps", testAnimal.sleep(), "this is not it");
    }
    @Test
     void test_animal_poop() {
        Animal testAnimal = new Animal("animal", "animal",100, 100);
        assertEquals("animal poops", testAnimal.poop(), "this is not it");
    }
    @Test
     void test_animal_die() {
        Animal testAnimal = new Animal("animal", "animal",100, 100);
        assertEquals("animal dies", testAnimal.die(), "this is not it");
    }
}
