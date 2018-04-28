package com.springmvc.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.servicemodels.Account;

public class MyBankApp {
	
	private static final String APPLICATIONCONTEXT_XML_FILENAME = "applicationcontext.xml";

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(APPLICATIONCONTEXT_XML_FILENAME);
		Account acc = context.getBean("mySavingsAccount", Account.class);
		System.out.println(acc.createAccount());
	}
}
