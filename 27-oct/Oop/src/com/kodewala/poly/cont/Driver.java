package com.kodewala.poly.cont;

class Bill
{
	public Banking generateBill(String name, String gstNo, int amount) {
		System.out.println("generate bill on Bill class");
		return new Banking();
	}
}

class Invoice extends Bill
{
	@Override
	public SBI generateBill(String name, String gstNo, int amount) {
		System.out.println("generate bill in Invoice class.");
		return new SBI();
	}
}

public class Driver {

	public static void main(String[] args) {
		// overriding method concept

		Bill bill = new Bill();
		bill.generateBill("shubham", "AWS2345244P", 10090);
	}

}
