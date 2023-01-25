package arraypractice;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] studentMarks = {67,78,80,95,55,77,56};
		
		double sum = 0;
		double avg;
		
		//using for loop
		
		//for(int i=0; int i<StudentMarks.length; i++) {
		//	sum = sum + StudentMarks[i]; 
		
		
		//using for each
		for (double elt: studentMarks) {
			sum += elt; //sum = sum + elt
		}
		avg = sum/studentMarks.length;
		
		 System.out.println("Total mark of students: " + sum);
		 System.out.println("Average mark of students: " + avg);
		 
	}

}
