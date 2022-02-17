package com.EmpwageComputation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilderArray implements IComputerEmpwage {
	public static final int Is_Fulltime_Present = 1;
	public static final int Is_Parttime_Present = 2;

	private int NumOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilderArray() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	private void addCompanyEmpWage(String Company, int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(Company, EmpRatePerHour, NumOfWorkingDays, MaxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(Company, companyEmpWage);
	}

	private void ComputeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage computeEmpWage = companyEmpWageList.get(i);
			computeEmpWage.setTotalEmpWage(this.ComputeEmpWage(computeEmpWage));
			System.out.println(computeEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int ComputeEmpWage(CompanyEmpWage CompanyEmpWage) {
		// variables
		int EmpHrs = 0, TotalEmpHrs = 0, TotalWorkingDays = 0;
		// Computation
		while (TotalEmpHrs <= CompanyEmpWage.MaxHoursPerMonth && TotalWorkingDays < CompanyEmpWage.NumOfWorkingDays) {
			TotalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Parttime_Present:
				EmpHrs = 4;
				break;
			case Is_Fulltime_Present:
				EmpHrs = 8;
				break;
			default:
				EmpHrs = 0;
			}
			TotalEmpHrs += EmpHrs;
			System.out.println("Day#: " + TotalWorkingDays + " Emp Hr: " + EmpHrs);
		}
		return TotalEmpHrs * CompanyEmpWage.EmpRatePerHour;
	}

	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.ComputeEmpWage();
		System.out.println("Total wage for DMart Company: " + empWageBuilder.getTotalWage("Dmart"));
	}
}
