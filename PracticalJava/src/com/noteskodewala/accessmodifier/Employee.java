package com.noteskodewala.accessmodifier;

public class Employee {
	protected String employeeName;

	public Employee(String name) {
		this.employeeName = name;
	}

	protected void sayHello() {
		System.out.println("Hello, " + employeeName + "!");
	}
}
