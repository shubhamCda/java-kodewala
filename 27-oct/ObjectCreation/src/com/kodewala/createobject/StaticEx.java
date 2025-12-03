package com.kodewala.createobject;

public class StaticEx {

	static
	{
		System.out.println("Inside static block");
	}
	
	//IIB
	{
		System.out.println("inside IIB");
	}
	StaticEx()
	{
		System.out.println("Inside coinstructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main()");
		StaticEx staticEx = new StaticEx();
	}

}
