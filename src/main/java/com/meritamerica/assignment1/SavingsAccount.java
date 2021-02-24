package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private double balance;
	private double interestRate;
	
	public SavingsAccount() {
		balance = 0.0;
	}
	
	public SavingsAccount(double balance, double interestRate) {
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