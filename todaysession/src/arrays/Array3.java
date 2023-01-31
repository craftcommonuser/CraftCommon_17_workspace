package arrays;

public class Array3 {

	public static void main(String[] args) {
		
		double studMark[] = {85.9,80,95,90,92,75,73,88,92,94};
		double total = 0, average;
		int len = studMark.length;
		for (int i = 0; i<len ; i++) {
			total += studMark[i];
		}
		average = total / (double) len;
		System.out.println ("total mark of student: " + total);
		System.out.println ("average mark of student: " + average);
		
		
	}

}
