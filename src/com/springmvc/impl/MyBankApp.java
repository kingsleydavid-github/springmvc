package com.springmvc.impl;

import com.springmvc.servicemodels.Account;

import com.springmvc.model.SavingsAccount;

public class MyBankApp {
	
	public static void main(String[] args)
	{
		Account acc = new SavingsAccount();
		// acc = new CurrentAccount();
		System.out.println(acc.createAccount());
	}
}
