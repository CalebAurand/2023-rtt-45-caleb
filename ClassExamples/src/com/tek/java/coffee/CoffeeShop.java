package com.tek.java.coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
	private final double SALES_TAX = 0.08;
	public static final int PRINT_MENU = 1;
	public static final int ORDER_ITEM = 2;
	public static final int VIEW_CART = 3;
	public static final int EXIT = 4;
	//this is also a member variable that is private to this class
	//can only be accessed from within the coffeeshop class
	private List<MenuItem> menuItems = new ArrayList<>();
	
	private List<MenuItem> cart = new ArrayList<>();
	
	//all member variables are defined at the top of the file
	Scanner scanner = new Scanner(System.in);
	
	public void initialize() {
		//creating an object of MenuItem class/dataType
		MenuItem item1 = new MenuItem();
		//setting name and price fields for item1
		item1.setName("Small Coffee");
		item1.setPrice(2.50);
		item1.setQuantityInStock(800);
		
		menuItems.add(item1);
		
		MenuItem item2 = new MenuItem();
		item2.setName("Large Coffee");
		item2.setPrice(3.50);
		item2.setQuantityInStock(600);

		
		menuItems.add(item2);
		
		MenuItem item3 = new MenuItem();
		item3.setName("Rasp Danish");
		item3.setPrice(6.99);
		menuItems.add(item3);
		item3.setQuantityInStock(45);

		
		MenuItem item4 = new MenuItem();
		item4.setName("Star Cult Mug");
		item4.setPrice(19.99);
		menuItems.add(item4);
		item4.setQuantityInStock(30);

		
		//same as above but we are doing it in 1 line of code
		menuItems.add(new MenuItem("Egg Sandwich", 14.30, 30));
	}
	
	public void printMenuItems() {
		System.out.println("Item Name " + "\t\t\t" + "Price " + "\t\t" + "# In Stock");
		System.out.println("------------\t\t-------\t\t----------");
		for(MenuItem item : menuItems) {
			System.out.println(item.getName() + "\t\t" + formatPrice(item.getPrice()) + "\t\t" + item.getQuantityInStock());
		}
		System.out.println("------------\t\t-------\t\t----------");
		System.out.println("");
	}
	
	public int menuPrompt() {
		
		System.out.println("Welcome to Caleb's Coffee Shop");
//		if(cart.size() > 0) printCart(); >>> put this one here myself
		
		System.out.println(PRINT_MENU + ") Print Menu");
		System.out.println(ORDER_ITEM + ") Order Item");
		System.out.println(VIEW_CART + ") View Cart");
		System.out.println(EXIT + ") Exit Coffee Shop");
		System.out.print("\nMake selection: ");
		
		int selection = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("");
				
		return selection;
	}
	
	public void orderItem() {
		printMenuItems();
		System.out.print("\nWhich item do you want? : ");
		String itemName = scanner.nextLine();
		
		MenuItem selectedItem = findMenuItemByItemName(itemName);
		if(selectedItem != null) {
			System.out.println(selectedItem.getName() + " added to your cart.\n");
			cart.add(selectedItem);
		}else {
			System.out.println(itemName + " is not a valid selection");			
		}
	}
	
	// in this function the arg itemName represents the user input
	//this is a very common pattern in software engineering - every day used
	//if the method returns null then the itemName was not found
	//if the method returns a menu item then the itemName was found
	private MenuItem findMenuItemByItemName (String itemName) {
		//if the incoming itemName string is not instantiated (null)
		// then it can never be equal to a menu item.
		if(itemName == null) {
			return null;
		}
		
		//trim white space from users input
		itemName = itemName.trim();
		
		for (MenuItem menuItem : menuItems) {
			//the menuItem.getName function returns a string
			// the string object contains a method called equalsIgnoreCase()
			if(menuItem.getName().equalsIgnoreCase(itemName)) {
				return menuItem;
			}
		}
		
		
		//we got here without a match, so we know we did not find
		//the itemName in the list of menuItems
		return null;
	}
	
	public void printCart() {
		double tax = 0.00;
		double subTotal = 0.00;
		double total = 0.00;
		
		System.out.println(cart.size() + " items in your cart:\n");
		System.out.println("Item Name " + "\t\t" + "Price " + "\t\t");
		System.out.println("------------\t\t-------");
		
		for(MenuItem menuItem : cart) {	
			System.out.println(menuItem.getName() + "\t\t" + formatPrice(menuItem.getPrice()));
			subTotal += menuItem.getPrice();
		}
		tax = subTotal * SALES_TAX;
		total = subTotal + tax;
		
		System.out.println("------------\t\t-------");
		System.out.println("Sales Tax \t\t" + formatPrice(tax));
		System.out.println("Total Price \t\t" + formatPrice(total));
		System.out.println("");
	}
	
	private String formatPrice( double price ) {
		DecimalFormat df = new DecimalFormat("$###.00");
		String formattedPrice = df.format(price);
		
		return formattedPrice;
	}
	
	public void close() {
		scanner.close();
	}
}
