class OrderDetails
{
	static String orderId = "003";
	static char orderStatus = 'A';
	static String productName = "Headphones BT";
	static String customerName = "Shubham";
	static String customerAddress = "JP Nagar, Bengaluru";
	static String deliveryCaptain = "Ramji";
	
	public static void main(String[] args)
	{
		System.out.println("Zepto Order Summary:");
		System.out.println("Order Id: "+orderId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Product Name: "+productName);
		System.out.println("Customer Address: "+customerAddress);
		System.out.println("Order Status: "+orderStatus);
		System.out.println("Delivery Captain: "+deliveryCaptain);
	}
}