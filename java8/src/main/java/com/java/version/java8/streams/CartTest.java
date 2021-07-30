package com.java.version.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CartTest {
	
	public static void main(String[] args) {
		
		CartTest cart = new CartTest();
		
		List<Cart> carts = cart.getCartDetails();
		System.out.println(cart.getLenovoManufacturerItems(carts));
		System.out.println(cart.getLenovoCost(carts));
		System.out.println(cart.getDistinctManufacturerNames(carts));
		System.out.println(cart.getTotalCost(carts));
		System.out.println(cart.getCostByManufacturer(carts, "Lenovo"));
		System.out.println(cart.getItems(carts));
		System.out.println(cart.sortBasedOnManufacturer(carts));
	}

	public List<Cart> getCartDetails()
	{
		Item item1 = new Item("Phone", 20000.0, "LG");
		Item item2 = new Item("Phone", 20000.0, "Lenovo");
		List<Item> items1 = Arrays.asList(item1, item2);
		Cart c1 = new Cart("Cart1", items1);
		
		Item item3 = new Item("Phone", 20000.0, "Apple");
		Item item4 = new Item("Phone", 10000.0, "Lenovo");
		List<Item> items2 = Arrays.asList(item3, item4);
		Cart c2 = new Cart("Cart2", items2);
		
		List<Cart> carts = new ArrayList<Cart>();
		carts.add(c1);
		carts.add(c2);
		
		return carts;
	}
	
	public List<Item> getLenovoManufacturerItems(List<Cart> carts)
	{
		return carts.stream().map(c -> c.getItems()).flatMap(List::stream)
				.filter(i -> i.getManufacturer().equals("Lenovo"))
				.collect(Collectors.toList());
	}
	
	public Double getLenovoCost(List<Cart> carts)
	{
		return carts.stream().map(c -> c.getItems()).flatMap(List::stream)
			.filter(i -> i.getManufacturer().equals("Lenovo"))
			.map(a -> a.getCost())
			.reduce((double) 0, (a, b) -> a+b);
	}
	
	public List<String> getDistinctManufacturerNames(List<Cart> carts)
	{
		return carts.stream().map(c -> c.getItems())
				.flatMap(List::stream)
				.map(i -> i.getManufacturer()).distinct()
				.collect(Collectors.toList());
	}
	
	public Double getTotalCost(List<Cart> carts)
	{
		return carts.stream().map(c -> c.getItems())
				.flatMap(List::stream)
				.map(m -> m.getCost())
				.reduce((double)0, (a, b) -> a+b);
	}
	
	public Double getCostByManufacturer(List<Cart> carts, String manufacturer)
	{
		return carts.stream().map(c -> c.getItems()).flatMap(List::stream)
			.filter(i -> i.getManufacturer().equals(manufacturer))
			.map(a -> a.getCost())
			.reduce((double) 0, (a, b) -> a+b);
	}
	
	public List<Item> getItems(List<Cart> carts)
	{
		return carts.stream().map(c -> c.getItems())
				.flatMap(List::stream)
				.collect(Collectors.toList());
	}
	
	public List<Item> sortBasedOnManufacturer(List<Cart> carts)
	{
		return carts.stream().map(c -> c.getItems())
				.flatMap(List::stream)
				.sorted(Comparator.comparing(Item::getManufacturer))
				.collect(Collectors.toList());
	}
}
