package com.softwareinstitute.training.vet;

import org.example.Animal;
import org.example.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class VetApplication {

	public AnimalCollection animalCollection = new AnimalCollection();

	public static void main(String[] args) {
		SpringApplication.run(VetApplication.class, args);
	}
	@GetMapping("/customRoute")
	public String myResponse(){
		return animalCollection.toString();
	}

	@PutMapping("/add")
	@ResponseBody
	public void change(@RequestParam String animal, @RequestParam String name, @RequestParam int age, @RequestParam int health)
	{
		animalCollection.addAnimal(new Animal(animal , name, age, health));
	}
}