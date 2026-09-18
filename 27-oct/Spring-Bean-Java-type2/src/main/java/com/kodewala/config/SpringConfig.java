package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.details.ProfileDetails;

@Configuration
public class SpringConfig {

	@Bean
	public ProfileDetails createProfile()
	{
		ProfileDetails profileDetails = new ProfileDetails();
		profileDetails.setName("shubham");
		profileDetails.setAddress("Bengaluru");
		
		return profileDetails;
	}
}
