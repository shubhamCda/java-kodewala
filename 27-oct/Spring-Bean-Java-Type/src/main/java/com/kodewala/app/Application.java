package com.kodewala.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kodewala.AccountInfo;
import com.kodewala.config.SpringConfig;

class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AccountInfo accountInfo = (AccountInfo) context.getBean("createAccount"); //you can also use bean ID which is specified in springConfig method
		
		System.out.println("Details: "+ accountInfo.getName() + " and " + accountInfo.getAccountType());
		
		((AbstractApplicationContext) context).close();

	}

}
