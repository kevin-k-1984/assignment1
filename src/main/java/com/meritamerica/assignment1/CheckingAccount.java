package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	
	public CheckingAccount() {
		this.balance = 0.0;
		this.interestRate = 0.01;
	}
	
	public CheckingAccount(double openingBalance) {
		deposit(openingBalance);
		this.interestRate = 0.01;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
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