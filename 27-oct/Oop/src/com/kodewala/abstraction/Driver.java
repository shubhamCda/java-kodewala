package com.kodewala.abstraction;


abstract class Banking
{
	abstract void doFundTransfer();
}
class FundTransfer
{
	public void doFundTransfer() {
		validateAccount();
		checkBalance();
		checkLimit();
		checkDailyTxn();
		updateBalance();
		sendMsg();
		
	}

	private void sendMsg() {
		// TODO Auto-generated method stub
		
	}

	private void updateBalance() {
		// TODO Auto-generated method stub
		
	}

	private void checkDailyTxn() {
		// TODO Auto-generated method stub
		
	}

	private void checkLimit() {
		// TODO Auto-generated method stub
		
	}

	private void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	private void validateAccount() {
		// TODO Auto-generated method stub
		
	}
}
public class Driver {

}
