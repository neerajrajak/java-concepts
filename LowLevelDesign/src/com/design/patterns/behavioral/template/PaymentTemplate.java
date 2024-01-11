package com.design.patterns.behavioral.template;

public abstract class PaymentTemplate {

	public abstract void validateRequest();
	
	public abstract void debitFromAccount();
	
	public abstract void calculatePlatformFees();
	
	public abstract void creditToAccount();
	
	
	/**
	 * This is template methods which decides the rules to be followed while sending money to different sources
	 */
	public final void sendMoney() {
		
		// step 1
		validateRequest();
		
		// step 2
		debitFromAccount();
		
		// step 3
		calculatePlatformFees();
		
		// step 4
		creditToAccount();
	}
}
