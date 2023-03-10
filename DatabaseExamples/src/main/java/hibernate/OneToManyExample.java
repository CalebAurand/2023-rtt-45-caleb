package hibernate;

public class OneToManyExample {
	// One to Many Hibernate Example - https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping
	// Many to Many - https://attacomsian.com/blog/spring-data-jpa-many-to-many-mapping
	public static void main(String[] args) {
		CustomerDAO customerDao = new CustomerDAO();
		EmployeeDAO employeeDao = new EmployeeDAO();
		
		//Leslie Thompson eId 1166
		Employee e = employeeDao.findById(1166);
		System.out.println(e);
		
		for ( Customer customer : e.getCustomers()) {
			System.out.println(customer);
		}
				
		System.out.println(customerDao.findById(103));
		
		Customer customer = new Customer();
		customer.setCustomerName("Hibernate Customer");
		customer.setContactFirstName("Bob");
		customer.setContactLastName("Herbertson");
		customer.setPhone("123-455-3321");
		customer.setState("ID");
		customer.setCity("Busy");
		customer.setCountry("USA");
		customer.setAddressLine1("32oz Ribeye Steak Street");
		customer.setEmployee(e);
		
//		customerDao.insert(customer); //can replace below lines with this line as alternative
		
		e.getCustomers().add(customer);
		employeeDao.updateEmployee(e);
	}
}
