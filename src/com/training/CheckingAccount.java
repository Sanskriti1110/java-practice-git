package com.training;

public class CheckingAccount implements Account{
	public double rate=2;
	public double balance=0;
	
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void calInterest() {
		double interest = balance*(rate/100);
		System.out.println("The interest on the deposited amount - "+interest);
	}
}
