package com.polymorphism;

public class MethodOverLoading {

	// Method with two integer parameters
	public int add(int a, int b) {
		int sum1 = a + b;
		System.out.println("Sum of two integers: " + sum1);
		return a + b;
	}

	// Method with three integer parameters
	public int add(int a, int b, int c) {
		int sum2 = a + b + c;
		System.out.println("Sum of three integers: " + sum2);
		return a + b + c;
	}

	// Method with two double parameters
	public double add(double a, double b) {
		double sum3 = a + b;
		System.out.println("Sum of two doubles: " + sum3);
		return a + b;
	}

	public static void main(String[] args) {

		MethodOverLoading m = new MethodOverLoading();

		// Call the methods
		m.add(5, 10);
		m.add(5, 10, 15);
		m.add(2.5, 3.5);

	}
}
