package arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		double studMark [] = (85.5, 84, 75, 88, 82, 95, 93, 88, 87,97);
		
		double studsMark [][]= {
								 {85.5,84,75,88,82,95,93,88,87,97},
								 {85.5,84,73,80,82,95,93,88,87,97},
								 {85.5,84,75,88,82,95,93,77,87,78},
								 {77.5,84,75,75,75,84,93,88,77,76},
								 {78.5,84,85,88,82,95,75,88,87,97},

								};
		System.out.println(studsMark[1][9]);
		
		for (double elt [] : studsMark) {
			for (double Marks : elt) {
				System.out.print(Marks + " ");
				
				
			}
			System.out.println();
		}
		System.out.println ("\n");
		
		for (int i= 0; i<studsMark.length; i++) {
			for (int j =0; j<studsMark.length; j++) {
				System.out.print(studsMark [i][j] + " ");
				
			}
			System.out.println();
		}

}
}
