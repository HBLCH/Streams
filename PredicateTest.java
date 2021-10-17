package com.myapp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//Predicate<Integer> lessThan = i -> (i < 18);
		System.out.println("print all the numbers");

		calculations(list, n -> true);
		System.out.println();
		System.out.println("print all the numbers>4");
		calculations(list, n -> n > 4);
		System.out.println();
		System.out.println("print all the numbers even ");
		calculations(list, n -> n % 2 == 0);
	}

	public static void calculations(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {
			if (predicate.test(n))
				System.out.print(n + "");

		}
	}
}
