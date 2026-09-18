package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.AccountInfo;

@Configuration //this class is responsible for bean definition
public class SpringConfig {
	
	@Bean // @Bean("acc1") also we can use this id to get the data otherwise use context.getBean("createAccount");
	public AccountInfo createAccount() {
		AccountInfo accountInfo = new AccountInfo();
		accountInfo.setAccountType("CURRENT");
		accountInfo.setName("Shubham");
		
		return accountInfo;
		
	}
	
}
