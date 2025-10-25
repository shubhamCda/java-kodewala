package com.kodewala.client;

class Student {
	String name;
	int age;

	public Student(String sName, int sAge) {
		// understanding the impact of explicit and implicit defining constructor
		this.name = sName;
		this.age = sAge;
	}
	public void displayInfo() {
		System.out.println("Student name: " + name + " \nStudent age: " + age);
	}
}

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Shubham", 22);
//		s1.age = 21;
//		s1.name = "shubham";
		s1.displayInfo();
	}
}
