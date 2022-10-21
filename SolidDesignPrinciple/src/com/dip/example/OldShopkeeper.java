package com.dip.example;

public class OldShopkeeper {

	private DebitCard debitCard;
	
	public OldShopkeeper(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	
	public void doPayment(long amount) {
		debitCard.transaction(amount);
	}
	
	public static void main(String[] args) {
		DebitCard debitCard = new DebitCard();
		OldShopkeeper oldShopkeeper = new OldShopkeeper(debitCard);
		oldShopkeeper.doPayment(2000);
	}
}
