package com.kodewala.createobject;

public class OrderDetails {

	int id;
	String name;
	int price;
	int qty;
	
	public OrderDetails(int id, String name, int price, int qty)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	
	public void displayOrders() {
		System.out.println("Order Id: "+ id);
		System.out.println("Item Name: "+ name);
		System.out.println("Price: "+ price);
		System.out.println("Quantity: "+qty);
		System.out.println("Final Amount: "+ price*qty);
	}
	
	public void amountWithGst() {
		System.out.println("Price (including GST): "+ ((price*qty*0.18)+price*qty));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderDetails orderDetails = new OrderDetails(101, "BT Hewadphones", 1299, 2);
		orderDetails.displayOrders();
		
		orderDetails.amountWithGst();
	}

}
