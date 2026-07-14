package com.kodewala.set;

import java.util.HashMap;
import java.util.Map;

public class SetAndMap {

	public static void main(String[] args) {

		//unordered
		//unique keys, values can be duplicate
		//How does hashmap works internally?
		//put() & get() works internally?
		
		Map<String, String> states = new HashMap<String, String>();
		
		states.put("KA", "BLR");
		states.put("TN", "CH");
		states.put("TS", "HYD");
		states.put("MH", "MUB");
		states.put("MH", "BOB");
		
		System.out.println("States:: "+ states);
		System.out.println(states.get("MH"));
		
		
		
	}

}
