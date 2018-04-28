package com.springmvc.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.servicemodels.Account;
import com.springmvc.servicemodels.Card;

public class SavingsAccount implements Account{
	
	@Autowired
	private Card atmCard;
	
	public void setAtmCard(Card atmCard) {
		this.atmCard = atmCard;
	}

	@Override
	public String createAccount()
	{
		return "Savings account created successfully.";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return this.atmCard.cardDetails();
	}
}
