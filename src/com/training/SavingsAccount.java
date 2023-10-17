package com.training;

public class SavingsAccount implements Account{
	public double rate=4;
	public double balance=0;
	
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void calInterest() {
		double interest = balance*(rate/100);
		System.out.println("The interest on the deposited amount - "+ interest);
	}
	
}
