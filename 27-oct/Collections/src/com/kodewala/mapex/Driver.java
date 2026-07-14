package com.kodewala.mapex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		
		List<String> inputs = Arrays.asList("i", "am", "from", "nagpur");
		
		List<String> output = inputs.stream().map(w -> w.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(output);
		
		List<Integer> lengthOp = inputs.stream().map(w -> w.length()).collect(Collectors.toList());
		
		System.out.println(lengthOp);
		
		List<String> upperCaseElement = inputs.stream().filter(w -> w.length() > 5).map(w -> w.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("upperCaseElement: "+ upperCaseElement);
		
		//No duplicate
		List<Integer> nums = Arrays.asList(1,1,1,3,2,3,2,4,8,21,3);
		
		Set<Integer> noDuplicate = new HashSet<>();
		
		List<Integer> result = nums.stream().filter(i -> noDuplicate.add(i)).toList();
		
		System.out.println(result);
		
		//nested array question using flatmap
		List<List<String>> info = Arrays.asList(Arrays.asList("hello", "I"),Arrays.asList("am", "from"),Arrays.asList("Nagpur", "Maharashtra") );

		List<String> data = info.stream().flatMap(w -> w.stream()).collect(Collectors.toList());
		
		System.out.println(data);
	}

}
