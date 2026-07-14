package com.kodewala.list.arraylist;

import java.util.ArrayList;

public class Driver {

	//collection -> List -> ArrayList -> 1. Ordered
	//                   -> LinkedList   2. allow Duplicate
	//                                   3. multiple null
	public static void main(String[] args) {
		// generate 
		
		ArrayList<String> products = new ArrayList<String>();
		
		products.add("apple16");
		products.add("Whirlpool ref");
		products.add(null);
		products.add(null);
		products.add("apple16");
		
		System.out.println("Products ::"+ products);

	}

}
