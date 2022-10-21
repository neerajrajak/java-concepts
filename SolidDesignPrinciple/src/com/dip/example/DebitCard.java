package com.dip.example;

public class DebitCard implements BankCard {

	public void transaction(long amount) {
		System.out.println("Deducted using debit card");
	}
}
