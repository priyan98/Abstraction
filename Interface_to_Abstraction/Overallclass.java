package com.Interface_to_Abstraction;

public class Overallclass {
	public static void main(String[] args) {

		Intermediate i = new Intermediate(); // create an object to intermediate class
		i.method03(); // call to the abstract class method
		i.method04();
		i.method05();
		i.method06();

		i.AccessInterfaceclass(new InterfaceClass() {

			@Override
			public void method01() {
				System.out.println("method 01");

			}
		});

	}
}
