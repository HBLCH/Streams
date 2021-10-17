package com.myapp;

interface Colors {

	default void printColor() {
		System.out.println("I am belon to Base Color");
	}

}

interface BlueColor {

	default void printColor() {
		System.out.println("I am belong to BlueColor");
	}
}

class Test implements Colors, BlueColor {

	public void printColor() {
		Colors.super.printColor();
		// BlueColor.super.printColor();

	}
}

public class DefaultMethodTest {

	public static void main(String[] args) {
		Colors c = new Test();

		c.printColor();

	}

}
