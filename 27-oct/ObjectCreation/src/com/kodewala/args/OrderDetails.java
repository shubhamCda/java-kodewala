package com.kodewala.args;

import java.util.Scanner;

public class OrderDetails {

	public static void main(String[] args) {
		// scanner inputs in console 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the item: ");
		String itemName = sc.next();
		
		System.out.println("Please enter the price: ");
		int price = sc.nextInt();
		
		System.out.println("Item name: "+ itemName);
		System.out.println("Price: "+ price);
		
		sc.close();
	}

}
