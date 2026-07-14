package com.kodewala.list.arraylist;

import java.util.ArrayList;

public class WordStartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> words = new ArrayList<String>();
		
		words.add("Ashu");
		words.add("shubh");
		words.add("Amit");
		words.add("AShok");
		words.add("Praveen");
		
		for (String name : words) {
			if (name.startsWith("A")) {
				System.out.println("Words start with character \"A\" is : "+name);
			}
		}
	}

}
