package test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Imports Customer functions
import core.Customer;

/*Customer class*/
public class CustomerTest {
	
	//Create new test object: test.
	private Customer test;

	@Before
	/*test is set up as a generic Customer object.*/
	public void setUp() throws Exception {
		test = new Customer();
		//Ensure values from default constructor are loaded.
		assertNotNull(test);
	}

	@After
	/*test is set up as a generic Customer object.*/
	public void tearDown() throws Exception {
		test = null;
		//Ensure values are erased.
		assertNull(test);
	}

	@Test
	//Test displayAddress method.
	public void testdisplayAddress() {
		//Create Customer object test with some values to test with.
		test = new Customer("Daniel", "145 E Vermont Dr.", "Spokane", "WA", "70090", 45);
		//displayAddress is set to equal test
		String displayAddress = test.displayAddress();
		//Ensure expected value "Address: 145 E Vermont Dr. Spokane, WA 70090" is obtained using displayAdress method.
		assertEquals("Address: 145 E Vermont Dr. Spokane, WA 70090", displayAddress);
	}
	
	@Test
	//Test displayAddressLabel method.
	public void testdisplayAdressLabel() {
		//Create Customer object test with some values to test with.
		test = new Customer("Victor", "435 W Benzor Ave.", "Phoenix", "AZ", "85041", 45);
		//displayAddressLabel is set to equal test
		String displayAddressLabel = test.displayAddressLabel();
		//Ensure expected value "Name: Victor Address: 435 W Benzor Ave. Phoenix, AZ 85041" is obtained using displayAdress method.
		assertEquals("Name: Victor Address: 435 W Benzor Ave. Phoenix, AZ 85041", displayAddressLabel);	}

}
