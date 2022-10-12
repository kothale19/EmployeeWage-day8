package com.blz.employeewage;

public class EmployeeWage {
	static final int Is_Present = 1;
	static final int Is_Parttime = 2;
	static final int Wage_Per_Hour = 20;
	static final int Full_Day_Hour = 8;
	static final int Part_Time_Hour = 4;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!!");
		int attendance = (int) (Math.floor(Math.random() * 10)) % 3;
//		System.out.println(attendance);
		if (attendance == Is_Present) {

			System.out.println("Employee is working Fulltime");
			int dailyWage = Wage_Per_Hour * Full_Day_Hour;
			System.out.println("Employee dailywage is: " + dailyWage);
		} else if (attendance == Is_Parttime) {
			System.out.println("Employee is working Parttime");
			int dailyWage = Wage_Per_Hour * Part_Time_Hour;
			System.out.println("Employee daily wage is:" + dailyWage);
		} else
			System.out.println("Employee is absent");

	}

}
