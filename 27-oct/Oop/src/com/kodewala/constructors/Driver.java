package com.kodewala.constructors;


class Database
{
	String dbName, user, password;
	
	Database()
	{
		this("mydb", "root", "123");
	}
	
	Database(String dbName, String user, String password)
	{
		this.dbName = dbName;
		this.user = user;
		this.password = password;
		connect();
		
	}
	
	public void connect() {
		System.out.println("Database connected: DB name: "+ dbName + " User: "+ user);
	}
}

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Database db1 = new Database();
		
		Database db2 = new Database("myDBnew", "shu", "1234");
	}

}
