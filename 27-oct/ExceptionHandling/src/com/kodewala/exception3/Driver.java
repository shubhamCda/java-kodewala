package com.kodewala.exception3;

class InsufficientBalnceException extends RuntimeException //unchecked exception
{
	public InsufficientBalnceException(String _message) {
		super(_message);
	}
}

public class Driver {

	public static void main(String[] args) {
		// Exception handling with user defined exception
		
		Banking banking = new Banking();
		
		try {
			banking.doFundTransfer(1200);
		} catch (InsufficientBalnceException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Please load you account...");
		}
		

	}

}
