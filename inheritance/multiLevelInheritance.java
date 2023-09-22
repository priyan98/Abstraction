package com.inheritance;

public class multiLevelInheritance  extends singleinheritance01{

	public void father() {                 //here I'm extends to the mother method.	                                    //
		String f = "saravana";    // but mother method already extends to the father method
		System.out.println(f);    // so here easily access to the father method also. 
	}
	
	public static void main(String[] args) {
		multiLevelInheritance obj = new multiLevelInheritance();
		obj.grandFather();
		obj.grandMother();
	}
}
