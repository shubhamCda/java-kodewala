package com.kodewala.list.arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("MB");
		city.add("DL");
		city.add("NSK");
		city.add("NGP");
		city.add("JP");
		
		System.out.println("City ::"+city);
		
		city.add(0, "MSR");
		
		System.out.println("City(updated) ::"+city);

	}

}
