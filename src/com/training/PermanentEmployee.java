package com.training;

public class PermanentEmployee extends Employee{
	private double pfPercentage;
	private double pfAmount;
	
	public PermanentEmployee(int empId, String empName,String deptName,double salary,double pfPercentage) {
		this.pfPercentage = pfPercentage;
		calcPfAmount();
		this.pfAmount = getPfAmount();	
	}

	private void calcPfAmount() {
		this.pfAmount = (this.pfPercentage/100)*getSalary();
	}

	public double getPfPercentage() {
		return pfPercentage;
	}

	public void setPfPercentage(double pfPercentage) {
		this.pfPercentage = pfPercentage;
	}

	public double getPfAmount() {
		return pfAmount;
	}

	public void setPfAmount(double pfAmount) {
		this.pfAmount = pfAmount;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [pfPercentage=" + pfPercentage + ", pfAmount=" + pfAmount + "]";
	}
	
	
}
