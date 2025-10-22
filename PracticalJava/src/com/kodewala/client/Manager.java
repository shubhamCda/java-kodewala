package com.kodewala.client;

import com.noteskodewala.accessmodifier.Employee;

public class Manager extends Employee {
	
	public Manager(String name) {
		super(name);
	}
	
	public void displayGreetings() {
		sayHello();
	}

	public static void main(String[] args) {
		// Protected access modifier
		Manager manager = new Manager("Shubham");
		manager.displayGreetings();
	}

}
