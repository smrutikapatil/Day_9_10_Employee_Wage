package com.EmpwageComputation;

public interface IComputerEmpwage {
	int Is_Fulltime_Present = 1;
	int Is_Parttime_Present = 2;
	
	void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours);

	void computeEmployeeWage();
	//public int getTotalWage(String company);
}
