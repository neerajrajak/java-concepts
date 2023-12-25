package com.questions.association;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AggregationTest {

	public static void main(String[] args) {
		
		Product p1 = new Product("IPhone", 101, "Iphone 15 newly launched", 85000);
		System.out.println("*******");
		System.out.println(p1);
		Product p2 = new Product("OnePlus", 102, "One Plus 12", 65000);
		System.out.println("*******");
		System.out.println(p2);
		List <Product> products = Arrays.asList(p1,p2);
		Cart cart = new Cart();
		cart.setQuantity(2);
		cart.setProduct(products);
		double total = products.stream().collect(Collectors.summingDouble(Product::getProductPrice));
		cart.setTotalPrice(total);
		System.out.println("*******");
		System.out.println(cart);
		
		cart = null;
		
		System.out.println("*******");
		System.out.println(p1);
		
		System.out.println("*******");
		System.out.println(p2);
	}

}
