package arraypractice;

public class MultiDimentionalLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int [][] = new int[2][4];
		
		int [][ ] a = {
				{1,2,3},
				{4,5,6,7},
				{8}
				};
		
	//         // calculate the length of each row
//        System.out.println("Length of row 1: " + a[0].length);
//        System.out.println("Length of row 2: " + a[1].length);
//        System.out.println("Length of row 3: " + a[2].length);			
	// }
		// for loop
//		for ( int i = 0; i < a.length; i++) {
//            for(int j = 0; j < a[i].length; ++j) {
//            	System.out.println(a[i][j]);
     //       }
     //   }
		
		//for each loop
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.println(data);
		
            }
            
        }
        
	}
	
}