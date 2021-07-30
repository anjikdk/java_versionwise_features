package com.java.version.java8.streams;

public class Item {

	private String itemName;
	private Double cost;
	private String manufacturer;
	
	public Item(String itemName, Double cost, String manufacturer) {
		super();
		this.itemName = itemName;
		this.cost = cost;
		this.manufacturer = manufacturer;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", cost=" + cost + ", manufacturer=" + manufacturer + "]";
	}
}
