package com.springmvc.model;

import com.springmvc.servicemodels.Account;

public class CurrentAcccount implements Account {

	@Override
	public String createAccount() {
		return "Current account created successfully";
	}

}
