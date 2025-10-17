package com.kodewala.exceptionhandling;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "shubam";
		String s2 = null;

//		System.out.println(s.length());
		System.out.println(s2.length()); // java.lang.ArithmeticException

		int exp = 10 / 0;
		System.out.println(exp); //java.lang.ArithmeticException:

	}

}
