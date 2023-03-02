package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BasicJDBCExamples {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "password";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			// create a new scanner and read a first name into the variable firstName
			Scanner sc = new Scanner(System.in);
			String name = "Steve";
			
			System.out.print("Enter a first name or a last name : ");
			name = sc.nextLine();
			sc.close();
			
			
			
//			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			
			String SelectSQL = "Select * FROM employees WHERE firstName = ? OR lastName = ?";
			
			//this is the JDBC class that creates the statement which will in turn run the SQL
//			Statement stmt = connection.createStatement(); >>You don't do it this way anymore
			
			//Using a prepared statement protects against SQL Injection Attacks
			//this is the way you do it
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			//this is 1 based so the first ? is #1
			stmt.setString(1, name);
			stmt.setString(2, name);
			
			// using the statement to execute a query and put the result into the resultset object
			ResultSet result = stmt.executeQuery();
			
			// loop over the result set
			while (result.next()) {
				String EmployeeID = result.getString("employeeNumber");
				String fname = result.getString("firstName");
				String lname = result.getString("lastName");
				String email = result.getString("email");
				System.out.println(EmployeeID + " | " + fname + " | " + lname + " | " + email);
				System.out.println("------------------------------------------------");
			}
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
