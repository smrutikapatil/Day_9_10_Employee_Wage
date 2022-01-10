package com.EmpwageComputation;
public class EmpWageBuilderArray {
	public static final int Is_Fulltime_Present = 1;
	public static final int Is_Parttime_Present = 2;
	
	private int NumOfCompany = 0;
	private CompanyEmpWage[] CompanyEmpWageArray;
	  
    public EmpWageBuilderArray() {
    	CompanyEmpWageArray = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String Company , int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth){
    	CompanyEmpWageArray[NumOfCompany] = new CompanyEmpWage(Company, EmpRatePerHour, NumOfWorkingDays, MaxHoursPerMonth);
    	NumOfCompany++;
    }
    private void ComputeEmpWage() {
    	for (int i = 0; i < NumOfCompany; i++) {
    		CompanyEmpWageArray[i].setTotalEmpWage(this.ComputeEmpWage(CompanyEmpWageArray[i]));
    		System.out.println(CompanyEmpWageArray[i]);
    	}
    }
	private int ComputeEmpWage(CompanyEmpWage CompanyEmpWage) {
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
		EmpWageBuilderArray EmpWageBuilder = new EmpWageBuilderArray();
		EmpWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
		EmpWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		EmpWageBuilder.ComputeEmpWage();
	}
}
