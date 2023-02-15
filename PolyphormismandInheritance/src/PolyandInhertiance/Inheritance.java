package PolyandInhertiance;


class Employee{
	float salary = 5000;
}

class programmer extends Employee{
	
	double bonus = 1000;
	
}
public class Inheritance {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			programmer p = new programmer();
			
			
			System.out.println("Programmer Salary is: " + p.salary);
			System.out.print("Bonus of Programmer is: " + p.bonus);
					
	}

}
