package com.polymorphism;

public class MethodOverriding {
	  public static void main(String[] args) {
	        Animal animal1 = new Animal();
	        Animal dog = new Dog();
	        Animal cat = new Cat();

	        animal1.makeSound(); // Calls the method in the Animal class
	        dog.makeSound();     // Calls the overridden method in the Dog class
	        cat.makeSound();     // Calls the overridden method in the Cat class
	    }
}
