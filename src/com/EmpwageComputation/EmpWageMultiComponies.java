package com.EmpwageComputation;

public class EmpWageMultiComponies {
	public static final int is_fulltime_Present = 1;
	public static final int is_parttime_Present = 2;
	 
	public static int computeEmpWage(String company , int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		//variables
		int empHrs= 0, totalEmpHrs= 0, totalWorkingDays=0;
		//Computation
		while(totalEmpHrs <= maxHoursPerMonth  && totalWorkingDays < numOfWorkingDays) { 
			   totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) %3;
			switch(empCheck) {
			case is_parttime_Present:
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
	int totalEmpWage = totalEmpHrs * empRatePerHour;
	System.out.println("Total Emp Wage For Compony: " + company+" is: " + totalEmpWage);
	return totalEmpWage;
	 }
	public static void main(String[] args) {
		computeEmpWage("Dmart",20,2,10);
		computeEmpWage("Reliance",10,4,20);
	}
			
}

