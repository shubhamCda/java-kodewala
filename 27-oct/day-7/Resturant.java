class Resturant
{
	static String customerName = "Shubham";
	public static String dish = "Dosa";
	private static int price = 199;
	
	public static void main(String[] args)
	{
		System.out.println("Price: "+price);
	}
}

class Order
{
	public static void main(String[] args)
	{
		System.out.println("Customer Name: "+Resturant.customerName);
		System.out.println("Today's Dish: "+Resturant.dish);
		//System.out.println("Price: "+price);
	}
}
	