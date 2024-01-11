package com.design.patterns.behavioral.template;

public class PayToMerchant extends PaymentTemplate {

	@Override
	public void validateRequest() {
		System.out.println("PayToMerchant :: validateRequest logic");
	}

	@Override
	public void debitFromAccount() {
		System.out.println("PayToMerchant :: debitFromAccount logic");
	}

	@Override
	public void calculatePlatformFees() {
		System.out.println("PayToMerchant :: calculatePlatformFees logic");
	}

	@Override
	public void creditToAccount() {
		System.out.println("PayToMerchant :: creditToAccount logic");
	}
}
