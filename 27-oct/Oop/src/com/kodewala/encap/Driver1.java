package com.kodewala.encap;

class Banking
{
	private double balance;
	
	public double getBalance() {
		return balance;
	}

	Banking(double balance)
	{
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited. Balance: "+ balance);
		} else {
			System.out.println("Enter the valid amount!");
		}
	}
	
	public void withdrawl(double amount) {
		
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount withdrawn: "+ amount);
			System.out.println("Available balance: "+balance);
		} else {
			System.out.println("Enter the correct amount or amount is not available.");
		}
	}
}


public class Driver1 {

	public static void main(String[] args) {
		// understanding of Encapsulation
		
		Banking acc = new Banking(1000);
		
		System.out.println(acc.getBalance());
	}

}
