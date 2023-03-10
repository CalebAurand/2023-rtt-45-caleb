package hibernate;

import java.util.Date;

public class HibernateExample {

	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
////		he.insert();
////				
//		Customer customer = new Customer();
//		customer.setCustomerName("Hibernate Customer");
//		customer.setContactFirstName("Bob");
//		customer.setContactLastName("Herbertson");
//		customer.setPhone("123-455-3321");
//		customer.setState("ID");
//		customer.setCity("Busy");
//		customer.setCountry("USA");
//		customer.setAddressLine1("32oz Ribeye Steak Street");
		
//		customerDao.updateCustomer(customer);
//		
//		Customer first = customerDao.findById(497);
//		System.out.println(first.toString());
//		
//		first.setAddressLine2("This is an update");
//		first.setPostalCode("90210");
//		first.setCreditLimit(1000000.32);
//		
//		customerDao.updateCustomer(first);
//		
////		List<Customer> firstNames = he.findByContactFirstName("Leslie");
////		for(Customer c : firstNames) {
////			System.out.println(c);
////		}
//		
//		Customer second = customerDao.findById(498);
//		Customer third = customerDao.findById(499);
//		Customer fourth = customerDao.findById(500);
//		Customer fifth = customerDao.findById(501);
//		
//		second.setCustomerName("second customer");
//		second.setContactFirstName("Lisa");
//		second.setContactLastName("Merkowski");
//		second.setAddressLine1("123 state st");
//		customerDao.updateCustomer(second);
//		
//		third.setCustomerName("third customer");
//		third.setContactFirstName("Mary");
//		third.setContactLastName("Merkowski");
//		third.setAddressLine1("123 state st");
//		customerDao.updateCustomer(third);
//		
//		fourth.setCustomerName("fourth customer");
//		fourth.setContactFirstName("Bill");
//		fourth.setContactLastName("Brown");
//		fourth.setAddressLine1("angry st");
//		customerDao.updateCustomer(fourth);
//		
//		fifth.setCustomerName("fifth customer");
//		fifth.setContactFirstName("Mike");
//		fifth.setContactLastName("Wyzowski");
//		fifth.setAddressLine1("monster st");
//		customerDao.updateCustomer(fifth);
		
		Customer customer = customerDao.findById(509);
		Payment payment = new Payment();
		payment.setCheckNumber("ABC123456");
		payment.setPaymentDate(new Date());
		payment.setAmount(5000.25);
		payment.setCustomer(customer);
		
		customer.getPayments().add(payment);
		customerDao.updateCustomer(customer);
		
	}
	
	

}
