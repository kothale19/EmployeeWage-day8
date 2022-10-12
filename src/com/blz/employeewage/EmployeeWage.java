package com.blz.employeewage;

public class EmployeeWage {
	static final int Is_Present = 1;
	static final int Wage_Per_Hour = 20;
	static final int Full_Day_Hour = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!!");
		int attendance = (int) (Math.floor(Math.random() * 10)) % 2;
		System.out.println(attendance);
		if (attendance == Is_Present) {

			System.out.println("Employee is present");
			int dailyWage = Wage_Per_Hour * Full_Day_Hour;
			System.out.println("Employee dailywage is: " + dailyWage);
		} else
			System.out.println("Employee is absent");

	}

}
