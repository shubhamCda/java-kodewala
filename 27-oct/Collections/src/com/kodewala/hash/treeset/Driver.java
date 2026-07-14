package com.kodewala.hash.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> ts = new TreeSet<Integer>();
		
		ts.add(12);
		ts.add(87);
		ts.add(3);
		ts.add(51);
		ts.add(2);
		
		Iterator<Integer> it = ts.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
