package com.kodewala.poly;


class NetBanking
{
	public void doNetBanking() {
		System.out.println("I am doing core banking....");
	}
}

class  HDFCNetBanking extends NetBanking
{
	@Override
	public void doNetBanking() {
		System.out.println("i am doing net banking from HDFC bank");
		
	}
}
public class Driver {

	public static void main(String[] args) {
		// upcasting and downcasting
		
		HDFCNetBanking nb = new HDFCNetBanking();
		
		nb.doNetBanking(); // Compile time -->it will check the doNetBanking();
						   // is available in HDFCNetBanking() or not.
		//Runtime--> it will call the method on actual object(HDFCNetBanking).
		
		
		HDFCNetBanking nb1 = new HDFCNetBanking(); //superclass can refer child class
		
		NetBanking nb2 = new HDFCNetBanking();
		nb2.doNetBanking(); //compile time--> it will check the doNetBanking();
		//is availbale in NetBanking or not.
		//Runtime --> it will call the method on actual object(HDFCNetBanking);
		
		HDFCNetBanking nb3 = (HDFCNetBanking) nb2; //Downcasting is ONLY valid when the object was originally a child
		
//		nb3.doNetBanking();
		

	}

}
