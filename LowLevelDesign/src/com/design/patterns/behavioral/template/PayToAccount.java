package com.design.patterns.behavioral.template;

public class PayToAccount extends PaymentTemplate {

	@Override
	public void validateRequest() {
		System.out.println("PayToAccount :: validateRequest logic");
	}

	@Override
	public void debitFromAccount() {
		System.out.println("PayToAccount :: debitFromAccount logic");
	}

	@Override
	public void calculatePlatformFees() {
		System.out.println("PayToAccount :: calculatePlatformFees logic");
	}

	@Override
	public void creditToAccount() {
		System.out.println("PayToAccount :: creditToAccount logic");
	}

}
