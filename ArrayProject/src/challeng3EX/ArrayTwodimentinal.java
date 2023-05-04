package challeng3EX;

public class ArrayTwodimentinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks [] [] = { {50,65,70},
				{55 ,68,75},
				{57,61,78},
				{59 ,60,71}};

		for(int i=0;i<marks.length;i++){
			//System.out.println("Student"+i +" ");
			for(int j=0;j<3;j++){
			   System.out.print(marks[i][j] + " ");
			}
			   System.out.println();
		}
		
	}

}
