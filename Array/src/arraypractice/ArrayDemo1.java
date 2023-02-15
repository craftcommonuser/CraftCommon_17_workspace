package arraypractice;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax
		// Datatype[] arrayName = new datatype[size];
		
		int[] ageOfstudent = new int[6]; // index from 0 - 87
		
		ageOfstudent[0] = 30;
		ageOfstudent[1] = 31;
		ageOfstudent[2] = 32;
		ageOfstudent[3] = 20;
		ageOfstudent[4] = 21;
		
//		System.out.println(ageOfstudent[0]);
//		System.out.println(ageOfstudent[1]);
//		System.out.println(ageOfstudent[2]);
		
		
		// for each statement for accessing array
		// Syntax 
		// for(datatype varName: arrayName){
		// System.out.println(varName);
		
		// for-each statement
		for(int elt: ageOfstudent) {
	//		System.out.println(elt);
			// to print sideways 
			System.out.print(elt + " ");
		}
	
	
	//for loop to access array
	for(int i=0; i<6; i++) {
		System.out.print(ageOfstudent[i] + " ");
		
	}
	}
}
