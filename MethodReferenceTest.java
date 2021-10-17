package com.myapp;

/*
* Method Reference is used to refer method of functional interface
* It is compact and easy from lambdas perspective
*
* to a static method
* to a instance method
* to a constructor
*/
@FunctionalInterface
interface Vehicle {
	void speed();// SAM(Single Abstract Method

}

public class MethodReferenceTest {

	public static void speedSomething() {
		System.out.println("calling display method");
	}

	public static void printThread() {
		System.out.println("print thread is running");
	}

	public static void main(String[] args) {
//referring the static method
		Vehicle v = MethodReferenceTest::speedSomething;// :: stands for method reference
//calling the interface method
		v.speed();

		Thread t = new Thread(MethodReferenceTest::printThread);
		t.start();
	}
}