package com.training;


public class Employee implements Comparable<Employee>{
	private String empName;
	private int empId;
	private String deptName;
	private double Salary;
	
	public Employee() {
		System.out.println("Object Instantiated");
	}
	
	public Employee(int empId, String empName,String deptName,double salary) {
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
		this.Salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", deptName=" + deptName + ", Salary=" + Salary
				+ "]";
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		//To compare and sort String
		//return this.getEmpName().compareToIgnoreCase(o.getEmpName());
		
		// To compare and sort integer
		if(this.getEmpId()<o.getEmpId())
			return -1;
		else if(this.getEmpId()>o.getEmpId())
			return 1;
		else
			return 0;
	}
	

}
