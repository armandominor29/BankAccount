package test;
/*LabTestSuite tests all tests.*/
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BankAccountTest.class, CustomerTest.class })
public class LabTestSuite {
}
