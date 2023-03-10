package hibernate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//make sure we are importing org.junit packages


public class CustomerDAOTest {
	
	private static CustomerDAO customerDao;
	
	@BeforeAll
	public static void setUp() {
		customerDao = new CustomerDAO();
	}

	@Test
	public void findByIdTest() {
		
		//given
		Customer expected = new Customer();
		expected.setCustomerName("Atelier graphique");
		expected.setContactFirstName("Carine");
		expected.setContactLastName("Schmitt");
		
		//where
		Customer actual = customerDao.findById(103);
		
		//then
		Assertions.assertEquals(expected.getCustomerName(), actual.getCustomerName());
		Assertions.assertEquals(expected.getContactFirstName(), actual.getContactFirstName());
		Assertions.assertEquals(expected.getContactLastName(), actual.getContactLastName());
		
	}
	
	
	/*
	 * @Test
	 * public void checkinTest(){
	 * 	//given
	 * MovieRental record with the correct values
	 * 
	 *	//when
	 *	query for the user
	 *	query for the movie
	 *	query for the movie record
	 *	run the checkin function, returns the movie record that was created
	 *
	 *	//then
	 *	assert the movie record expected is equal to actual
	 * }
	 * */
}
