package com.blz.employeewage;

public class EmployeeWage {
	static final int Is_Present = 1;
	static final int Is_Parttime = 2;
	static final int Wage_Per_Hour = 20;
	static final int Full_Day_Hour = 8;
	static final int Part_Time_Hour = 4;
	static final int Working_Day_Per_Month = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!!");
		int dailyWage = 0;
		int monthlyWage = 0;
		for (int day = 1; day <= Working_Day_Per_Month; day++) {

			int attendance = (int) (Math.floor(Math.random() * 10)) % 3;
			switch (attendance) {
			case Is_Present:
				System.out.println("Employee is working Fulltime");
				dailyWage = Wage_Per_Hour * Full_Day_Hour;
				System.out.println("Employee daily wage is:" + dailyWage);
				break;
			case Is_Parttime:
				System.out.println("Employee is working Parttime");
				dailyWage = Wage_Per_Hour * Part_Time_Hour;
				System.out.println("Employee daily Wage is:" + dailyWage);
				break;
			default:
				System.out.println("Employee is absent");

			}
			monthlyWage += dailyWage;
		}
		System.out.println("monthlyWage is: " + monthlyWage);

	}
}