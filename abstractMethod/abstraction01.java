package com.abstractMethod;

//abstract class..............................
public abstract class abstraction01 {
 abstract void test1();
  
 public void test2() {
	System.out.println("50 lines code");
   }
}
 
//sub class......................................
 class abstraction2 extends abstraction01{
	
	@Override
	void test1() {
		System.out.println("30 lines of code");
		
	}
	
	public static void main(String[] args) {
		abstraction2 obj = new abstraction2();
	    obj.test1();
	    obj.test2();
}
}