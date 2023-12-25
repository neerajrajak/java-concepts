package com.questions;

//Method Hiding
//- Both parent and child class methods must be static methods.
//- Method resolution always takes care by compiler based on reference type.
//- Compile time polymorphism / static polymorphism / early binding.
//
//Method Overriding
//- Both parent and child class methods must instance methods.
//- Method resolution always takes care by javm based on runtime object.
//- Runtime polymorphism / Dynamic polymorphism / late binding

 class Parent{
	public static void m1() {
		System.out.println("Parent.");
	}
}
 
 class Child extends Parent{
	 
	 public static void m1() {
		 System.out.println("Child.");
	 }
 }

public class ClassInstanceDifference {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();						// if both methods static => Parent 
									// if both are instance => Parent
		
		Child c = new Child();
		c.m1();						// if both methods static => Child 
									// if both are instance => Child
		
		Parent pc = new Child();
		pc.m1();					// if both methods static => Parent (based on resolution decided by Compiler) 
									// if both are instance => Child (based on object decided by JVM)
		
	}

}
