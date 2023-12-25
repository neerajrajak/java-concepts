package com.questions.association;

public class CompositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("IPhone", 101, "Iphone 15 newly launched", 85000);
		System.out.println("*******");
		System.out.println(p1);
		Product p2 = new Product("OnePlus", 102, "One Plus 12", 65000);
		System.out.println("*******");
		System.out.println(p2);
		
		PaymentTracker pt = new PaymentTracker(p1);
		PaymentTracker pt2 = new PaymentTracker(p2);
		pt = null;
		PaymentDetail pd = pt.getPaymentDetail();
		
		System.out.println(pd.getStatus());

	}

}
