package arraypractice;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] studentMarks = {67,78,80,95,55,77,56};
		calcStudMark(studentMarks);
	}

	private static void calcStudMark(double [] marks) {
		// TODO Auto-generated method stub
		double sum = 0;
		double avg;
		
		// using for each
		// for (double elt: marks) {
		// sum = sum + elt
		
		// for loop
		for(int i=0; i<marks.length; i++) {
			sum = sum + marks[i];
	}
		avg = sum/marks.length;
		
		 System.out.println("Total mark of students: " + sum);
		 System.out.println("Average mark of students: " + avg);

	}
}
