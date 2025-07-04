package basics;

public class EmpGroups extends Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees data = new EmpGroups();
		
		System.out.println("1. Employee Name: " + data.empNames[0] + ", " + "Employee ID: " + data.empId[0] );
		System.out.println("2. Employee Name: " + data.empNames[1] + ", " + "Employee ID: " + data.empId[1] );
		System.out.println("3. Employee Name: " + data.empNames[2] + ", " + "Employee ID: " + data.empId[2] );

	}

}
