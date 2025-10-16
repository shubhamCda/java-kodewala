package com.kodewala.interfaces;

@FunctionalInterface
interface AddNums {
	public abstract int add(int a, int b);
	public default void message() {
		System.out.println("this is default method");
	}
}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		// functional interface -> having single abstract method

		AddNums addNums = (a, b) -> a + b; //lambda expression

		int sum = addNums.add(2, 7);

		System.out.println("SUM: " + sum);
		
		

	}

}
