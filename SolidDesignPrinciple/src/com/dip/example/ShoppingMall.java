package com.dip.example;

public class ShoppingMall {

private BankCard bankCard;
	
	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPayment(long amount) {
		bankCard.transaction(amount);
	}
	public static void main(String[] args) {
		//BankCard bankCard = new DebitCard();
		BankCard bankCard = new CreditCard();
		ShoppingMall shoppingMall = new ShoppingMall(bankCard);
		shoppingMall.doPayment(3000);
	}

}
