package arraypractice;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String nameOfstudent[]= new String[5]; // index 0 to 4

		// Storing values in to array
//	  nameOfstudent[0] = "James";
//	  nameOfstudent[1] = "Abraham";
//	  nameOfstudent[2] = "Adil";
//	  nameOfstudent[3] = "Agernesh";

		// less time consuming away of inserting values
		String[] nameOfstudent = { "James", "Abraham", "Adil", "Agernesh" };

		// accessing array length
		System.out.println(nameOfstudent.length);

		// accessing array values

		// for loop
		for (int i = 0; i < nameOfstudent.length; i++) {
			System.out.print(nameOfstudent[i] + " ");

		}
		// for each
		for (String elt : nameOfstudent) {
			System.out.println(elt);
		}
	

	// while loop
	int j = 0;
	while( j < nameOfstudent.length) {
		System.out.println(nameOfstudent[j]);
		j++;
	}
	}
}
