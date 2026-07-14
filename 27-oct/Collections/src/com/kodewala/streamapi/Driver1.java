package com.kodewala.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> cities = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			cities.add(i);
		}
		
		List<Integer> cityStream = cities.stream()
									 .map(e -> e*3)
									 .filter(n -> n > 6)
									 .collect(Collectors.toList());
		
		System.out.println("List result: "+ cityStream);
	}

}
