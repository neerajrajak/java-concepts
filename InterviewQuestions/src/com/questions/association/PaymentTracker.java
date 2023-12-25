package com.questions.association;

public class PaymentTracker {
	private PaymentDetail paymentDetail;
	
	public PaymentDetail getPaymentDetail() {
		return paymentDetail;
	}

	public PaymentTracker(Product product) {
		this.paymentDetail = new PaymentDetail();
		paymentDetail.setProductId(product.getProductId());
		paymentDetail.setPaymentMode("UPI");
		paymentDetail.setStatus("Paid");
		paymentDetail.setTrackerId(11002);
	}
}
