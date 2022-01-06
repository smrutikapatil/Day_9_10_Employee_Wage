package com.EmpwageComputation;

public class EmployeeWage {
	public static final int is_fulltime_Present = 1;
	public static final int is_parttime_Present = 2;
	public static final int wage_pr_hr=20;

	public static void main(String[] args) {
		getFullOrPartTimeWage();
		}
	static void getFullOrPartTimeWage() {
	int working_hour = 0;
	int daily_wage = 0;
	int emp_check=(int)(Math.floor(Math.random()* 10) % 3);
	if (emp_check==is_fulltime_Present)
	{
		System.out.println("Employee is full time Present");
		working_hour=8;
	}
	else if (emp_check==is_parttime_Present) {
		System.out.println("Employee is part time present");
        working_hour=4;
    }
	else
	{
		System.out.println("Employee is Absent");
		working_hour=0;
	}
	 daily_wage = working_hour * wage_pr_hr;
	  System.out.println("Employee daily wage is " + daily_wage);  
	}
}
