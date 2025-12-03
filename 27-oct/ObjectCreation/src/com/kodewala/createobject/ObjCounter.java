package com.kodewala.createobject;

public class ObjCounter {
	static int counter = 0;
	
//	ObjCounter() {
//		counter++;
//		System.out.println("Object: "+ counter);
//	}

	{
		counter++;
		System.out.println("Object: "+ counter);
	}
	public static void main(String[] args) {
		// write a program to count number of objects created inside your application
		
		ObjCounter obj1 = new ObjCounter();
		ObjCounter obj2 = new ObjCounter();
		ObjCounter obj3 = new ObjCounter();
		ObjCounter obj4 = new ObjCounter();
		
		System.out.println("Number of object created: "+counter);

	}

}
