package com.kodewala.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		// StreamApi using collection
		
		List<String> words = new ArrayList<String>();
		
		words.add("Ashu");
		words.add("shubh");
		words.add("Amit");
		words.add("AShok");
		words.add("Praveen");
		
		//convert the collection to stream object
		Stream<String> stream = words.stream();
		
		//filter (intermediate op) starting with "A"
		Stream<String> filteredStream = stream.filter(w -> w.startsWith("A"));
		
		//convert the filtered data to uppercase
		Stream<String> upperCaseStream = filteredStream.map(w -> w.toUpperCase());
		
		//collect the data terminal operation -> will terminate the stream
		List<String> result1 = upperCaseStream.collect(Collectors.toList());
		
		System.out.println("Result: "+ result1);
		
		List<String> res = words.stream()
				           .filter(w -> w.startsWith("A"))
				           .map(w -> w.toUpperCase())
				           .collect(Collectors.toList());
			
		System.out.println("Result 2: "+ res);
		
		
		String s = null;
		
		if (s.equals("shubh")) {
			
		}
		if ("shubh".equals(s)) {
			
		}
	}

}
