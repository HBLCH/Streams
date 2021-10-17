package com.myapp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

// Stream never stores the elements ;
//Intermediate operation -> you can chain the methods filter.map
//Terminal operation -> should be the last method (reduce,etc)
//Automatic 
public class StreamsTest {
	public static void main(String[] args) {
		List <String> string =Arrays.asList("Behar","alex"," ","helen","Saniya","Fatmana");
		List<String>filetprocess=string.stream().filter(string1->!string1.startsWith("Behar")).map(string1->string1.toUpperCase())
				
.collect(Collectors.toList());
		System.out.println(filetprocess);
		//string.stream().map(n->n.charAt(0)).toString().toUpperCase().forEach(n->{System.out.print(n+" ");});
		
		
		System.out.println();
		Random r1=new Random();
		r1.ints().limit(10).forEach(System.out::println);
		List<Integer> nos =Arrays.asList(3,2,2,2,3,7,3,5);
		List<Integer> squareEach=nos.stream().map(n -> n*n).distinct().collect(Collectors.toList());
		System.out.println(squareEach);
		
		
	}

}
