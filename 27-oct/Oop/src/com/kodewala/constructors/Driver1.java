package com.kodewala.constructors;


class Employee
{
	String name;
	
	Employee(String name) {
	
		this.name = name;
		System.out.println(name + " is an Employee.");
	}
}

class Manager extends Employee
{

	String department;
	
	Manager(String name, String department) {
		
		super(name); //calls Employee constructor
		this.department = department;
		
		System.out.println(name + " is a Manager of "+ department+ " department");
	}
	
}

class Driver1 {

	public static void main(String[] args) {
		
		Manager emp1 = new Manager("Shubh", "IT");
	}

}
