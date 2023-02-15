package encapsulations;

public class Maindemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation1 encap = new Encapsulation1();
		System.out.println("studentFullName:" + encap.getStudFirstName() + " " + encap.getStudLastName());
		System.out.println("Student Age: " + encap.getStudAge());
		System.out.println("Student Salary: " + encap.getStudSalary());
	}

}
