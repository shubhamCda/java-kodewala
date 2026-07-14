package com.kodewala.list.hash;

import java.util.HashSet;

class Person
{
	String name;
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p2 = (Person) obj;
		return this.name.equals(p2.name); // gives true (desired result)
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
public class HashSetExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Person> set = new HashSet<Person>();
		
		Person p1 = new Person("Shubham");
		Person p2 = new Person("Shubham");
		
		System.out.println("p1::"+ p1.hashCode() );
		System.out.println("p2::"+ p2.hashCode() );
		
		System.out.println(set.size());
		
		System.out.println("equals:: "+ p1.equals(p2)); // false--> equals calling object class equals method 
		// if we want desired result then we have to override euquals method on our own
		// if we don't override equals and hashCode methods we don't get desired result.
		
		
		
		

	}

}
