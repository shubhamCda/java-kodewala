package com.kodewala.poly.override;

class Banking
{
	String firstName;
	String lastName;
	
	Banking(String _firstName, String _lastName)
	{
		this.firstName = _firstName;
		this.lastName = _lastName;
	}
	
	@Override
	public boolean equals(Object ob)
	{
		Banking c2 = (Banking) ob;
		return this.firstName.equals(c2.firstName) && this.lastName.equals(c2.lastName);
	}
	
}
class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banking c1 = new Banking("shubh", "bodalkar");
		Banking c2 = new Banking("shubham", "bodalkar");
		
		System.out.println(".equals: " + c1.equals(c2));

	}

}
