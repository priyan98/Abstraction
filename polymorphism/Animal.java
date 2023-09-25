package com.polymorphism;

public class Animal {
	
	    void makeSound() {
	        System.out.println("The animal makes a generic sound.");
	    }
	}

	class Dog extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("The dog barks.");
	    }
	}

	class Cat extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("The cat meows.");
	    }
	}
	
	

