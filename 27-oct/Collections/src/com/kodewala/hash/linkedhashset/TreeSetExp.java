package com.kodewala.hash.linkedhashset;

import java.util.TreeSet;

class Employee implements Comparable
{
	String name;
	
	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public int compareTo(Object o) { // -ve (small) zero(sam) +ve(big)
		Employee emp = (Employee) o;
		return this.name.compareTo(emp.name);
	}
}

public class TreeSetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		//time complexity--> nlogN
		
		Employee emp1 = new Employee("shubh");
		Employee emp2 = new Employee("ashu");
		Employee emp3 = new Employee("raashid");
		Employee emp4 = new Employee("satyam");
		Employee emp5 = new Employee("guru");
		Employee emp6 = new Employee("zambi");
		
		
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		ts.add(emp5);
		ts.add(emp6);
		
		for (Employee employee : ts) {
			
			System.out.println(employee.name);
		}
		
		
		
	}

}
