package com.blz.employeewage;

public class EmployeeWage {
	static final int Is_Present = 1;
	static final int Is_Parttime = 2;
	static final int Wage_Per_Hour = 20;
	static final int Full_Day_Hour = 8;
	static final int Part_Time_Hour = 4;
	static final int Working_Day_Per_Month = 20;
	static final int Total_Work_Hour = 100;
	static int totalHours = 0;
	static int day = 0;
	static int totalWage = 0;
	static int dailyWage = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program!!");
		while ((totalHours < Total_Work_Hour) && (day < Working_Day_Per_Month)) {

			int attendance = (int) (Math.floor(Math.random() * 10)) % 3;
			switch (attendance) {
			case Is_Present:
				System.out.println("Employee is working Fulltime");
				dailyWage = Wage_Per_Hour * Full_Day_Hour;
				totalHours += Full_Day_Hour;
				break;
			case Is_Parttime:
				System.out.println("Employee is working Parttime");
				dailyWage = Wage_Per_Hour * Part_Time_Hour;
				totalHours += Part_Time_Hour;
				break;
			default:
				System.out.println("Employee is absent");

			}
			totalWage += dailyWage;
			day++;
		}
		System.out.println("Total work hour is: " + totalHours);
		System.out.println("Total work days are: " + day);
		System.out.println("Total wage is: " + totalWage);

	}
}