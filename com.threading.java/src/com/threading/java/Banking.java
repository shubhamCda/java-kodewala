package com.threading.java;

class BankingOP{
	public synchronized void creditMethod() {
		System.out.println("Amount is credited....");
	}
	
	public synchronized void debitMethod() {
		System.out.println("Amount is debited....");
	}
	
	public synchronized void updateBalance() {
		System.out.println("Balance is updated....");
	}
}

class Credit extends Thread{
	BankingOP op;
	
	public Credit(BankingOP op) {
		super();
		this.op = op;
	}
	
	public void run() {
		op.creditMethod();
	}
}

class Debit extends Thread{
	BankingOP op;
	
	public Debit(BankingOP op) {
		super();
		this.op = op;
	}
	public void run() {
		op.debitMethod();
	}
}

class UpdateBalance extends Thread{
	BankingOP op;
	public UpdateBalance(BankingOP op) {
		super();
		this.op = op;
		
	}
	public void run() {
		op.updateBalance();
	}
}
public class Banking {

	public static void main(String[] args) {
		// synchronized block method execution
		
		BankingOP bank = new BankingOP();
		
		Credit credit = new Credit(bank);
		credit.start();
		Debit debit = new Debit(bank);
		debit.start();
		UpdateBalance updateBalance = new UpdateBalance(bank);
		updateBalance.start();
	}

}
