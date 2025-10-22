package com.noteskodewala.accessmodifier;

public class BankAccount {
	private double balance;
	
	private void updateBalance(double amount) {
		this.balance = amount;
	}
	
	public void deposit(double amount) {
		if (amount>0) {
			updateBalance(amount);
			System.out.println("Deposit Successful. Current Balance: "+ balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
