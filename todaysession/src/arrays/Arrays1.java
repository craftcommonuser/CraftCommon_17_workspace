package arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String studName [] = new String [20];
		studName [0] = "James";
		studName [1] = "Jimie";
		studName [2] = "Jhony";
		studName [3] = "Adam";
		
		
		studName [19] = "Belay";
		
		System.out.println (studName[0]);
		System.out.println (studName[1]);
		System.out.println (studName[2]);
		System.out.println (studName[3]);
		System.out.println (studName[19]);
		System.out.println (studName[4]);
		
//		for each loop;
		
		for (String elt:studName) {
			System.out.print(elt + " ");
			
//		for loop;
		
		for (int i=0; i<20; i++) {
			
		
		System.out.print(studName [i] + " ");
		}
		
	}

	}
}

