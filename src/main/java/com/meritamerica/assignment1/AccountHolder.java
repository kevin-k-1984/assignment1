package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String SSN;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	
	public AccountHolder() {
		firstName = "";
		middleName = "";
		lastName = "";
		SSN = "";
		checkingAccount = new CheckingAccount();
		savingsAccount = new SavingsAccount();
	}
	
	public AccountHolder(String firstName, String middleName, String lastName, String SSN, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = SSN;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String ssn) {
		this.SSN = ssn;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	
	public String toString() {
		return "";
	}
	
}