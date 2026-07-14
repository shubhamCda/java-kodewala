package com.kodewala.encap;

class Order
{
	private int orderId;
	private String itemName;
	
	//reading
	public int getOrderId() {
		return orderId;
	}

	//setting the value
	public void setOrderId(int orderId) {
		if(orderId > 0) {
			this.orderId = orderId;
		}
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
}
public class Driver {
	
		
	public static void main(String[] args) {
		// Encapsulation
		
		Order order = new Order();
		
		//modifying the value
		order.setOrderId(1233);
		
		//reading the value
		System.out.println(order.getOrderId());
		
	}

}
