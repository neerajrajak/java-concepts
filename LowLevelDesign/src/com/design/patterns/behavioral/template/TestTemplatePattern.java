package com.design.patterns.behavioral.template;

public class TestTemplatePattern {

	public static void main(String[] args) {
		
		PaymentTemplate payToAccount = new PayToAccount();
		
		PaymentTemplate payToMerchant = new PayToMerchant();
		
		System.out.println("############################");
		System.out.println();
		payToAccount.sendMoney();
		
		System.out.println();
		System.out.println("############################");
		System.out.println();
		payToMerchant.sendMoney();

	}

}
