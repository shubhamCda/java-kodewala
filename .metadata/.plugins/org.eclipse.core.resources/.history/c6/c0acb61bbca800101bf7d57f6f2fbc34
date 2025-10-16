package com.threading.java;

class Account{
	public static void updateBalanceMethod() {
		System.out.println("This is a static method....");
		synchronized (Account.class) {
			System.out.println("Inside synchronized block of static method.."+ Thread.currentThread().getName());
		}
	}
}
class Transaction extends Thread{
	Account acc;
	public Transaction(Account acc) {
		super();
		this.acc = acc;
	}
	public void run() {
		Account.updateBalanceMethod();
	}
}
public class StaticMethodSync {

	public static void main(String[] args) {
		// class lock concept
		Account account = new Account();
		
		Transaction transaction = new Transaction(account);
		transaction.start();

	}

}
