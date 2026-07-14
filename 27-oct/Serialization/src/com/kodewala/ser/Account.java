package com.kodewala.ser;

import java.io.Serializable;

public class Account implements Serializable{
	String name;
	int amount;
	String bankCode;
	
	Account(String name, int amount, String bankCode)
	{
		super();
		this.name = name;
		this.amount = amount;
		this.bankCode = bankCode;
		
	}
}
