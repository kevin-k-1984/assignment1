package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	
	public CheckingAccount() {
		balance = 0.0;
	}
	
	public CheckingAccount(double openingBalance) {
		deposit(openingBalance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean deposit(double amount) {
		
		return true;
	}
	
	public boolean withdraw(double amount) {
		
		return true;
	}

	public double futureValue(int years) {
		
		return 0.0;
	}
	
	public String toString() {
		
		return "";
	}
}