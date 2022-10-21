package com.dip.example;

public class CreditCard implements BankCard {

	public void transaction(long amount) {
		System.out.println("Deducted using credit card");
	}
}
