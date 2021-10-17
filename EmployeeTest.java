package com.myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//POJO-> should have setter and getter methods for all the properties

@Data
@AllArgsConstructor
@NoArgsConstructor
class Employee {
	private int id;

	private String name;

	private String address;

}

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1001, "Saniya", "Cary"));
		list.add(new Employee(1002, "Fatmana", "Frisco"));
		list.add(new Employee(1003, "Micheal", "NY"));
		list.add(new Employee(1004, "Alex", "Boston"));

		Collections.sort(list, (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());

		});
		for (Employee e : list) {
			System.out.println(e.getId() + e.getName() + e.getAddress());
		}

	}

}