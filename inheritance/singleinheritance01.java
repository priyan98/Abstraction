package com.inheritance;

public class singleinheritance01 extends singleinheritance {

	public void grandMother() {
		String gm = "Maha";
        System.out.println(gm);
	}
	
	public static void main(String[] args) {
		singleinheritance01 obj = new singleinheritance01();
		obj.grandFather();
		obj.grandMother();
		
	}
}
