package com.org.kodewala.JDBC_Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author shubh
 * 
 * Application to read the customer data from given csv file 
 *
 */
public class App 
{
    public static void main( String[] args ) throws  SQLException
    {
        try(Stream<String> data = Files.lines(Paths.get("D:\\JAVA\\Kodewala\\27-oct\\CustomerRecord.csv"))) {
        	
        	//load jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/27th_oct_batch", "root", "shubham359");
			
			String validQuery = "insert into customer_valid_data( customer_id,first_name, last_name, email ) values(?, ?, ?, ?)";
			
			String invalidQuery = "insert into customer_invalid_data( customer_id,first_name, last_name, email ) values(?, ?, ?, ?)";

			
			PreparedStatement psValid = con.prepareStatement(validQuery);
			
			PreparedStatement psInvalid = con.prepareStatement(invalidQuery);

			
			
        	
        		data.skip(1).forEach(line -> {
        			String[] info = line.split(",");
        			
        			int id = Integer.parseInt(info[0].substring(1));
        			String firstName = info[1];
        			String lastName = info[2];
        			String emailId = info[5];
        			
        			try {
        				if (isInvalid(firstName) || isInvalid(lastName) || isInvalid(emailId)) {
        					psInvalid.setInt(1, id);
        					psInvalid.setString(2, firstName);
        					psInvalid.setString(3, lastName);
        					psInvalid.setString(4, emailId);
        					
        					int invalidRes = psInvalid.executeUpdate();
    						
    						System.out.println(invalidRes + " Data Updated...invalidRes");
        					
						}else {
							psValid.setInt(1, id);
	        				    psValid.setString(2, firstName);
							psValid.setString(3, lastName);
							psValid.setString(4, emailId);
							
							int validRes = psValid.executeUpdate();
							
							System.out.println(validRes + " Data Updated...validRes");
							
						}
        				
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        			
//        			System.out.println("first Name: "+id);
        			
//        			System.out.println(info[0] + " | "+ info[1]+ " | "+ info[2]+" | "+ info[5]);
        		
        		});
			
		} catch (IOException | SQLException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
    
    static boolean isInvalid(String value)
    {
    		return value == null || value.trim().isEmpty();
    }
}
