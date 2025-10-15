package com.oops.java;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.setName("Masum");
		System.out.println(sa.getName());
		sa.setAccountNumber("09213422");
		System.out.println(sa.getAccountNumber());
		sa.setBalance(10000);
		System.out.println(sa.getBalance());

		
	}

}
