package com.kodewala.interfaces;

class Person implements Cloneable { // cloneable is a marker interface
	public String name;

	public Person(String _name) {
		this.name = _name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Marker interface{ empty } allow some activities like cloning, etc.

		Person p1 = new Person("Shubham");
		Person p2 = (Person) p1.clone(); // object obj = new Person(); {downcast}

		System.out.println(p2.name);
	}

}
