package com.EmpwageComputation;

public class EmployeeWage {
	public static final int is_fulltime_Present = 1;
	public static final int is_parttime_Present = 2;
	public static final int wage_pr_hr=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HOURS_FOR_MONTH = 100;
	
	public static void main(String[] args) {
		getMonthlyEmpWage();
    }
	static void getMonthlyEmpWage() {
		int empHrs= 0, totalEmpHrs= 0, totalWorkingDays=0;
		//Computation
		while(totalEmpHrs <= MAX_HOURS_FOR_MONTH &&
			   totalWorkingDays < NUM_OF_WORKING_DAYS) { 
			   totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) %3;
			switch(empCheck) {
			case is_parttime_Present :
				empHrs=4;
				break;
			case is_fulltime_Present:
				empHrs=8;
				break;
			default:
			empHrs=0;
		}
		totalEmpHrs += empHrs;
		System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
	int totalEmpWage = totalEmpHrs * wage_pr_hr;
	System.out.println("Total Emp Wage: " + totalEmpWage);
 }
}