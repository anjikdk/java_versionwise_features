package com.java.version.java8.streams;

import java.util.List;

public class Cart {

	private String cartName;
	private List<Item> items;

	public Cart(String cartName, List<Item> items) {
		super();
		this.cartName = cartName;
		this.items = items;
	}
	
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
