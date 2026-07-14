package com.kodewala.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		// Serialization and deserialization
		
		Account account = new Account("shubha", 1000, "UBI123");
		
		try {
			//Serialization
			FileOutputStream fos = new FileOutputStream("account.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(account); //writing the account object of file(account.ser)
			
			
			//De-serialization			
			FileInputStream fis = new FileInputStream("account.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Account accSer = (Account) ois.readObject();
			
			System.out.println(accSer.amount + " "+ accSer.bankCode);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
