package com.inheritance;

public class hybridInheritance01 extends multiLevelInheritance {
 //To access the father method and get the grandfather name.
	
	public void sonOfSaravanan01() {
	   String son = "Rithin";
	   System.out.println(son);

	}
	
	public static void main(String[] args) {
		hybridInheritance01 obj = new hybridInheritance01();
		obj.grandFather();
	}
	
}
