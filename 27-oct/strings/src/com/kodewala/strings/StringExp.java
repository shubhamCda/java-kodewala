package com.kodewala.strings;

public class StringExp {

	public static void main(String[] args) {
		// strings and string method understanding
		String s1 = "Shubham";
		String s2 = "Shubham";
		
		System.out.println("s1==s2: "+ s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "BTM";
//		s3 = s3.concat(" Bangalore");
		String s4 = s3.concat(" Bangalore");
		
		System.out.println(s4);
	}

}
