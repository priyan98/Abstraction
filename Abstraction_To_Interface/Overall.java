package com.Abstraction_To_Interface;

public class Overall {

	public static void main(String[] args) {
		Intermediate inter = new Intermediate();
		Interfaceclass a = new Intermediate(); // Interface reference to the subclass
       
		System.out.println("=======Access to subclass via=======");
		inter.Method01();  // Access the  method02 from the subclass
		inter.Method02(); // Access the abstract method03 from the subclass
		inter.Method03();
		inter.accessAbstractMethod(inter);
		
		System.out.println("=======Access to interface via=======");
		a.Method03(); // Access the method03 from the interface
		a.accessAbstractMethod(inter); // Access the abstract method01 via the interface
	}
}
