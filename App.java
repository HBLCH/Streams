package com.myapp;

import java.util.*;

/**
 * \Lamdaa expression helps us to write th code in in declerative/functional way
 * provides concise way to iplement SAM single abstract method by using
 * expression (argument list)->{body}
 * 
 *
 */
interface Shape {
	public void draw();// sam

}

interface Color {

	public String getColor(String color);
}

interface Square {

	public int cal(int a, int b);
}

public class App {
	public static void main(String[] args) {
		int height = 30;
		Shape s1 = new Shape() {
			public void draw() {
				System.out.println("Drwain" + height);
			}
		};
		s1.draw();
		// lambda java 8
		Shape s2 = () -> {
			System.out.println("Lamda drwaing" + height);
		};
		s2.draw();

		Color c1 = (color) -> {
			return "Color" + color;
		};
		c1.getColor("blue");
		Square ss = (a, b) -> {
			return (a + b);
		};
		System.out.println(ss.cal(1, 2));
		List<String> list = new ArrayList<>();
		list.add("Alex");
		list.add("Alex1");
		list.add("Alex2");
		list.add("Alex3");
		list.forEach(System.out::println);// :: refers tomethod reference
		list.forEach((x) -> System.out.println(list.indexOf(x)));
		

	}
}
