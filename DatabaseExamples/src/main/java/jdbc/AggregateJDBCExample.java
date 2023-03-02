package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AggregateJDBCExample {
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "password";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			// create a new scanner and read a first name into the variable firstName
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter an amount : ");
			int num = sc.nextInt();
			sc.close();

//			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);

			String SelectSQL = "select c.customerNumber, c.customerName, round(avg((MSRP - buyPrice)*quantityOrdered), 2) as avg_margin\r\n"
					+ "from orders o, orderdetails od, products p, customers c\r\n"
					+ "where o.orderNumber = od.orderNumber\r\n"
					+ "and od.productCode = p.productCode\r\n"
					+ "and o.customerNumber = c.customerNumber\r\n"
					+ "group by c.customerNumber\r\n"
					+ "having avg((MSRP - buyPrice)*quantityOrdered) > ?\r\n"
					+ "order by avg_margin desc;";;

			// this is the JDBC class that creates the statement which will in turn run the
			// SQL
//			Statement stmt = connection.createStatement(); >>You don't do it this way anymore

			// Using a prepared statement protects against SQL Injection Attacks
			// this is the way you do it
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			// this is 1 based so the first ? is #1
			stmt.setInt(1, num);
			

			// using the statement to execute a query and put the result into the resultset
			// object
			ResultSet result = stmt.executeQuery();

			// loop over the result set
			while (result.next()) {
				String customerNumber = result.getString("customerNumber");
				String customerName = result.getString("customerName");
				String averageMargin = result.getString("avg_margin");
		
				System.out.println(customerNumber + " | " + customerName + " | " + averageMargin);
				System.out.println("------------------------------------------------");
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
