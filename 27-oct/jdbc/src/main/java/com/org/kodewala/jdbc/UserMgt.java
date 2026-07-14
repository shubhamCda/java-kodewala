package com.org.kodewala.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class UserMgt 
{
    public static void main( String[] args )
    {
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ 27th_oct_batch", "root", "shubham359");
		
		Statement stmt = con.createStatement();
		String query = "select * from user_info";
		ResultSet rs = stmt.executeQuery(query);
		System.out.println(rs);
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String userName = rs.getString(2);
			String userID = rs.getString(3);
			String status = rs.getString(4);
			
			System.out.println("Id: "+ userID);
			System.out.println("Name:  "+ userName);
			System.out.println("Status: "+ status);
		
			
		}
	   } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
    }
}
