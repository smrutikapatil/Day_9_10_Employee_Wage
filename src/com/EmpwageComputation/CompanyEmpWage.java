package com.EmpwageComputation;

public class CompanyEmpWage {
	public static final int Is_Fulltime_Present = 1;
	public static final int Is_Parttime_Present = 2;
		
	public final String Company;
	public final int EmpRatePerHour;
	public final int NumOfWorkingDays ;
	public final int MaxHoursPerMonth;
	private int TotalEmpWage;
	 
	public CompanyEmpWage(String Company , int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth){
		this.Company = Company;
		this.EmpRatePerHour = EmpRatePerHour;
		this.NumOfWorkingDays = NumOfWorkingDays;
		this.MaxHoursPerMonth = MaxHoursPerMonth;
		//totalEmpWage = 0;
	}
	
	public void setTotalEmpWage(int TotalEmpWage) {
		this.TotalEmpWage = TotalEmpWage;
	}
	//@override
		public String toString() {
			return "Total Emp Wage for Company: " +Company+ " is: " +TotalEmpWage;
   }
}


