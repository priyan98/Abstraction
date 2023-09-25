package com.Abstraction_To_Interface;

abstract class AbstractionClass {
	// Define an abstract class
	abstract void Method01();

	void Method02() {
		System.out.println("method2 abstraction");
	}
}

// Define an interface
interface Interfaceclass {
	void Method03();

	// Method in the interface that accesses the abstract class method
	default void accessAbstractMethod(AbstractionClass obj) {
		obj.Method01();
	}
}

// Create a concrete subclass of AbstractClass
class Intermediate extends AbstractionClass implements Interfaceclass {
	@Override
	void Method01() {
		System.out.println("method1 abstraction class");
	}

	@Override
	public void Method03() {
		System.out.println(" method3 interface class");
		
	}
}
