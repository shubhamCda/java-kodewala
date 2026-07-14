package com.kodewala.list.hash;

import java.util.HashSet;

public class HashSetExp {

	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<String>();
		
		//jVM returns same hashcodes for two different objects --> Hash collision
		
		cities.add("BLR");
		cities.add("DL");
		cities.add("MUB");
		cities.add("AUR");
		cities.add("JP");
		cities.add(null);		
		cities.add("BLR");
		cities.add("RP");
		
		System.out.println("Cities:: " +cities);
		
	}
}
