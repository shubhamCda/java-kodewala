package com.oops.java;

class AdhaarReg {
	
	public void doRegistration(String VoterID, String Address, int mobile) {
		System.out.println("Your Adhaar Registration will begin: ");
		System.out.println("ID: "+ VoterID);
		System.out.println("Address: "+ Address);
		System.out.println("Mobile: "+ mobile);
	}
	
	public void doRegistration(String RationCard, int mobile) {
		System.out.println("Your Adhaar Registration will begin: ");
		System.out.println("Ration Card : "+ RationCard);
		System.out.println("Mobile: "+ mobile);
		}
}

public class MethodOverload {

	public static void main(String[] args) {
		// for Adhaar Registration
		
		AdhaarReg register = new AdhaarReg();
		
		register.doRegistration("ShuMulCh", "Bengaluru", 123445567);
		
		System.out.println("Next Persons Details \n");
		
		
		register.doRegistration("!2e3r3r", 763554);
	}

}
