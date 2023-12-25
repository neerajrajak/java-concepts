package com.questions.association;

import java.util.List;

public class Cart {
	int quantity;
	double totalPrice;
	List<Product> product;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [quantity=" + quantity + ", totalPrice=" + totalPrice + ", product=" + product + "]";
	}

//	public Cart(int quantity, double totalPrice, List<Product> product) {
//		super();
//		this.quantity = quantity;
//		this.totalPrice = totalPrice;
//		this.product = product;
//	}

}
