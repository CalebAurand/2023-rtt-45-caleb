package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Homework2 {
	public static void main(String[] args) {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "password";
		System.out.println("-------- MySQL JDBC Aggregate Payments ------------");
		try {
			
			List<String> stateList = new ArrayList<String>();
			
			Connection connection =  DriverManager.getConnection(dburl, user, password);
			
			String sql1 = "select state "
					+ "from offices "
					+ "where state is not null";
			
			PreparedStatement stmnt = connection.prepareStatement(sql1);
			
			ResultSet results1 = stmnt.executeQuery();
			
			while(results1.next()){
				stateList.add(results1.getString("state"));
			}
			
			String sql2 = "select c.customerNumber as CustomerNumber, c.customerName as CustomerName "
					+ "from customers c "
					+ "where state = ?";
			for( int i=0; i<stateList.size(); i++ ) {
				String state = stateList.get(i);
				System.out.println("--------------" + state + "---------------");
				PreparedStatement stmnt2 = connection.prepareStatement(sql2);
				stmnt2.setString(1, state);
				ResultSet results2 = stmnt2.executeQuery();
				
				while(results2.next()) {
					String customerNumber = results2.getString("CustomerNumber");
					String customerName = results2.getString("CustomerName");
					
					System.out.println( customerNumber + " | " + customerName );
					System.out.println("------------------------------------------------");
				}
			}
			
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
