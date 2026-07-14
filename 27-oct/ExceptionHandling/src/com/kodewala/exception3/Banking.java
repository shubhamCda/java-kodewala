package com.kodewala.exception3;

public class Banking extends InsufficientBalnceException{
	
	public Banking(String _message) {
		super(_message);
		// TODO Auto-generated constructor stub
	}

	int balance = 1000;

	public void doFundTransfer(int amount) throws Exception {
		if (balance > amount) {
			System.out.println("Fund transfer success!");
		} else {
			throw new Exception("Insufficient balance");
		}
	}
}
