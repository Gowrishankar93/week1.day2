package week1.day2;

public class EmployeeDetails {
	
	public void printEmployeeName(String empName, int empId) {
		
		System.out.println(empName+empId);
	}
	
	public void getEmployeeDetails(String empAddress) {
	System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	
	public void printEmployeeMobileNumber( long mobNum) {
		System.out.println(mobNum);
	}

	public static void main(String[] args) {

		EmployeeDetails obj= new EmployeeDetails();
		obj.printEmployeeName("gowrishankar  ", 1101);
		obj.getEmployeeDetails("chennai");
		obj.printEmployeeSalary(425343.34);
		obj.printEmployeeMobileNumber(988504923);
		
	}

}
