package com.kodewala.exceptionhandling;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver2 driver = new Driver2();
		driver.doSomething();
		

	}
	
	public void doNothing() throws Exception {
		
		try {
			String name = null;
			int length = name.length();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("Internal error!!!"); //used to throw new exception.
		}
	}
	
	public void doSomething() {
		System.out.println("Driver.doSomething()");
		try {
			doNothing();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
