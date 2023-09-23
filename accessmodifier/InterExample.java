package com.accessmodifier;

public class InterExample implements MyInterface {
	
	    public static void main(String[] args) {
	        // Accessing instance variable
	        System.out.println("Instance variable from interface: " + instanceVar);

	        // Accessing static variable
	        System.out.println("Static variable from interface: " + staticVar);

	        // Accessing final variable
	        System.out.println("Final variable from interface: " + finalVar);
	    }
	}


