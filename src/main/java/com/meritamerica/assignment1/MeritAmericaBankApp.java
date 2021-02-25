package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	
	public static void main(String[] args) {
		
		AccountHolder account1 = new AccountHolder("Michael","","","",100,1000);
		System.out.println(account1.toString());
		account1.getCheckingAccount().deposit(500);
		account1.getSavingsAccount().withdraw(800);
		account1.getCheckingAccount().toString();
		account1.getSavingsAccount().toString();
		
		AccountHolder account2 = new AccountHolder("Tom","","","",200,500);
		account2.getCheckingAccount().deposit(-500);
		account2.getSavingsAccount().withdraw(600);
		System.out.println(account2.toString());
		
	}
}