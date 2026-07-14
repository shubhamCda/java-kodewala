package com.kodewala.inheritance.payment;


class Payment
{
	public String paymentType;
	public double amountToBeSend;
	public String destinationAccount;
	
	public void doPayment() {
		System.out.println("Payment Type: "+ paymentType);
		System.out.println("Amount: "+ amountToBeSend);
		System.out.println("Transfer Account: "+ destinationAccount);
		System.out.println("Payment done successfully!");
	}
}

class CreditCard extends Payment
{
	CreditCard(String _paymentType, double _amountToBeSend, String _destinationAccount) {
		this.paymentType = _paymentType;
		this.amountToBeSend = _amountToBeSend;
		this.destinationAccount = _destinationAccount;
	}
	
	public void CCFundsTransfer() {
		doPayment();
	}
}

class DebitCard extends Payment
{
	DebitCard(String _paymentType, double _amountToBeSend, String _destinationAccount) {
		this.paymentType = _paymentType;
		this.amountToBeSend = _amountToBeSend;
		this.destinationAccount = _destinationAccount;
	}
	
	public void DCFundsTransfer() {
		doPayment();
	}
}

class UPI extends Payment
{
	UPI(String _paymentType, double _amountToBeSend, String _destinationAccount) {
		this.paymentType = _paymentType;
		this.amountToBeSend = _amountToBeSend;
		this.destinationAccount = _destinationAccount;
	}
	
	public void UPIFundsTransfer() {
		doPayment();
	}
}

public class Driver {

	public static void main(String[] args) {
		
		CreditCard cc = new CreditCard("Credit Card", 10000, "76543123456");
		cc.CCFundsTransfer();

	}

}
