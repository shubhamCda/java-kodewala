package com.kodewala.main;

import java.awt.Window.Type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.account.Account;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config = "applicationContext.xml";
		
		//Create IOC container (BeanFactory / ApplicationContext)
		
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		
		//Requesting / getting bean from the container
		
		Account account = (Account) context.getBean("acc");
		
		System.out.println("text here: "+ account.getFirstName() + " and "+ account.getLastName());
		
		

	}

}
