package com.kodewala.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.SpringConfig;
import com.kodewala.details.ProfileDetails;

class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		ProfileDetails profileDetails = (ProfileDetails) context.getBean("createProfile");
		
		System.out.println("Profile Details: "+ profileDetails.getName() + " and " + profileDetails.getAddress());
	}
}
