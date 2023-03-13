package hibernate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

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
	
	@ParameterizedTest
	@CsvSource({
		"103,Atelier graphique,Carine,Schmitt", 
		"112,Signal Gift Stores,Jean,King"
		})
	public void findByParameterizedTest(ArgumentsAccessor args) {
		
		//given
		Customer expected = new Customer();
		expected.setCustomerName(args.getString(1));
		expected.setContactFirstName(args.getString(2));
		expected.setContactLastName(args.getString(3));
		
		//when
		Customer actual = customerDao.findById(args.getInteger(0));
		
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
	 * MovieRental expected = new MovieRental();
	 * expected.set...
	 * expected.set...
	 * expected.set...
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
