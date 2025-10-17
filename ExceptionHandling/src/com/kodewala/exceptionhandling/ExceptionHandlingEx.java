package com.kodewala.exceptionhandling;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int s0 = Integer.parseInt(s); // java.lang.ArithmeticException

//		System.out.println(s.length());
		System.out.println("program START's here....");
		try {
			String s = args[2];
			String s2 = null;

			System.out.println(s2.length()); // java.lang.ArithmeticException
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("String is null....");
//			e.printStackTrace(); // tells the line no. on which exception occurs.
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array INDEX is not present....");
			e.printStackTrace();
		}
		System.out.println("Program END's here....");

//		int exp = 10 / 0;
//		System.out.println(exp); //java.lang.ArithmeticException:

	}

}
