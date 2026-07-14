package com.kodewala.hash.linkedhashset;

import java.util.LinkedHashSet;

public class LinkeddHashSetExp {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("BLR");
		linkedHashSet.add("NGP");
		linkedHashSet.add("GD");
		linkedHashSet.add("CD");
		linkedHashSet.add("MUB");
		linkedHashSet.add("BLR");
		linkedHashSet.add("BLR");
		
		
		System.out.println("LLHashSet:: "+ linkedHashSet);
		
	}
}
