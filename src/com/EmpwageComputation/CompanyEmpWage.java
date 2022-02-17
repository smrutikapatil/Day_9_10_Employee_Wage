package com.EmpwageComputation;

public class CompanyEmpWage {
	public final String Company;
	public final int EmpRatePerHour;
	public final int NumOfWorkingDays;
	public final int MaxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String Company, int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth) {
		this.Company = Company;
		this.EmpRatePerHour = EmpRatePerHour;
		this.NumOfWorkingDays = NumOfWorkingDays;
		this.MaxHoursPerMonth = MaxHoursPerMonth;
		totalEmpWage = 0;
	}

	public void setTotalEmpWage(int TotalEmpWage) {
		this.totalEmpWage = TotalEmpWage;
	}

	// @override
	public String toString() {
		return "Total Emp Wage for Company: " + Company + " is: " + totalEmpWage;
	}
}
