package com.training;
import java.util.*;

public class MyClass {
	public static void main(String[] args) {
		
//		PermanentEmployee emp1 = new PermanentEmployee(101,"Sanskriti","Sales",200000,15) ;
////		emp1.setPfPercentage(12.0);
//		System.out.println(emp1);
		
//		Account a1 = new SavingsAccount();
//		a1.deposit(4000);
//		a1.calInterest();
		
//		List<Employee> l1 = new ArrayList<>();
//		l1.add(new Employee(101,"Sanskriti","Sales",200000));
//		l1.add(new Employee(102,"Amisha","IT",500000));
//		l1.add(new Employee(103,"Nikita","HR",300000));
//		l1.add(new Employee(104,"Avantika","Sales",400000));
//		l1.add(new Employee(105,"Chirag","CEO",1500000));
//		
//		List<Employee> l2 = new ArrayList<>();
//		for(Employee emp:l1) {
//			if(emp.getEmpName().charAt(0)=='A') {
//				l2.add(emp);
//			}
//		}
//		for(Employee emp:l2) {
//			System.out.println(emp);
//		}
		
		
		Set<Employee> names = new TreeSet<>();
		names.add(new Employee(101,"Sanskriti","Sales",200000));
		names.add(new Employee(102,"Amisha","IT",500000));
		names.add(new Employee(103,"Nikita","HR",300000));
		names.add(new Employee(104,"Avantika","Sales",400000));
		names.add(new Employee(105,"Chirag","CEO",1500000));
		
		for(Employee name:names) {
			System.out.println(name);
		}
		
	}
	
}
