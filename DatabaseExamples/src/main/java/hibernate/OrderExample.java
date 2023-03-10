package hibernate;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		
		// TODO Auto-generated method stub
		OrderDAO orderDao = new OrderDAO();
		
		Order order = orderDao.findById(10100);
		System.out.println(order);
		
		Customer c = customerDao.findById(323);
		
//		Order newOrder = new Order();
//		newOrder.setCustomer(c);
//		newOrder.setOrderDate(new Date());
//		newOrder.setRequiredDate(new Date());
//		newOrder.setShippedDate(new Date());
//		newOrder.setStatus("Shipped");
		
//		orderDao.insert(newOrder);
		
		OrderDetailsDAO oDDao = new OrderDetailsDAO();
		
		OrderDetails oD = new OrderDetails();
		oD.setOrder(order);
		
		oD.setQuantityOrdered(50);
		oD.setPriceEach(50.00);
		oD.setOrderLineNumber(8);
		
		OrderDetails oD2 = oDDao.findById(2998);
		System.out.println("oD2");
		System.out.println(oD2);
		
		
		
		ProductDAO productDao = new ProductDAO();
		Product p1 = productDao.findById(80);
		oD2.setProduct(p1);
//		System.out.println(p1);
//		oDDao.insert(oD);
		
		
		
		//attempting to update order details
		oD2.setQuantityOrdered(888);
		oD2.setPriceEach(40.00);
		oD2.setOrderLineNumber(7);
		oDDao.updateOrderDetails(oD2);
		
//		OrderDetails oD3000 = oDDao.findById(3000); // already deleted
//		OrderDetails oD3001 = oDDao.findById(3001); //already deleted
//		oDDao.deleteOrderDetails(oD3000); //already deleted
//		oDDao.deleteOrderDetails(oD3001);
		
//		List<Product> p2 = new ArrayList<Product>();
//		p2.addAll(productDao.findByName("Roadster"));
//		System.out.println(p2);
		
//		OfficeDAO officeDao = new OfficeDAO();
//		Office	sanFranOffice = officeDao.findById(1);
//		System.out.println(sanFranOffice);
//		
//		List<Employee> sFEmployeeList = new ArrayList<Employee>();
//		sFEmployeeList.addAll(sanFranOffice.getEmployees());
//		System.out.println(sFEmployeeList);
//		System.out.println(sFEmployeeList.get(0).getCustomers());
	}

}
