package com.org.kodewala.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Application {

	public static void main(String[] args) throws SQLException {
		try {
			//load jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ 27th_oct_batch", "root", "shubham359");
			
			//create query
			String sql = "insert into user_info(user_name, user_id, status) values(?, ?, ?)";
			
			//create statement
			PreparedStatement ps = con.prepareStatement(sql);
			
			for (int i = 0; i < 10; i++) {
				ps.setString(1, "name"+i);
				ps.setString(2, "xx@89"+i);
				ps.setString(3, "CREATED");
				
				//for the count of data updated
//				int result = ps.executeUpdate();
				
				//false   if the first result is an update count or there is no result
				boolean result = ps.execute();
				
				System.out.println("Result: "+ result);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
