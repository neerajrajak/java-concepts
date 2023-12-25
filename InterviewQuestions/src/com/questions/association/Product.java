package com.questions.association;

public class Product {
	private String productName;
	private int productId;
	private String productDescription;
	private double productPrice;

	public String getProductName() {
		return productName;
	}

	public Product(String productName, int productId, String productDescription, double productPrice) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + "]";
	}
}
