package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Homework1 {
	/* Make this in a new Homework1 class
	 * I want to see a list of all customers that have made a payment larger than amount
	 * Print the checkNumber, amount formated to $#.00 ), and the customer name
	 * ordered by the largest amount first
	 * input variable for the scanner are 1) the amount and 2) 2 digit state code*/
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "password";
		System.out.println("-------- MySQL JDBC Aggregate Payments ------------");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter an amount : ");
			int amount = scan.nextInt();
			scan.nextLine();
			System.out.print("Enter a state : ");
			String st = scan.nextLine();
			scan.close();
			
			Connection connection =  DriverManager.getConnection(dburl, user, password);
			
			String sql = "select c.customerName as Customer, p.checkNumber as CheckNumber, p.amount as Amount, c.state as State "
					+ "from customers c, payments p "
					+ "where c.customerNumber = p.customerNumber "
					+ "and p.amount > ? and c.state = ? "
					+ "order by p.amount desc";
			
			PreparedStatement stmnt = connection.prepareStatement(sql);
			stmnt.setInt(1, amount);
			stmnt.setString(2, st);
			
			ResultSet results = stmnt.executeQuery();
			
			while(results.next()){
				String checkNumber = results.getString("CheckNumber");
				String customerName = results.getString("Customer");
				String pamount = results.getString("Amount");
				String state = results.getString("State");
		
				System.out.println(checkNumber + " | " + state + " | " + customerName + " | $" + pamount);
				System.out.println("------------------------------------------------");
			}
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
