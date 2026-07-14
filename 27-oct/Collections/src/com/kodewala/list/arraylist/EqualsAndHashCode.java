package com.kodewala.list.arraylist;

import java.util.HashSet;

class Product extends Object
{
	String searchString;
	
	public Product(String searchString) {
		// TODO Auto-generated constructor stub
		this.searchString = searchString;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Product product = (Product) obj;
		return this.searchString.equals(product.searchString);
	}
	
	@Override
	public int hashCode() {
		return this.searchString.hashCode();
	}
}

public class EqualsAndHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Contract between equals and hashcode method
		// 1. if two objects are equals then their hascode must be same.
		// 2. if two object has same hashcode, those objects may or may not be equal.
		// (sometimes JVM will provide same hashcode for two different object, to confirm that we'll use equals method).
		
		Product product1 = new Product("apple");
		Product product2 = new Product("apple");

		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		
		System.out.println(product1.equals(product2));
		
		HashSet<String> hSet = new HashSet<String>();
		
		hSet.add("shubham");
		hSet.add("ashu");
		hSet.add("satyam");
		hSet.add("Raashid");
		hSet.add("shubham");
		
		System.out.println("Hash Set::"+ hSet);
		

		

	}

}
