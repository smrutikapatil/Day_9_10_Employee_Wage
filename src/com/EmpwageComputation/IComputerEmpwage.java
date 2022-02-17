package com.EmpwageComputation;

public interface IComputerEmpwage {
	public void addCompanyEmployeeWage(String company, int wagePerHour, int numberOfWorkingDays, int maxHours);

	public void computeEmployeeWage();

	public int getTotalWage(String company);
}
