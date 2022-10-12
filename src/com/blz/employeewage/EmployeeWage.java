package com.blz.employeewage;

public class EmployeeWage {
	static final int Is_Present = 1;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!!");
		int attendance = (int) (Math.floor(Math.random() * 10)) % 2;
		System.out.println(attendance);
		if (attendance == Is_Present)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}
