package com.kodewala.createobject;

public class Invoice extends Object{ //object class is a superclass for all classes

	Invoice()
	{
		this("iphone");//same class constructor
		//super : super class constructor
	}
	Invoice(String _name)
	{
		System.out.println(_name);//call constructor from another constructor - constructor chaining
	}
	public static void main(String[] args) {
		// constructor chaining
		Invoice invoice = new Invoice(); //constructor chaining: you can call one constructor from another constructor
		
		Invoice invoice1 = new Invoice("MyPhone");
	}

}
