package EmpWageComputation;

public class EmpAttendance {
	public static boolean attendance() {
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random()* 10) % 2;
		if (empCheck == IS_FULL_TIME)
			return true;  	
		else
			return false;
}
	public static void main(String[] args) {
		boolean result = attendance();
		if (result){
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
			
		}
	}
}
