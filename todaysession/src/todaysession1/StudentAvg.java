package todaysession1;

public class StudentAvg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] markOfStudent = { 70, 75.5, 80, 95, 60.4, 67, 78, 80, 95, 55, 77 };

		double sum = 0;
		double avg = 0;

//		for(double i:markOfStudent) 
//		{
//			sum = sum+i;
//		}

		for (int i = 0; i < markOfStudent.length; i++) {
			sum = sum + markOfStudent[i];
		}

		avg = sum / markOfStudent.length;

		System.out.println("The sum of Student mark is : " + sum);
		System.out.println("The average of student mark is : " + avg);

	}

}


