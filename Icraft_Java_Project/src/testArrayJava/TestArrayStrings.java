package testArrayJava;

public class TestArrayStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String [] schoolbag = new String[4];
		
		schoolbag[0] = "Books";
		schoolbag[1] = "Pens";
		schoolbag[2] = "Pencils";
		schoolbag[3] = "Notebooks";
		
		String[] schoolbag2 = {"Books", "Pens", "Pencils", "Notebooks"};
		int size = schoolbag2.length;
		System.out.println("The size of array is: " + size);
		for (int i =0; i < size; i ++) {
		System.out.print("index [" + i + "] = " + schoolbag2 [i]);
		System.out.print("\n");
	}
	}
}
