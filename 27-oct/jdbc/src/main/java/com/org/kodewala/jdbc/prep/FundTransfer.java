package com.org.kodewala.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FundTransfer {

	public void doFundTransfer(String from, String to, int amount) {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ 27th_oct_batch", "root", "shubham359");
			
			con.setAutoCommit(false);
			
			//Balance query
			
			String balanceQuery = "select amount from balance where user_id=?";
			PreparedStatement ps = con.prepareStatement(balanceQuery);
			
			ps.setString(1, from);
			
			ResultSet rs = ps.executeQuery();
			
			int fromBalance = 0;
			
			while (rs.next()) {
				
				fromBalance = rs.getInt(1);
				
			}
			int newBalance = fromBalance - amount;
			
			
			//Debit query
			String updateQuery = "update balance set amount=? where user_id=?";
			ps = con.prepareStatement(updateQuery);
			
			ps.setInt(1, newBalance);
			ps.setString(2, from);
			
			int recordsUpdated = ps.executeUpdate();
			
			if (recordsUpdated > 0) {
				
				System.out.println(" Amount "+ amount + "has been deducted from user "+ from);
			}
			
			
			//Credit query
			
			
			ps = con.prepareStatement(balanceQuery);
			
			ps.setString(1, to);
			
			rs = ps.executeQuery();
			
			int toBalance = 0;
			
			while (rs.next()) {
				
				toBalance = rs.getInt(1);
				
			}
			newBalance = toBalance + amount;
			
			ps = con.prepareStatement(updateQuery);
			ps.setInt(1, newBalance);
			ps.setString(2, to);
			
			recordsUpdated = ps.executeUpdate();
			
			if (recordsUpdated > 0) {
				
				System.out.println(" Amount "+ amount + "has been credited to user "+ to);
			}
			
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.err.println("Exception occured: "+ e.getMessage());
			
		}
		
	}

}
