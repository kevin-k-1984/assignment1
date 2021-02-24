package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private double balance;
	private double interestRate;
	
	public CheckingAccount() {
		balance = 0.0;
	}
	
	public CheckingAccount(double balance, double InterestRate) {
		deposit(balance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		
	}
	
	public void widthdraw(double amount) {
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double rate) {
		
	}
}