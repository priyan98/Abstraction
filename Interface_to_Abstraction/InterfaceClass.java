package com.Interface_to_Abstraction;

//here i'm define an interface.
interface InterfaceClass {
	void method01();

	public static void method02() {
		System.out.println("interface public method");
	}
}

//here i'm create the abstract class and access the interface class	
abstract class abstractClass {

	public void method03() {
		System.out.println("20 lines of code");
	}

	public abstract void method04();

	protected abstract void method05();

	abstract void method06();

	public void AccessInterfaceclass(InterfaceClass inter) {
		inter.method01(); // here call the interface method.
		InterfaceClass.method02();

	}
}

// here i'm create the concrete class
class Intermediate extends abstractClass {

	@Override
	public void method04() {
		// here access to public method
		System.out.println("method4");

	}

	@Override
	protected void method05() {
		// here access to protected method
		System.out.println("method5");
	}

	@Override
	void method06() {
		// here access to default method
		System.out.println("method6");
	}

}


