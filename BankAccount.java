package core;

/*BankAccount class*/
public class BankAccount {
	//Initialize variables to be used in BankAccount class.
	//@param AccountNumber account number, @param AccountHolder account holder (String values)
	//@param accountType account type (integer value)
	//@param totalBalance total balance, @param interestRate interest rate (double values)
	String AccountNumber;
	String AccountHolder;
	double balance;
	int accountType;
	double totalBalance;
	double interestRate;
	
	//Default constructor for BankAccount class sets all values to empty values.
	public BankAccount(){
		balance=0;
		accountType=0;
		AccountNumber="none";
		AccountHolder="Uknown";
	}
	
	//Constructor for BankAccount class sets all values to those input by the user.
	public BankAccount(double bal, int type, String accountNum, String accountHol){		
		balance=bal;
		accountType=type;
		AccountNumber=accountNum;
		AccountHolder=accountHol;
	}
	
	//Getter function getAccountNumber returns AccountNumber value.
	//@return account number
	public String getAccountNumber() {
		return AccountNumber;
	}

	//Setter function setAccountNumber assigns AccountNumber value set by user.
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	//Getter function getAccountHolder returns AccountHolder value.
	public String getAccountHolder() {
		return AccountHolder;
	}

	//Setter function setAccountHolder assigns AccountHolder value set by user.
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	//Getter function getBalance returns balance value.
	//@return balance
	public double getBalance() {
		return balance;
	}

	//Setter function setBalance assigns balance value set by user.
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Getter function getAccountType returns accountType value.
	//@return account type
	public int getAccountType() {
		return accountType;
	}

	//Setter function setAccountType assigns accountType value set by user.
	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}
	
	/* Method calculateTotalBalance returns the total balance after interest*/
	//@return total balance
	public double calculateTotalBalance(){
		//Use getter functions to obtain interestRate and balance.
		interestRate=getInterestRate();
		balance=getBalance();
		
		//Calculate totalBalance.
		totalBalance = balance + (balance*interestRate/100);
		return totalBalance;
	}
	
	/* Method getInterestRate returns the proper interestRate based on accountType.*/
	//@return interest rate
	public double getInterestRate(){
		//Savings Account interest rate(0.5%).
		if(accountType==1){
			interestRate=0.5;
			//savings 0.5
		}
		
		//Award Savers Account interest rate(4.5%).
		else if(accountType==2){
			interestRate=4.5;
			//award savers
		}
		
		//Checking Account interest rate(1.0%).
		else if(accountType==3){
			interestRate=1.0;
			//checking
		}
		
		//Credit Card Account interest rate(15%).
		else if(accountType==4){
			interestRate=15;
			//credit card
		}
		
		//Other interest rate(Anything other than 1,2,3, or 4) set to 0%.
		else{
			interestRate=0;
		}
		
		return interestRate;
	}
}