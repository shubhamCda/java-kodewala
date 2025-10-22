package com.noteskodewala.accessmodifier;

public class PrivateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		System.out.println("Balance: "+account.getBalance());
		
//		account.balance = 1000; //The field BankAccount.balance is not visible
	}

}
