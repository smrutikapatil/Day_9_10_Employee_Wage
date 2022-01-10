package com.EmpwageComputation;

public class EmpWageBuilderObject{
	public static final int Is_Fulltime_Present = 1;
	public static final int Is_Parttime_Present = 2;
	 
	public final String Company;
	public final int EmpRatePerHour;
	public final int NumOfWorkingDays ;
	public final int MaxHoursPerMonth;
	private int TotalEmpWage;
	 
	public EmpWageBuilderObject(String Company , int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth){
		this.Company = Company;
		this.EmpRatePerHour = EmpRatePerHour;
		this.NumOfWorkingDays = NumOfWorkingDays;
		this.MaxHoursPerMonth = MaxHoursPerMonth;
	}
	public void ComputeEmpWage() {
		//variables
		int EmpHrs= 0, TotalEmpHrs= 0, TotalWorkingDays=0;
		//Computation
		while(TotalEmpHrs <= MaxHoursPerMonth  && TotalWorkingDays < NumOfWorkingDays) { 
			   TotalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10 ) %3;
			switch(empCheck) {
			case Is_Parttime_Present:
				EmpHrs=4;
				break;
			case Is_Fulltime_Present:
				EmpHrs=8;
				break;
			default:
			EmpHrs=0;
		}
		TotalEmpHrs += EmpHrs;
		System.out.println("Day#: " + TotalWorkingDays + " Emp Hr: " +EmpHrs);
		}
	      TotalEmpWage = TotalEmpHrs * EmpRatePerHour;
       }
	//@override
	public String toString() {
		return "Total Emp Wage for Company: " +Company+ " is: " +TotalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageBuilderObject dmart = new EmpWageBuilderObject("Dmart", 20, 2, 10);
		EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance", 10, 4, 20);
		EmpWageBuilderObject vmart = new EmpWageBuilderObject("Vmart", 30, 3, 30);
		dmart.ComputeEmpWage();
		System.out.println(dmart);
		reliance.ComputeEmpWage();
		System.out.println(reliance);
		vmart.ComputeEmpWage();
		System.out.println(vmart);
	}
}
