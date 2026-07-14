package com.kodewala.encap;


class ATM
{
	private String pin = "1234";
	private double balance = 1000;
	
	

	public void withdraw(double amount, String enteredPin) {
		System.out.println("Current Balance: "+ balance);
		
		if (enteredPin.equals(pin) && amount <= balance) {
			balance -= amount;
			System.out.println("Balance post withdrawl: "+ balance);
			
		} else {
			System.out.println("Please enter a correct pin!");
		}
	}
	
	public void deposit(double amount, String enteredPin) {
		System.out.println("Current balance: "+balance);
		
		if (enteredPin.equals(pin) && amount > 0) {
			balance += amount;
			System.out.println("Balance post deposit: "+ balance);
		} else {
			System.out.println("Please enter a correct pin!");
		}
	}
}

public class Users {

	public static void main(String[] args) {
		// Encapsulation to protect the user from changing acc balance directly
		
		ATM user1 = new ATM();
		
//		user1.deposit(250, "1234");
		user1.withdraw(300, "1234");
		

	}

}
