package com.springmvc.model;

import com.springmvc.servicemodels.Account;

public class SavingsAccount implements Account{
	
	@Override
	public String createAccount()
	{
		return "Savings account created successfully.";
	}
}
