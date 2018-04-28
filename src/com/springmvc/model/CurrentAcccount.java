package com.springmvc.model;

import com.springmvc.servicemodels.Account;
import com.springmvc.servicemodels.Card;

public class CurrentAcccount implements Account {

	private Card atmCard;
	
	public void setAtmCard(Card atmCard) {
		this.atmCard = atmCard;
	}
	
	@Override
	public String createAccount() {
		return "Current account created successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return this.atmCard.cardDetails();
	}

}
