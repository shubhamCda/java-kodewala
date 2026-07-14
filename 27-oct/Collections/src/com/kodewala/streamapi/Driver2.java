package com.kodewala.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,3,5),Arrays.asList(2,4,6), Arrays.asList(1,5,6));
		
		
		
		Set<Integer> uniqueSet = new HashSet<>();
		
		List<Integer> uniqueNumbers = numbers.stream().flatMap(num -> num.stream().filter(item -> !uniqueSet.add(item))).collect(Collectors.toList()); 
		
		System.out.println("Unique: "+ uniqueNumbers);
		
		
		List<Integer> nums = Arrays.asList(22,4343, 4342,121, 958, 44, 4343, 445, 78, 212, 121);
		
		List<Integer> distinctNums = nums.stream().distinct().collect(Collectors.toList());
		
		List<Integer> sortedNums = distinctNums.stream().sorted((a,b) -> b-a).collect(Collectors.toList());
		
		System.out.println("Sorted: "+ sortedNums);
		
		//to find highest number
		int highestNums = sortedNums.stream().findFirst().get();
		
		System.out.println("Highest num: "+ highestNums);
		
		//to find 2nd/3rd highest
		int secHigh = sortedNums.stream().skip(2).findFirst().get();
		System.out.println("Lowest num: "+ secHigh);
		
		
		List<Integer> revSort = distinctNums.stream().sorted((a,b) -> a-b).toList();
		System.out.println(revSort);
		
		//get the lowest num
		int lowestNum = revSort.stream().findFirst().get();
		System.out.println(lowestNum);
		
		Integer finalSolution = nums.stream().distinct().sorted((a,b) -> b-a).findFirst().get();
		System.out.println("finalSolution: "+finalSolution);
		
		//Group By
		
		List<String> list = List.of("Dog", "Cat", "Lion", "Tiger", "Elephant", "Horse","Red", "Blue", "Green", "Yellow", "Black", "White");
		
		Map<Integer, List<String>> sol = list.stream().collect(Collectors.groupingBy(words -> words.length()));
		
		System.out.println("Solution: "+ sol);
		
		List<String> moreThan4 = list.stream().filter(w -> w.length() > 4).toList();
		
		System.out.println("Word length > 4n: "+ moreThan4);
		
		String sampleString = "SWISS";
		
		Character nonRepeating = sampleString.chars().mapToObj(ch -> (char)ch).filter(ch -> sampleString.lastIndexOf(ch) == sampleString.indexOf(ch)).findFirst().get();
		
		
		System.out.println(nonRepeating);
		
		List<String> stringByLength = list.stream().sorted((a,b) -> a.length() - b.length()).toList();
		
		System.out.println("stringByLength: "+stringByLength);
		
		String longestString = list.stream().sorted((a,b) -> b.length() - a.length()).findFirst().get();
		System.out.println("longestString: "+longestString);
	}


}
