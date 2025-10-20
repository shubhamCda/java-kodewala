package com.kodewala.interfaces;

interface IBank {
	void pay();

	void settle();

	// 2 fwatures introduced in JAVA 8
	default void stopPayment() {
		System.out.println("Your payment is Stopped");
		connectToServer();
	}

	public static void sendNotification() {
		System.out.println("Notification sent!");
		connectToServer();
	}
	
	private static void connectToServer() {  //java 9 and onwards... for  reusability and cleaner design.
		System.out.println("connecting to server:");
	}
}

class SBIBank implements IBank {

	@Override
	public void pay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub

	}

	public void sendNotification() {
		// TODO Auto-generated method stub

	}

}

class HDFCBank implements IBank {

	@Override
	public void pay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void settle() {
		// TODO Auto-generated method stub

	}

}

public class Driver2 {

	public static void main(String[] args) {
		// usage of static method in INTERFACE to avoid code duplicacy

	}

}
