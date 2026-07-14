package com.kodewala.set.hashset;

import java.util.HashSet;



public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Employee> set = new HashSet<Employee>();
		
		Employee emp1 = new Employee("shubham1");
		Employee emp2 = new Employee("shubham2");
		Employee emp3 = new Employee("shubham3");
		Employee emp4 = new Employee("shubham4");
		Employee emp5 = new Employee("shubham5");
		Employee emp6 = new Employee("shubham6");
		Employee emp7 = new Employee("shubham7");
		Employee emp8 = new Employee("shubham8");
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		set.add(emp7);
		set.add(emp8);
		
		System.out.println(set);
		
	}

}
