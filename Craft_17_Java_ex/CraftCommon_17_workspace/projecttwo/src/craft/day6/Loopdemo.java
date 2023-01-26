package craft.day6;

public class Loopdemo {

	public static void main(String[] args) {
		
	// To Write a code that will print a number from 1 to 50.
		
int i = 1;

while(i<=50) {
	System.out.print(i +"");
i++;
}	
	
//do while loop
System.out.println();

int j = 1;
do {
	System.out.print(j + " ");
	j++;
}while(j<=50);

//for loop
System.out.println();
for(int k=1; k<=50; k++) {
	System.out.print(k + " ");
}
	}	
}