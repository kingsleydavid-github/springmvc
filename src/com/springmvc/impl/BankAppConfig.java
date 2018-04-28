package com.springmvc.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.springmvc.model.ATMCard;
import com.springmvc.model.SavingsAccount;

public class BankAppConfig {

	@Bean
	public ATMCard atmCard()
	{
		return new ATMCard();
	}
	
	@Bean
	@Scope("prototype")
	public SavingsAccount savingsAccount()
	{
		return new SavingsAccount();
	}
	
}
