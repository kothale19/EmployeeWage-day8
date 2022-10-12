package com.blz.employeewage;

public class EmployeeWage {
	static final int Is_Full_Time = 1;
	static final int Is_Parttime = 2;
	static final int Wage_Per_Hour = 20;
	static final int Full_Day_Hour = 8;
	static final int Part_Time_Hour = 4;
	static final int Working_Day_Per_Month = 20;
	static final int Total_Work_Hour = 100;
	private static final int IS_PART_TIME = 0;

	static void calculateWage() {
		System.out.println("Welcome to Employee Wage Computation");
		int totalHours = 0;
		int day = 0;
		int totalWage = 0;
		int dailyWage = 0;

		while ((totalHours < Total_Work_Hour) && (day < Working_Day_Per_Month)) {
			int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

			switch (attendance) {

			case Is_Full_Time:
				dailyWage = Wage_Per_Hour * Full_Day_Hour;
				totalHours += Full_Day_Hour;
				break;

			case IS_PART_TIME:
				dailyWage = Wage_Per_Hour * Part_Time_Hour;
				totalHours += Part_Time_Hour;
				break;
			default:
				break;
			}
			totalWage += dailyWage;
			day++;
		}
		System.out.println("Total work hour is: " + totalHours);
		System.out.println("Total work days are: " + day);
		System.out.println("Total wage is: " + totalWage);

	}

	public static void main(String[] args) {
		calculateWage();
	}
}
