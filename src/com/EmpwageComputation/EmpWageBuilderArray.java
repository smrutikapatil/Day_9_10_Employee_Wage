package com.EmpwageComputation;

import java.util.ArrayList;

public class EmpWageBuilderArray implements IComputerEmpwage {
	public static final int Is_Fulltime_Present = 1;
	public static final int Is_Parttime_Present = 2;
	
	private int NumOfCompany = 0;
	ArrayList<CompanyEmpWage> arrayList ;
  
    public EmpWageBuilderArray() {
    	arrayList = new ArrayList<>();
    }
    
    private void addCompanyEmpWage(String Company , int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth){
    	arrayList.add(NumOfCompany, new CompanyEmpWage(Company, EmpRatePerHour, NumOfWorkingDays, MaxHoursPerMonth));
    	NumOfCompany++;
    }
    
    private void ComputeEmpWage() {
    	for (int i = 0; i < NumOfCompany; i++) {
        	arrayList.get(i).setTotalEmpWage(this.ComputeEmpWage(arrayList.get(i)));
    		System.out.println(arrayList.get(i));
    	}
    }
    
	public int ComputeEmpWage(CompanyEmpWage CompanyEmpWage) {
		        //variables
				int EmpHrs= 0, TotalEmpHrs= 0, TotalWorkingDays=0;
				//Computation
				while(TotalEmpHrs <= CompanyEmpWage.MaxHoursPerMonth  && TotalWorkingDays < CompanyEmpWage.NumOfWorkingDays) { 
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
			    return TotalEmpHrs * CompanyEmpWage.EmpRatePerHour;
		       }
	  public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.ComputeEmpWage();
		//System.out.println("Total wage for DMart Company: " + empWageBuilder.getTotalWage("Dmart"));
	}
}
