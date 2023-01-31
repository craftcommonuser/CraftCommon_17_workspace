package EncapsulationDemo1;

public class MainDemoSetter {
	
	public static void main(String[] args) {
	
	setterStudent st = new setterStudent();
	st.setFirstName("Jamie");
	st.setLastName("Foxx");
	st.setAge(45);
	st.setCollage("Natural Science");
	
	
	System.out.println("Student first name: " + st.getFirstName());
	System.out.println("Student last name: " + st.getLastName());
	System.out.println("Student age: " + st.getAge());
	System.out.println("Student college: " +st. getCollage());
}

}