package com.springmvc.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springmvc.servicemodels.Account;

public class BankAppUsingAnnotations {

	private static ApplicationContext appContext;
	
	public static void main(String[] args) {
		
		appContext = new AnnotationConfigApplicationContext(BankAppConfig.class);
		Account acc = appContext.getBean("savingsAccount", Account.class);
		
		System.out.println(acc.createAccount());
		System.out.println(acc.cardDetails());
	}

}
