package com.accessmodifier;

//Create a class named "Person" with different access modifiers
class Person {
 public String namePublic = "sangeeth";
 private String namePrivate = "priyan";
 protected String nameProtected = "satavana";
 String nameDefault = "yogesh";
 
 // Public method to access the private member. and here i'm using pojo concept.
    public String getPrivateName() {
     return namePrivate;
 }
}

//Another class accessing members of the "Person" class
public class AccessModifiersExample {
 public static void main(String[] args) {
     // Create an instance(object) of the "Person" class
     Person person = new Person();
     
     // Access public member from outside the class
     System.out.println("Public Name: " + person.namePublic);
     
     // Access the private member indirectly using a public method
     System.out.println("Private Name: " + person.getPrivateName());
     
     // Access protected member from a subclass (inherited)
     System.out.println("Protected Name: " + person.nameProtected);
     
     // Access default (package-private) member from the same package
     System.out.println("Default Name: " + person.nameDefault);
 }
}


