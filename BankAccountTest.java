package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Imports BankAccount functions.
import core.BankAccount;

/*BankAccount class*/
public class BankAccountTest {
	
	//Create new test object: test.
	private BankAccount test;

	@Before
	/*test is set up as a generic BankAccount object*/
	public void setUp() throws Exception {
		test= new BankAccount();
		//Ensure values from default constructor are loaded.
		assertNotNull(test);
	}

	@After
	/*test is tore down BankAccount object*/
	public void tearDown() throws Exception {
		test=null;
		//Ensure values are erased.
		assertNull(test);
	}

	@Test
	//Test calculateTotalBalance method.
	public void testCalculateTotalBalance() {
		//Create BankAccount object test with some values to test with.
		test = new BankAccount(100, 3, "2516578", "Bobby");
		//totalBalance is set to equal test
		double totalBalance = test.calculateTotalBalance();
		//Ensure expected value 101 is obtained using calculateTotalBalance method.(0 is the max discrepancy between values.
		assertEquals(101, totalBalance, 0);
	}
	
	@Test
	//Test getInterestRate method
	public void testgetInterestRate() {
		//Create BankAccount object test with some values to test with.
		test = new BankAccount(100, 1, "2516578", "Bobby");
		//accountType is equal to 1, interest rate should be set to 0.5.
		double interestRate1 = test.getInterestRate();
		//Ensure expected value 0.5 is obtained using getInterestRate method.
		assertEquals(0.5,interestRate1,0);
		
		//Create BankAccount object test2 with some values to test with.
		BankAccount test2 = new BankAccount(100, 2, "2516578", "Bobby");
		//accountType is equal to 2, interest rate should be set to 4.5.
		double interestRate2 = test2.getInterestRate();
		//Ensure expected value 4.5 is obtained using getInterestRate method.
		assertEquals(4.5,interestRate2,0);
		
		//Create BankAccount object test3 with some values to test with.
		BankAccount test3 = new BankAccount(100, 3, "2516578", "Bobby");
		//accountType is equal to 3, interest rate should be set to 1.0.
		double interestRate3 = test3.getInterestRate();
		//Ensure expected value 1.0 is obtained using getInterestRate method.
		assertEquals(1.0,interestRate3,0);
		
		//Create BankAccount object test4 with some values to test with.
		BankAccount test4 = new BankAccount(100, 4, "2516578", "Bobby");
		//accountType is equal to 4, interest rate should be set to 15.
		double interestRate4 = test4.getInterestRate();
		//Ensure expected value 15 is obtained using getInterestRate method.
		assertEquals(15,interestRate4,0);
		
		//Create BankAccount object test5 with some values to test with.
		BankAccount test5 = new BankAccount(100, 5, "2516578", "Bobby");
		//accountType is equal to 5, interest rate should be set to 0.
		double interestRate5 = test5.getInterestRate();
		//Ensure expected value 0 is obtained using getInterestRate method.
		assertEquals(0,interestRate5,0);
		
		//Create BankAccount object test6 with some values to test with.
		BankAccount test6 = new BankAccount(100, 0, "2516578", "Bobby");
		//accountType is equal to 0, interest rate should be set to 0.
		double interestRate6 = test6.getInterestRate();
		//Ensure expected value 0 is obtained using getInterestRate method.
		assertEquals(0,interestRate6,0);
		
	}

}
