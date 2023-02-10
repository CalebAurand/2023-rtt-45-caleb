package com.tek.java.coffee;

//this class is a POJO - Plain Old Java Object
//this class can also be referred to as a bean - or entity
public class MenuItem {
	//these private variables are called member variables
	//because they are defined at the class level
	//meaning they are available to the entire class, not just one method code block
	private String name = null;
	private double price = 0.00;
	private int quantityInStock = 0;
	
	//the constructor does not have a return type
	//by default all objects have a constructor, with empty arguments constructor(){...}
	public MenuItem() {
		
	}
	
	//this constructor takes in 2 parameters that will populated the member
	//variables. This constructor needs to be able to tell the difference
	//between the argument passed and the member variable of the class itself
	//by using this. It specifies the member variable of
	//this refers to the instance of this class that is created
	public MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public MenuItem(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantityInStock = quantity;
	}
	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
	
	public void setQuantityInStock(int quantity) {
		this.quantityInStock = quantity;
	}
}
