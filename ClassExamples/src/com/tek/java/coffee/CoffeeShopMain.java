package com.tek.java.coffee;

import java.util.Scanner;

public class CoffeeShopMain {

	public static void main(String[] args) {
		CoffeeShop cs = new CoffeeShop();
		cs.initialize();
		
		while(true) {
			int select = cs.menuPrompt();
			
			if (select == CoffeeShop.PRINT_MENU) {
				cs.printMenuItems();
			}else if(select == CoffeeShop.EXIT) {
				//this is how to tell the JVM to exit/quit with a status of success
				//exit without error or error code
				System.out.println("Thank you please come again.");
				cs.close();
				System.exit(0);
			}else if(select == CoffeeShop.ORDER_ITEM) {
				cs.orderItem();
			}else if(select == CoffeeShop.VIEW_CART) {
				cs.printCart();
			}
		}
	}
}
