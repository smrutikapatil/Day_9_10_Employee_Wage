package com.EmpwageComputation;

public interface IComputerEmpwage {
	void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours);

	void computeEmployeeWage();
	
	public int getTotalWage(String company);
}
