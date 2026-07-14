package com.org.kodewala.jdbc.prep;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundTransfer ft = new FundTransfer();
		
		try {
			ft.doFundTransfer("sashu97", "shubham93",  250);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
