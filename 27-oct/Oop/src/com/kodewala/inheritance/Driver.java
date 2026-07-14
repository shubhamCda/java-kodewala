package com.kodewala.inheritance;


class Banking
{
	public int balance = 100;
	String ifscCode = "IN0001";
	private String branchCode = "GD004";
	
	
	public void doFundsTransfer() {
		System.out.println("Funds transfer success!");
	}


	
}

class HDFCBank extends Banking
{
	public void hdfcFundTransfer() {
		System.out.println("Balance: "+ balance);
		System.out.println("IFSC code: "+ ifscCode);
//		System.out.println("Branch Code: "+ branchCode);
		doFundsTransfer();
	}
}

public class Driver {
	
	public static void main(String[] args) {
		// inheritance Banking fundsTransfer

		HDFCBank banking = new HDFCBank();
		banking.hdfcFundTransfer();
	}

}
