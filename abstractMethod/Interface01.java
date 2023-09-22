package com.abstractMethod;

public interface Interface01 {
   void  smoketest();
   void regression();
}

class inter implements Interface01{

	@Override
	public void smoketest() {
		System.out.println("20 lines of code");
		
	}

	@Override
	public void regression() {
		System.out.println("30 lines of code");
		
	}
 public static void main(String[] args) {
	inter obj = new inter();
	obj.smoketest();
	obj.regression();
}	
}