package com.myapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee2 {

	int id;

	String name;

	int age;

	String gender;

	String department;

	int yearOfJoining;

	double salary;

	public static void main(String[] args) {

		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2(100, "Alex", 25, "Male", "IT", 2021, 35000.0));
		list.add(new Employee2(101, "Helen", 26, "Female", "HR", 2021, 35000.0));
		list.add(new Employee2(102, "Saniya", 27, "Female", "Product Development", 2020, 40000.0));
		list.add(new Employee2(103, "Fatmana", 28, "Female", "IT", 2020, 34100.0));
		list.add(new Employee2(104, "Michael", 29, "Male", "HR", 2019, 43000.0));
		list.add(new Employee2(105, "Behar", 30, "Male", "IT", 2002, 35000.0));
		list.add(new Employee2(106, "Creigh", 31, "Male", "IT", 2005, 35000.0));
		list.add(new Employee2(107, "Saran", 25, "Male", "Accounts", 2015, 22000.0));
		Map<String, Long> no = list.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.counting()));
		System.out.println(no);
		System.out.println(list.stream().map(n -> n.getDepartment()).distinct().collect(Collectors.toList()));
		list.stream().map(Employee2::getDepartment).distinct().forEach(System.out::println);

		Comparator<Employee2> comparator = Comparator.comparing(Employee2::getAge);
		Comparator<Employee2> comparator1 = Comparator.comparing(Employee2::getYearOfJoining);

		Map<String, Double> no1 = list.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.averagingDouble(Employee2::getSalary)));

//4
		System.out.println(list.stream()
				.filter(n -> n.getGender().equalsIgnoreCase("male") && n.getDepartment().equalsIgnoreCase("it"))
				.min(comparator).get());

//5
		System.out.println(list.stream().min(comparator1).get());

//6
		Map<String, List<Employee2>> employeeDept = list.stream()
				.collect(Collectors.groupingBy(Employee2::getDepartment));
		System.out.println(employeeDept);

		// 7
		System.out.printf("Average of Employees' salaries: %.2f%n",
				list.stream().mapToDouble(Employee2::getSalary).average().getAsDouble());
		System.out.printf("Higest of Employees' salaries: %.2f%n",
				list.stream().mapToDouble(Employee2::getSalary).max().getAsDouble());

// System.out.println(names);

//8
		Map<Boolean, List<Employee2>> employee25 = list.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		System.out.println(employee25);

	}

}
