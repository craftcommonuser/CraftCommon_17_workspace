package workspace_one;

public class DENVER { //INSTANCE VARIABLE
	int age = 35;
	String fullName = "Elshaday";
	
	public void methodone() {
		char Gender ='f';
		System.out.println("the full name is:" + fullName);
		System.out.println("the age is:" + age);
		System.out.println("the gender is:" + Gender);
		
	}
	
	public static void main(String[] args) {
		DENVER D1 = new DENVER();
		D1.methodone();
	}
	
	
	

}
