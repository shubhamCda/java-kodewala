package com.kodewala.inheritance;

class Employee extends Object{
	
//	private String location;
	String location;
	String band;

}

class Manager extends Employee
{
	public void doSomething() {
		System.out.println(location);
		System.out.println(band);
	}
}

public class Driver1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
