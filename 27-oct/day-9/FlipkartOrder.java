class Flipkart
{
	public double orderValue(double price)
	{
		double finalPrice;
		double discount = 0.10;
		
		if(price > 1000)
		{
			double discountedPrice = price * discount;
			finalPrice = price - discountedPrice;
			if(price * discount <= 500)
			{
				return finalPrice;
			}else
			{
				return price - 500;
			}
						
		}
		
		
		return price;
		
	}

	public static void main(String[] args)
	{
		Flipkart flipkart = new Flipkart();
		
		double result1 = flipkart.orderValue(1200);
		
		double result2 = flipkart.orderValue(500);
		
		double result3 = flipkart.orderValue(6000);
		
		System.out.println("Result-1: "+result1);
		
		System.out.println("Result-2: "+result2);
		
		System.out.println("Result-3: "+result3);


	}
}