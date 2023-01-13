package var_practice;

public class StaticVariableDemo {
	
	public static double salary;
	public static String dept = "Finance";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariableDemo.salary = 1000;
		System.out.println("Dept:" + StaticVariableDemo.dept);
		System.out.println("Salary:" + StaticVariableDemo.salary);
		
	

	}

}
