class Banking
{
	static int myBalance = 1000;
	static int friendsBalance = 300;
	
	public static void main(String[] args)
	{
		int transferAmount = 300;
		myBalance = myBalance - transferAmount;
		friendsBalance = friendsBalance + transferAmount;
		
		System.out.println("My balance(amount): "+myBalance);
		System.out.println("Friends Balance(amount): "+friendsBalance);
		
	}
}

