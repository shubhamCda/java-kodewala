package com.kodewala.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problems {

	public static void main(String[] args) {
		// streamApi() problems
		
		String name = "shubham";
		//o/p -> S
		//       h
		//   ....m
		
		Stream<Character> res = name.chars().mapToObj(ch -> (char)ch);
		
		res.forEach(ch -> System.out.println(ch));
		
		//find the frequency
		
		Map<Character, Long> freq = name.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println("freq: "+ freq);
		

	}

}
