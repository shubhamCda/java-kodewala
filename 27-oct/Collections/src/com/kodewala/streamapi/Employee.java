package com.kodewala.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("shubha", 20000));
		emp.add(new Employee("ashu", 23000));
		emp.add(new Employee("raashid", 29000));
		
		
//		List<String> stream = emp.stream()
//								.map(e -> e.name)
//								.collect(Collectors.toList());
		
		List<Integer> stream = emp.stream()
				.map(e -> e.salary)
				.collect(Collectors.toList());

		System.out.println("List: "+ stream);
	}
	
	

}
