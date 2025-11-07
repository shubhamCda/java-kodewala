/*
develop appln to display customers order details:
-order id
-item name
-order qty
-item price
-GST
-final price
*/

class OrderDetails
{
	static float gstRate = 1.8f;
	int orderId = 1234;
	String itemName = "BT Headphones";
	public float placeOrder()
	{
		
		int price = 1299;
		int orderQty = 3;
		int finalPrice = price*orderQty;
		
		return finalPrice;
	}
	
	public static void main(String[] args)
	{
		OrderDetails orderDetails = new OrderDetails();
		
		float result = orderDetails.gstRate * orderDetails.placeOrder();
		System.out.println("Order Id: "+orderDetails.orderId);
		System.out.println("Item Name: "+orderDetails.itemName);
		System.out.println("Price: "+1299);
		System.out.println("Final Amount: "+result);
	}
}
		
		